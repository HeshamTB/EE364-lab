package sample;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

/*
Using reference for flow panes:
    https://docs.oracle.com/javase/8/javafx/api/javafx/scene/layout/FlowPane.html
- H.B.
 */
public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {

        FlowPane root = new FlowPane(Orientation.HORIZONTAL);
        root.setColumnHalignment(HPos.LEFT);
        root.setHgap(10);
        root.setVgap(15);
        root.setMaxWidth(275);
        root.setPrefWrapLength(270);

        Label lFirstName = new Label("First name: ");
        lFirstName.setMnemonicParsing(true);// makes tab work or Alt+n
        TextField fFirstName = new TextField();
        lFirstName.setLabelFor(fFirstName);
        root.getChildren().addAll(lFirstName, fFirstName);
        primaryStage.setTitle("Create new account");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
