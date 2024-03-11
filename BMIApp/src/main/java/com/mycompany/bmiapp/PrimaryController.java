package com.mycompany.bmiapp;

import java.io.IOException;
import javafx.fxml.FXML;

public class PrimaryController {

    @FXML
    private void switchToSecondary() throws IOException {
        int a;
        int b;
        App.setRoot("secondary");
    }
}
