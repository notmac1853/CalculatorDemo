package com.mycompany.week9_demo_simplecalc;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
    private TextField tf_Output;
    @FXML
    private Button btn_divide;
    @FXML
    private Button btn_multi;
    @FXML
    private Button btn_sub;
    @FXML
    private Button btn_equal;
    @FXML
    private Button btn_add;

    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }

    @FXML
    private void processDigit(ActionEvent event) {
    }

    @FXML
    private void processArithmeticOperation(ActionEvent event) {
    }
}
