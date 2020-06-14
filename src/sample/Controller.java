package sample;

import com.Bashour.OptionMessagesFX.AlertMessage.AlertMessage;
import com.Bashour.OptionMessagesFX.ConfirmMessage.ConfirmMessage;
import com.Bashour.OptionMessagesFX.DialogMessage.DialogMessage;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    @FXML
    void alertMessageBtnAction(ActionEvent event) {

        new AlertMessage("Attention !", "Are you Sure??");
        new AlertMessage("Attention !", "Are you Sure??", "Close");
        new AlertMessage("Attention !", "Are you Sure??", "Close", "#C3C3C3");

        AlertMessage alertMessage = new AlertMessage();
        alertMessage.setHeaderText("header");
        alertMessage.setMessageText("message Text");
        alertMessage.setButtonsColor("#b1b1b1");
        alertMessage.setThirdButtonTxt("third 3");
        alertMessage.setImageSource("/img/warning-circle.png");
        alertMessage.setEnableShaking(true);
        alertMessage.showAlertMessage();
    }

    @FXML
    void confirmMessageBtnAction(ActionEvent event) {

        new ConfirmMessage("Attention !", "Constructor 1", "Yes", "No", "#ff0000", "#0f0fe2","White", "/img/warning-circle.png");
        new ConfirmMessage("Attention !", "Constructor 2", "Yes", "No", "#ff0000", "#0f0fe2","White");
        new ConfirmMessage("Attention !", "Constructor 3", "Yes", "No", "#ff0000", "#0f0fe2");
        new ConfirmMessage("Attention !", "Constructor 4", "Yes", "No");
        new ConfirmMessage("Attention !", "Constructor 5");

        ConfirmMessage confirmMessage = new ConfirmMessage();
        confirmMessage.setHeaderText("Header");
        confirmMessage.setMessageText("Constructor 6 (using the showConfirm() Method with setters and getters for the properties)");
        confirmMessage.setButton1Text("Button1");
        confirmMessage.setButton2Text("Button2");
        confirmMessage.setButton1Color("#767654");
        confirmMessage.setButton2Color("#234514");
        confirmMessage.setButtonTextFillColor("White");
        confirmMessage.setImageSource("/img/warning-circle.png");
        confirmMessage.setEnableBouncing(true);
        confirmMessage.showConfirm();

    }


    @FXML
    void dialogMessageBtnAction(ActionEvent event) {

        new DialogMessage("Attention !", "Are you Sure??");
        new DialogMessage("Attention !", "Are you Sure??", "White");
        new DialogMessage("Attention !", "Are you Sure??", "Blue", "/img/warning-triangle.png");

        DialogMessage dialogMessage = new DialogMessage();
        dialogMessage.setHeaderText("header");
        dialogMessage.setMessageText("message Text");
        dialogMessage.setButtonsColor("#b1b1b1");
        dialogMessage.setImageSource("/img/warning-circle.png");
        dialogMessage.setEnableShaking(true);
        dialogMessage.showDialogMessage();

    }


}
