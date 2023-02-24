package dambat;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class KalkController {
    @FXML
    Label labelEmaitza;
    @FXML
    TextField textFieldZenbBat;
    @FXML
    TextField textFieldZenbBi;

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("primary");
    }
    @FXML
    private void emaitzaErakutsi() {
        int emaitza = Integer.parseInt(textFieldZenbBat) + Integer.parseInt(textFieldZenbBi);
        String.valueOf(emaitza);
        labelEmaitza.setText(emaitza);
      
        
    }
}
