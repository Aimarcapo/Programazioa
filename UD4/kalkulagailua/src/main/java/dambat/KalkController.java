package dambat;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class KalkController{

    @FXML
    Label labelEmaitza;

    @FXML
    TextField textFieldZenbBat;
    
    @FXML
    TextField textFieldZenbBi;

    @FXML
    Button buttonEragiketa;

    @FXML
    private void emaitzaErakutsi() {
        double zenbBat = Double.parseDouble(textFieldZenbBat.getText());
        double zenbBi = Double.parseDouble(textFieldZenbBi.getText());
        double gehiketa = zenbBat + zenbBi;
        double kenketa = zenbBat - zenbBi;
        double biderketa = zenbBat * zenbBi;
        int zatiketa = ((int)zenbBat) / ((int)zenbBi);
        double hondarra = zenbBat % zenbBi;
        switch (buttonEragiketa.getText()) {
            case "+":
                labelEmaitza.setText(String.valueOf(gehiketa));
                break;
            case "-":
                labelEmaitza.setText(String.valueOf(kenketa));
                break;
            case "x":
                labelEmaitza.setText(String.valueOf(biderketa));
                break;
            case ":":
                labelEmaitza.setText(String.valueOf(zatiketa) + " (Hondarra: " + String.valueOf(hondarra) + ")");
                break;
            default:
                labelEmaitza.setText("Errorea");
                break;
        }
    }

    @FXML
    private void eragiketaAldatu(){
        switch (buttonEragiketa.getText()) {
            case "+":
                buttonEragiketa.setText("-");
                break;
            case "-":
                buttonEragiketa.setText("x");
                break;
            case "x":
                buttonEragiketa.setText(":");
                break;
            case ":":
                buttonEragiketa.setText("+");
                break;
            default:
                break;
        }
    }
}