package dambat.controller;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class KalkulagailuNormala {

    @FXML
    Label pantaila;
    
    @FXML
    private void zatikiakErabili() throws IOException {
        App.setRoot("ZatikienKalkulagailua");
    }

    @FXML
    private void azterketaAukeratu() throws IOException {
        App.setRoot("AzterketaAukeratu");
    }

    @FXML
    private void idatziBat(){
        pantaila.setText(pantaila.getText() + "1");
    }

    @FXML
    private void idatziBi(){
        pantaila.setText(pantaila.getText() + "2");
    }

    @FXML
    private void idatziHiru(){
        pantaila.setText(pantaila.getText() + "3");
    }

    @FXML
    private void idatziLau(){
        pantaila.setText(pantaila.getText() + "4");
    }

    @FXML
    private void idatziBost(){
        pantaila.setText(pantaila.getText() + "5");
    }

    @FXML
    private void idatziSei(){
        pantaila.setText(pantaila.getText() + "6");
    }

    @FXML
    private void idatziZazpi(){
        pantaila.setText(pantaila.getText() + "7");
    }

    @FXML
    private void idatziZortzi(){
        pantaila.setText(pantaila.getText() + "8");
    }

    @FXML
    private void idatziBederatzi(){
        pantaila.setText(pantaila.getText() + "9");
    }

    @FXML
    private void idatziZero(){
        pantaila.setText(pantaila.getText() + "0");
    }

    @FXML
    private void idatziGei(){
        pantaila.setText(pantaila.getText() + " + ");
    }

    @FXML
    private void idatziKen(){
        pantaila.setText(pantaila.getText() + " - ");
    }

    @FXML
    private void idatziZati(){
        pantaila.setText(pantaila.getText() + " : ");
    }

    @FXML
    private void idatziBider(){
        pantaila.setText(pantaila.getText() + " x ");
    }

    @FXML
    private void ariketaEgin(){
        String[] eragiketa;

        eragiketa = pantaila.getText().split(" ");

        int znbk1 = Integer.parseInt(eragiketa[0]);
        int znbk2 = Integer.parseInt(eragiketa[2]);

        switch (eragiketa[1]) {
            case "+":
                pantaila.setText(String.valueOf(znbk1 + znbk2));
                break;
            case "-":
                pantaila.setText(String.valueOf(znbk1 - znbk2));
                break;
            case "x":
                pantaila.setText(String.valueOf(znbk1 * znbk2));
                break;
            case ":":
                pantaila.setText(String.valueOf(znbk1 / znbk2));
                break;
            default:
                pantaila.setText("Errorea");
                break;
        }
    }
}
