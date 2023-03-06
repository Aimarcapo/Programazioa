package dambat;

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
    private void ponBat(){
        pantaila.setText(pantaila.getText() + "1");
    }

    @FXML
    private void ponBi(){
        pantaila.setText(pantaila.getText() + "2");
    }

    @FXML
    private void ponHiru(){
        pantaila.setText(pantaila.getText() + "3");
    }

    @FXML
    private void ponLau(){
        pantaila.setText(pantaila.getText() + "4");
    }

    @FXML
    private void ponBost(){
        pantaila.setText(pantaila.getText() + "5");
    }

    @FXML
    private void ponSei(){
        pantaila.setText(pantaila.getText() + "6");
    }

    @FXML
    private void ponZazpi(){
        pantaila.setText(pantaila.getText() + "7");
    }

    @FXML
    private void ponZortzi(){
        pantaila.setText(pantaila.getText() + "8");
    }

    @FXML
    private void ponBederatzi(){
        pantaila.setText(pantaila.getText() + "9");
    }

    @FXML
    private void ponZero(){
        pantaila.setText(pantaila.getText() + "0");
    }

    @FXML
    private void ponGei(){
        pantaila.setText(pantaila.getText() + " + ");
    }

    @FXML
    private void ponKen(){
        pantaila.setText(pantaila.getText() + " - ");
    }

    @FXML
    private void ponZati(){
        pantaila.setText(pantaila.getText() + " : ");
    }

    @FXML
    private void ponBider(){
        pantaila.setText(pantaila.getText() + " x ");
    }

    @FXML
    private void ponBarra(){
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