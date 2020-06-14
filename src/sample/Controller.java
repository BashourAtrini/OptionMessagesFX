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

//        new AlertMessage("Attention !", "Are you Sure??");
//        new AlertMessage("Attention !", "Are you Sure??", "Close");
//        new AlertMessage("Attention !", "Are you Sure??", "Close", "#C3C3C3");

        AlertMessage alertMessage = new AlertMessage();
        alertMessage.setHeaderText("header");
        alertMessage.setMessageText("message Text");
        alertMessage.setButtonsColor("#b1b1b1");
        alertMessage.setThirdButtonTxt("third 3");
        alertMessage.setImageSource("/img/warning-circle.png");
        alertMessage.showAlertMessage();
    }

}
