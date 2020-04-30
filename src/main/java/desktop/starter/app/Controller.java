package desktop.starter.app;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML private Label authLabel;
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        authLabel.setText(resources.getString("key2"));
    }

}

