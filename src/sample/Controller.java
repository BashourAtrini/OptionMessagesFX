package sample;

import com.OptionMessagesFX.AlertMessage.AlertMessage;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;

import java.awt.*;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {




    @Override
    public void initialize(URL location, ResourceBundle resources) {




    }

    @FXML
    void clickMeBtnAction(ActionEvent event) {

        AlertMessage alertMessage = new AlertMessage("hello", "bb");
        alertMessage.setHeaderText("gggggggggg");
        System.out.println();

    }

}
