package dambat.controller;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class KalkulagailuaZatikiekin {

    @FXML
    Label pantaila;
    
    @FXML
    private void kalkulagailuNormala() throws IOException {
        App.setRoot("KalkulagailuOsoa");
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
    private void idatziBarra(){
        pantaila.setText(pantaila.getText() + "/");
    }

    @FXML
    private void ariketaEgin(){
        String[] eragiketa;

        eragiketa = pantaila.getText().split(" ");

        Zatikia zatikia1 = new Zatikia(eragiketa[0]);
        Zatikia zatikia2 = new Zatikia(eragiketa[2]);

        switch (eragiketa[1]) {
            case "+":
                pantaila.setText(String.valueOf(Zatikia.batu(zatikia1, zatikia2).sinplifikatu()) + " edo " + String.valueOf(Zatikia.batu(zatikia1, zatikia2).hamartarBaliokidea()));
                break;
            case "-":
                pantaila.setText(String.valueOf(Zatikia.kendu(zatikia1, zatikia2).sinplifikatu()) + " edo " + String.valueOf(Zatikia.kendu(zatikia1, zatikia2).hamartarBaliokidea()));
                break;
            case "x":
                pantaila.setText(String.valueOf(Zatikia.biderkatu(zatikia1, zatikia2).sinplifikatu()) + " edo " + String.valueOf(Zatikia.biderkatu(zatikia1, zatikia2).hamartarBaliokidea()));
                break;
            case ":":
            pantaila.setText(String.valueOf(Zatikia.zatitu(zatikia1, zatikia2).sinplifikatu()) + " edo " + String.valueOf(Zatikia.zatitu(zatikia1, zatikia2).hamartarBaliokidea()));
                break;
            default:
                pantaila.setText("Errorea");
                break;
        }
    }
}
