package dambat.controller;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PrimaryController{

    @FXML
    Label labelEmaitza1;
    @FXML
    Label labelEmaitza2;

    @FXML
    TextField textFieldzenbakitzaile1;
    
    @FXML
    TextField textFieldizendatzaile1;
    @FXML
    TextField textFieldzenbakitzaile2;
    
    @FXML
    TextField textFieldizendatzaile2;

    @FXML
    Button buttonEmaitza;
    @FXML
    Button buttonEragiketa;

    @FXML
    private void emaitzaErakutsi() {
        double zenbakitzaile1 = Double.parseDouble(textFieldzenbakitzaile1.getText());
        double izendatzaile1 = Double.parseDouble(textFieldizendatzaile1.getText());
        double zenbakitzaile2 = Double.parseDouble(textFieldzenbakitzaile1.getText());
        double izendatzaile2 = Double.parseDouble(textFieldizendatzaile1.getText());
        double gehiketa1 = (zenbakitzaile1*izendatzaile2) + (zenbakitzaile2*izendatzaile1);
        double gehiketa2=izendatzaile1*izendatzaile2;
        double kenketa1 = (zenbakitzaile1*izendatzaile2) - (zenbakitzaile2*izendatzaile1);
        double kenketa2=izendatzaile1*izendatzaile2;
        double kenketa = zenbakitzaile1 - izendatzaile1;
        double biderketa1 = zenbakitzaile1 * zenbakitzaile2;
        double biderketa2=izendatzaile1*izendatzaile2;
        double zatiketa1 = zenbakitzaile1*izendatzaile2;
        double zatiketa2 = zenbakitzaile2*izendatzaile1;
       
        switch (buttonEragiketa.getText()) {
            case "+":
                labelEmaitza1.setText(String.valueOf(gehiketa1));
                labelEmaitza2.setText(String.valueOf(gehiketa2));
                break;
            case "-":
                labelEmaitza1.setText(String.valueOf(kenketa1));
                labelEmaitza2.setText(String.valueOf(kenketa2));

                break;
            case "x":
                labelEmaitza1.setText(String.valueOf(biderketa1));
                labelEmaitza2.setText(String.valueOf(biderketa2));
                break;
            case ":":
                labelEmaitza1.setText(String.valueOf(zatiketa1));
                labelEmaitza2.setText(String.valueOf(zatiketa2));
                break;
            default:
                labelEmaitza1.setText("Errorea");
                labelEmaitza2.setText("Errorea");
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