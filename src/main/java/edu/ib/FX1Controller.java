package edu.ib;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class FX1Controller {

    @FXML
    private Button btnCalculate;

    @FXML
    private TextField tfInput;

    @FXML
    private TextField tfOutput;

    @FXML
    void btnCalculatePresssed(ActionEvent event) {

        double input=Double.parseDouble(tfInput.getText());
        double output=2*input;
        tfOutput.setText(Double.toString(output));

    }

}

