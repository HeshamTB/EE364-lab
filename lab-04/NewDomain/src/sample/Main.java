package sample;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.FileInputStream;

public class Main extends Application {

    private String[] suffixes = {".com", ".net", ".tv", ".org", ".gov", ".co", ".biz" };

    @Override
    public void start(Stage primaryStage) throws Exception{
        VBox root = new VBox();
        root.setPadding(new Insets(5));
        root.setAlignment(Pos.CENTER);

        Text txtDomain = new Text("Enter domain name to check it's availability");

        PaddedHBox boxNameSuffix = new PaddedHBox(new TextField(), new ComboBox<>(FXCollections.observableArrayList(suffixes)));

        FileInputStream stream = new FileInputStream("graphics/correct.png");
        Image img = new Image(stream);
        ImageView imgViewCorrect = new ImageView(img);
        PaddedHBox boxCorrect = new PaddedHBox(imgViewCorrect, new Text("Available"));

        Text txtExtra = new Text("Extra services: ");

        PaddedHBox[] checkBoxes = new PaddedHBox[3];
        checkBoxes[0] = new PaddedHBox(new CheckBox("Web site builder"));
        checkBoxes[1] = new PaddedHBox(new CheckBox("Web hosting"));
        checkBoxes[2] = new PaddedHBox(new CheckBox("Add E-mail"));

        Button btnOrder = new Button("Order");

        root.getChildren().addAll(txtDomain, boxNameSuffix, boxCorrect, txtExtra);
        for (Node node : checkBoxes) root.getChildren().add(node);
        root.getChildren().add(btnOrder);

        primaryStage.setTitle("New domain");
        primaryStage.setScene(new Scene(root, 300, 300));
        primaryStage.show();
    }

    private class PaddedHBox extends HBox {

        private final Insets STD_PADDING = new Insets(10);
        private final double STD_SPACING = 10;

        public PaddedHBox(){
            super();
            setSpacing(STD_SPACING);
            setPadding(STD_PADDING);
            setAlignment(Pos.CENTER);
        }

        public PaddedHBox(Node... nodes) {
            super(nodes);
            setSpacing(STD_SPACING);
            setPadding(STD_PADDING);
            setAlignment(Pos.CENTER);
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
