<<<<<<< HEAD
package dambat;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
public class SecondaryController {
    @FXML
    Label labelZenbat;

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
    @FXML
    private void addZero(){
        System.out.println("Gehiago botoia sakatu duzu");
        System.out.println("Labelak balio hau dauka"+labelZenbat.getText());
        labelZenbat.setText(labelZenbat.getText()+0);
    }
=======
package dambat;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
public class SecondaryController {
    @FXML
    Label labelZenbat;

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
    @FXML
    private void addZero(){
        System.out.println("Gehiago botoia sakatu duzu");
        System.out.println("Labelak balio hau dauka"+labelZenbat.getText());
        labelZenbat.setText(labelZenbat.getText()+0);
    }
>>>>>>> 31d73d06e1ee81317bc65a0909a2e81e912b783f
}