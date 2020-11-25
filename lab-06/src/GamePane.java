import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class GamePane extends GridPane implements EventHandler<MouseEvent> {

    private Button btnExit;
    private Button btnRestart;
    private Button[][] btnGame;
    private boolean done;

    public GamePane(){
        setPadding(new Insets(5,5,5,5));
        //setVgap(5);
        //setHgap(5);
        setAlignment(Pos.CENTER);
        //setMinSize(400, 200);
        makeButtons();
    }

    @Override
    public void handle(MouseEvent mouseEvent) {
        if (mouseEvent.getSource() instanceof Button){
            Button pressedButton = (Button) mouseEvent.getSource();
            if (pressedButton.getText().equalsIgnoreCase("-")){
                pressedButton.setText("X");
                play();
                try {
                    checkWin();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void restart() {
        System.out.println("Starting new game");
        for (int i = 0; i < btnGame.length; i++) {
            //Element
            for (int j = 0; j < btnGame[i].length; j++) {
                btnGame[i][j].setText("-");
            }
        }
        done = false;
    }

    private void play() {
        /*
        From the example application, it seems the 'CPU' is not playing a 'smart' game.
        To me it seems random. For now, 'CPU' plays a random move, however, this seems
        like a great problem to tackle and make the play() 'smart'.
        - H.B.
         */
        boolean played = false;
        while (!played && hasEmpty()){
            int x = getRandom(0,3);
            int y = getRandom(0,3);
            Button btn = btnGame[y][x];
            if (btn.getText().equalsIgnoreCase("-")) {
                btn.setText("O");
                played = true;
            }
        }
    }

    private void checkWin() throws Exception {
        //check horizontal
        for (int i = 0; i < 3; i++){
            int xCount = 0;
            int oCount = 0;
            for (int j = 0; j < 3; j++) {
                if (btnGame[i][j].getText().equalsIgnoreCase("X")) xCount++;
                else if (btnGame[i][j].getText().equalsIgnoreCase("O")) oCount++;
            }
            if (xCount == 3 && !done) {
                announceWin(Player.HUMAN);
            } else if (oCount == 3 && !done) {
                announceWin(Player.CPU);
            }
        }

        //check vertical
        for (int i = 0; i < 3; i++){
            int xCount = 0;
            int oCount = 0;
            for (int j = 0; j < 3; j++) {
                if (btnGame[j][i].getText().equalsIgnoreCase("X")) xCount++;
                else if (btnGame[j][i].getText().equalsIgnoreCase("O")) oCount++;
            }
            if (xCount == 3 && !done) {
                announceWin(Player.HUMAN);
            }
            else if (oCount == 3 && !done) {
                announceWin(Player.CPU);
            }
        }

        //First diagonal
        for (int i = 0; i < 3; i++) {
            int xCount = 0;
            int oCount = 0;
            if (btnGame[i][i].getText().equalsIgnoreCase("X")) xCount++;
            else if (btnGame[i][i].getText().equalsIgnoreCase("O")) oCount++;
            if (xCount == 3 && !done) {
                announceWin(Player.HUMAN);
            }
            else if (oCount == 3 && !done){
                announceWin(Player.CPU);
            }
        }

        //Second diagonal
        for (int i = 0; i < 3; i++) {
            int xCount = 0;
            int oCount = 0;
            if (btnGame[2-i][i].getText().equalsIgnoreCase("X")) xCount++;
            else if (btnGame[2-i][i].getText().equalsIgnoreCase("O")) oCount++;
            if (xCount == 3 && !done){
                announceWin(Player.HUMAN);
            }
            else if (oCount == 3 && !done){
                announceWin(Player.CPU);
            }
        }
    }

    private void announceWin(Player player) throws Exception {
        done = true;
        WinDialog w = new WinDialog(player);
        w.start(new Stage());
    }

    private void makeButtons() {
        btnExit = new Button("Exit");
        btnExit.setOnMouseClicked(e -> System.exit(0));
        btnExit.setPrefSize(80,80);

        btnRestart = new Button("New\nGame");
        btnRestart.setOnMouseClicked(e -> restart());
        btnRestart.setPrefSize(80,80);

        btnGame = new Button[3][3];
        //Rows
        for (int i = 0; i < btnGame.length; i++) {
            //Element
            for (int j = 0; j < btnGame[i].length; j++) {
                btnGame[i][j] = new Button("-");
                btnGame[i][j].setOnMouseClicked(this);
                btnGame[i][j].setPrefSize(80,80);
                add(btnGame[i][j], i, j);
            }
        }
        add(btnRestart, 0,btnGame.length+1 );
        add(btnExit, 1,btnGame.length+1);
    }

    private int getRandom(double min, double max) {
        return (int)(Math.random() * (max - min) + min);
    }

    private boolean hasEmpty() {
        for (Button[] btnRow : btnGame)
            for (Button btn : btnRow)
                if (btn.getText().equalsIgnoreCase("-"))
                    return true;
        return false;
    }

    private enum Player {
        HUMAN,
        CPU
    }

    private static class WinDialog extends Application {

        private final Player winner;

        public WinDialog(Player player){
            this.winner = player;
        }

        @Override
        public void start(Stage stage) throws Exception {
            VBox root = new VBox();
            root.setAlignment(Pos.CENTER);
            root.setPadding(new Insets(15,15,15,15));
            root.setSpacing(10);
            Button btn = new Button("OK");
            btn.setOnMouseClicked(e -> {
                stage.close();
                System.out.println("[Dialog] Exit button clicked");
            });

            root.getChildren().add(new Text(this.winner.name() + " won!"));
            root.getChildren().add(btn);
            stage.setScene(new Scene(root,200,100));
            stage.show();
        }
    }
}
