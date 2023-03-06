package dambat.controller;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class AzterketaNormala {
    
    @FXML
    Label kontagailuaLabel;

    @FXML
    Label znbk1;

    @FXML
    Label znbk2;

    @FXML
    Label eragiketa;

    @FXML
    TextField emaitza;

    @FXML
    Label zuzenketarenErantzuna;

    int kontagailua = 1;
    int ariketakOndo = 0;
    
    @FXML
    private void kalkulagailuNormala() throws IOException {
        App.setRoot("KalkulagailuOsoa");
    }

    @FXML
    private void kalkulagailuaZatikia() throws IOException {
        App.setRoot("ZatikienKalkulagailua");
    }

    @FXML
    private void zuzendu(){
        double zenb1 = Double.parseDouble(znbk1.getText());
        double zenb2 = Double.parseDouble(znbk2.getText());
        double erabiltzailearenErantzuna = Double.parseDouble(emaitza.getText());

        double gehiketa = zenb1 + zenb2;
        double kenketa = zenb1 - zenb2;
        double biderketa = zenb1 * zenb2;
        int zatiketa = ((int)zenb1) / ((int)zenb2);

        Boolean erantzunaOndo = false;

        switch (eragiketa.getText()) {
            case "+":
                if(erabiltzailearenErantzuna == gehiketa){
                    erantzunaOndo = true;
                }
                break;
            case "-":
                if(erabiltzailearenErantzuna == kenketa){
                    erantzunaOndo = true;
                }
                break;
            case "x":
                if(erabiltzailearenErantzuna == biderketa){
                    erantzunaOndo = true;
                }
                break;
            case ":":
                if(erabiltzailearenErantzuna == zatiketa){
                    erantzunaOndo = true;
                }
                break;
            default:
                zuzenketarenErantzuna.setText("Erantzuna DESEGOKIA");
                break;
        }

        if(erantzunaOndo){
            ariketakOndo++;
        }        
    }

    @FXML
    private void ausazkoAriketa(){
        String[] eragiketaIkurrak = {"+", "-", "x", ":"};
        kontagailua++;

        int zenbakia = (int)(Math.random()*10+1);
        znbk1.setText(String.valueOf(zenbakia));

        eragiketa.setText(eragiketaIkurrak[(int)(Math.random()*4)]);

        zenbakia = (int)(Math.random()*10+1);
        znbk2.setText(String.valueOf(zenbakia));

        if(kontagailua == 11){
            zuzenketarenErantzuna.setText("Nota: " + ariketakOndo + "/10");
        }

        kontagailuaLabel.setText("Galdera: " + kontagailua + "/10");
    }

    @FXML
    private void zuzenduEtaAldatu(){
        zuzendu();
        ausazkoAriketa();
    }
}
