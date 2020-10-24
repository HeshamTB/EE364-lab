package sample;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.geometry.*;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/*
Using reference for flow panes:
    https://docs.oracle.com/javase/8/javafx/api/javafx/scene/layout/FlowPane.html
- H.B.
 */
public class Main extends Application {

    private String[] Countries = {"Afghanistan","Albania","Andorra","Argentina","Armenia","Bangladesh",
            "Barbados","Belgium","Belize","Benin","Burkina","Cameroon","Colombia","Costa Rica","Egypt",
            "Fiji","France","Gambia","Guatemala","Iceland","India","Italy","Jamaica","Korea South","Kosovo",
            "Kyrgyzstan","Libya","Liechtenstein","Malawi","Mexico","Micronesia","Moldova","Monaco","Morocco",
            "Namibia","Netherlands","Oman","Pakistan","Philippines","Russia","Samoa","Saudi Arabia","Serbia",
            "Seychelles","Sierra Leone","Suriname","Switzerland","Syria","Tanzania","Tunisia","Turkey","Uganda",
            "Vietnam","Yemen"};

    @Override
    public void start(Stage primaryStage) {

        FlowPane root = new FlowPane(Orientation.HORIZONTAL);
        root.setColumnHalignment(HPos.CENTER);
        root.setRowValignment(VPos.CENTER);
        root.setHgap(10);
        root.setVgap(5);
        root.setMaxWidth(270);
        root.setPrefWrapLength(250);

        //Panes (HBoxes)
        HBox boxFirstName = makeLebelWithText("First name: ");
        HBox boxLasttName = makeLebelWithText("Last name: ");
        HBox boxPassword = makeLebelWithText("Enter password");
        HBox boxRePass = makeLebelWithText("Reenter password: ");
        HBox boxCity = makeLebelWithText("City");
        HBox boxCountry = makeComboBoxWithLabel("Choose a country: ");
        HBox boxButtons = makeButtons();

        root.getChildren().addAll(boxFirstName,
                boxLasttName,
                boxPassword,
                boxRePass,
                boxCountry,
                boxCity,
                boxButtons);

        primaryStage.setTitle("Create new account");
        primaryStage.setScene(new Scene(root, 285, 350));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }

    private HBox makeLebelWithText(String labelText){
        HBox node = new HBox();
        node.setPadding(new Insets(10));
        node.setSpacing(10);
        Label label = new Label(labelText);
        TextField textField = new TextField();
        node.getChildren().addAll(label, textField);
        return node;
    }

    private HBox makeComboBoxWithLabel(String labelText) {
        HBox node = new HBox();
        node.setPadding(new Insets(10));
        node.setSpacing(10);
        Label label = new Label(labelText);
        node.getChildren().addAll(label, new ComboBox<>(FXCollections.observableArrayList(Countries)));
        return node;
    }

    private HBox makeButtons(){
        HBox node = new HBox();
        node.setPadding(new Insets(10));
        node.setSpacing(10);
        node.setAlignment(Pos.CENTER);
        Button bClear = new Button("Clear");
        Button bRegister = new Button("Register");
        bClear.setPrefSize(100, 20);
        bRegister.setPrefSize(100, 20);
        node.getChildren().addAll(bClear,bRegister);
        return node;
    }

}
