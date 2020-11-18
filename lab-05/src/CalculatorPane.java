import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.paint.Paint;

import java.util.ArrayList;
import java.util.List;

public class CalculatorPane extends VBox implements EventHandler<MouseEvent> {

    private Button[] btnList;
    private TextField ioField;

    private boolean subtracting;

    private int firstOperand;


    public CalculatorPane(){
        setSpacing(15);
        setPadding(new Insets(10));
        ioField = new TextField();
        ioField.setPrefColumnCount(15);
        ioField.setEditable(false);
        ioField.setText("");
        ioField.setPrefHeight(15);
        constructButtons();
    }


    private void calculateAndDisplay() {
        if (subtracting) {
            display(String.valueOf(firstOperand - Integer.parseInt(ioField.getText())));
            subtracting = false;
        }
        else display(String.valueOf(firstOperand+Integer.parseInt(ioField.getText())));
    }

    private void clear() {
        this.firstOperand = 0;
        ioField.setText("");
        subtracting = false; //defualt to adding
    }

    private void add() {
        firstOperand = Integer.parseInt(ioField.getText());
        subtracting = false;
    }

    private void subtract() {
        firstOperand = Integer.parseInt(ioField.getText());
        subtracting = true;
    }

    private void display(String result) {
        ioField.setText(result);
    }

    //Handle all number buttons
    @Override
    public void handle(MouseEvent mouseEvent) {
        int pressedBtn = 0;
        for (int i = 0; i < btnList.length; i++) {
            if (btnList[i] == mouseEvent.getSource()){
                pressedBtn = i;
            }
        }
        System.out.println(mouseEvent.getSource() + "Clicked");
        if (firstOperand == 0) {
            //if there is no op yet, append to io.
            ioField.setText(ioField.getText()+ pressedBtn);
        }
        else {
            //TODO: removes prev digit. (cant place 2 or more digits for second operand.
            ioField.setText(String.valueOf(pressedBtn));
        }
    }

    private void constructButtons(){
        btnList = new Button[14];
        btnList[Buttons.ZERO] = new Button("0");//Index 0
        btnList[Buttons.ONE] = new Button("1");//Index 1
        btnList[Buttons.TWO] = new Button("2");// ...
        btnList[Buttons.THREE] = new Button("3");
        btnList[Buttons.FOUR] = new Button("4");
        btnList[Buttons.FIVE] = new Button("5");
        btnList[Buttons.SIX] = new Button("6");
        btnList[Buttons.SEVEN] = new Button("7");
        btnList[Buttons.EIGHT] = new Button("8");
        btnList[Buttons.NINE] = new Button("9");
        btnList[Buttons.PLUS] = new Button("+");
        btnList[Buttons.MINUS] = new Button("-");
        btnList[Buttons.EQUAL] = new Button("=");
        btnList[Buttons.CLEAR] = new Button("C");//Index 14
        for (Button btn : btnList){
            btn.setPrefSize(50,50);
            btn.setOnMouseClicked(this);
        }

        //set Event handlers for op buttons
        btnList[Buttons.CLEAR].setOnMouseClicked(e-> clear());
        btnList[Buttons.PLUS].setOnMouseClicked(e -> add());
        btnList[Buttons.MINUS].setOnMouseClicked(e -> subtract());
        btnList[Buttons.EQUAL].setOnMouseClicked(e -> calculateAndDisplay());

        HBox firstRow = new HBox();
        HBox secondRow = new HBox();
        HBox thirdRow = new HBox();
        HBox fourthRow = new HBox();
        HBox fifthRow = new HBox();
        firstRow.setSpacing(20);
        firstRow.setAlignment(Pos.CENTER);
        secondRow.setSpacing(20);
        secondRow.setAlignment(Pos.CENTER);
        thirdRow.setSpacing(20);
        thirdRow.setAlignment(Pos.CENTER);
        fourthRow.setSpacing(20);
        fourthRow.setAlignment(Pos.CENTER);
        fifthRow.setSpacing(20);
        fifthRow.setAlignment(Pos.CENTER);

        firstRow.getChildren().addAll(
                btnList[Buttons.ONE], btnList[Buttons.TWO], btnList[Buttons.THREE]
        );
        secondRow.getChildren().addAll(
                btnList[Buttons.FOUR], btnList[Buttons.FIVE], btnList[Buttons.SIX]
        );
        thirdRow.getChildren().addAll(
                btnList[Buttons.SEVEN], btnList[Buttons.EIGHT], btnList[Buttons.NINE]
        );
        fourthRow.getChildren().addAll(
                btnList[Buttons.PLUS], btnList[Buttons.MINUS], btnList[Buttons.ZERO]
        );
        fifthRow.getChildren().addAll(
                btnList[Buttons.EQUAL], btnList[Buttons.CLEAR]
        );
        getChildren().addAll(ioField, firstRow, secondRow, thirdRow, fourthRow, fifthRow);
    }

    private final class Buttons {
        public final static int ZERO = 0;
        public final static int ONE = 1;
        public final static int TWO = 2;
        public final static int THREE = 3;
        public final static int FOUR = 4;
        public final static int FIVE = 5;
        public final static int SIX = 6;
        public final static int SEVEN = 7;
        public final static int EIGHT = 8;
        public final static int NINE = 9;
        public final static int PLUS = 10;
        public final static int MINUS = 11;
        public final static int EQUAL = 12;
        public final static int CLEAR = 13;
    }
}
