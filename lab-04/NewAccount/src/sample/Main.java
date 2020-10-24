package sample;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.VPos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
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
        root.setVgap(15);
        root.setMaxWidth(270);
        root.setPrefWrapLength(250);

        //Labels
        Label lFirstName = new Label("First name: ");
        Label lLasttName = new Label("Last name: ");
        Label lPassword = new Label("Enter password: ");
        Label lRePass = new Label("Reenter password: ");
        Label lCity = new Label("City: ");
        Label lCountry = new Label("Choose a counrty: ");

        //Set mnemonic
        lFirstName.setMnemonicParsing(true);// makes tab work or Alt+n
        lLasttName.setMnemonicParsing(true);
        lPassword.setMnemonicParsing(true);
        lRePass.setMnemonicParsing(true);
        lCity.setMnemonicParsing(true);

        //Text fields
        TextField fFirstName = new TextField();
        TextField fLastName = new TextField();
        TextField fPassword = new TextField();
        TextField fRepass = new TextField();
        TextField fCity = new TextField();

        ComboBox<String> comCountry = new ComboBox<>(FXCollections.observableArrayList(Countries));

        root.getChildren().addAll(lFirstName, fFirstName,
                lLasttName, fLastName,
                lPassword, fPassword,
                lRePass, fRepass,
                lCountry, comCountry,
                lCity, fCity);
        primaryStage.setTitle("Create new account");
        primaryStage.setScene(new Scene(root, 285, 300));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }

    private Node makeLebelWithText(String labelText){
        HBox node = new HBox();
        node.setPadding(new Insets(10));
        node.setSpacing(10);
        Label label = new Label(labelText);
        TextField textField = new TextField();
        node.getChildren().addAll(label, textField);
        return node;
    }

    private Node makeComboBoxWithLabel(String labelText) {
        HBox node = new HBox();
        node.setPadding(new Insets(10));
        node.setSpacing(10);
        Label label = new Label(labelText);
        node.getChildren().addAll(label, new ComboBox<>(FXCollections.observableArrayList(Countries)));
        return node;
    }

}
