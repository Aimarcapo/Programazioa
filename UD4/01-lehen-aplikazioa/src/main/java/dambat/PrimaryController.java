<<<<<<< HEAD
package dambat;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class PrimaryController {

    @FXML Label labelVar;
    int euroak = 1;
    

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }

    @FXML
    private void gehituEuroak() throws IOException {
        if(euroak == 1){
            labelVar.setText("Zenbat euro nahi dituzu? " + euroak);
            euroak();
        }
        else{
            labelVar.setText("Zenbat euro nahi dituzu? " + euroak);
            euroak();
        }
    }

    private int euroak(){
        return euroak *= 10;  
    }

}
=======
package dambat;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class PrimaryController {

    @FXML Label labelVar;
    int euroak = 1;
    

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }

    @FXML
    private void gehituEuroak() throws IOException {
        if(euroak == 1){
            labelVar.setText("Zenbat euro nahi dituzu? " + euroak);
            euroak();
        }
        else{
            labelVar.setText("Zenbat euro nahi dituzu? " + euroak);
            euroak();
        }
    }

    private int euroak(){
        return euroak *= 10;  
    }

}
>>>>>>> 31d73d06e1ee81317bc65a0909a2e81e912b783f
