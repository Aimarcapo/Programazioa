package dambat;

import java.io.IOException;

import javafx.fxml.FXML;

public class AukeratuAzterketa {
    
    @FXML
    private void azterketaNormalaEgin() throws IOException {
        App.setRoot("AzterketaNormala");
    }

    @FXML
    private void azterketaZatikiaEgin() throws IOException {
        App.setRoot("AzterketaZatikia");
    }
}
