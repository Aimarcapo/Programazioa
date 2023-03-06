package dambat;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class AzterketaZatikia {

    @FXML
    Label kontagailuaLabel;

    @FXML
    Label izendatzailea1;

    @FXML
    Label zenbakitzailea1;

    @FXML
    Label izendatzailea2;

    @FXML
    Label zenbakitzailea2;

    @FXML
    Label eragiketa;

    @FXML
    TextField izendatzaileEmaitza;

    @FXML
    TextField zenbakitzaileEmaitza;

    @FXML
    Label zuzenketarenErantzuna;

    int kontagailua = 0;
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
        Zatikia zatikia1 = new Zatikia(Integer.parseInt(zenbakitzailea1.getText()), Integer.parseInt(izendatzailea1.getText()));
        Zatikia zatikia2 = new Zatikia(Integer.parseInt(zenbakitzailea2.getText()), Integer.parseInt(izendatzailea2.getText()));
        Zatikia zatikiEmaitza = new Zatikia(Integer.parseInt(zenbakitzaileEmaitza.getText()), Integer.parseInt(izendatzaileEmaitza.getText()));

        Zatikia gehiketa = Zatikia.batu(zatikia1, zatikia2);
        Zatikia kenketa = Zatikia.kendu(zatikia1, zatikia2);
        Zatikia biderketa = Zatikia.biderkatu(zatikia1, zatikia2);
        Zatikia zatiketa = Zatikia.zatitu(zatikia1, zatikia2);

        Boolean erantzunaOndo = false;

        switch (eragiketa.getText()) {
            case "+":
                if(zatikiEmaitza.hamartarBaliokidea() == gehiketa.hamartarBaliokidea()){
                    erantzunaOndo = true;
                }
                break;
            case "-":
                if(zatikiEmaitza.hamartarBaliokidea() == kenketa.hamartarBaliokidea()){
                    erantzunaOndo = true;
                }
                break;
            case "x":
                if(zatikiEmaitza.hamartarBaliokidea() == biderketa.hamartarBaliokidea()){
                    erantzunaOndo = true;
                }
                break;
            case ":":
                if(zatikiEmaitza.hamartarBaliokidea() == zatiketa.hamartarBaliokidea()){
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

        int zenbakia = (int)(Math.random()*15+1);
        izendatzailea1.setText(String.valueOf(zenbakia));
        zenbakia = (int)(Math.random()*15+1);
        zenbakitzailea1.setText(String.valueOf(zenbakia));

        eragiketa.setText(eragiketaIkurrak[(int)(Math.random()*4)]);

        zenbakia = (int)(Math.random()*15+1);
        izendatzailea2.setText(String.valueOf(zenbakia));
        zenbakia = (int)(Math.random()*15+1);
        zenbakitzailea2.setText(String.valueOf(zenbakia));

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

    @FXML
    protected void initialize(){
        ausazkoAriketa();
    }
}