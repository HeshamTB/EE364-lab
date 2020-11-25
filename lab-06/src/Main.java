import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        GamePane game = new GamePane();
        stage.setScene(new Scene(game));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
