package sample;

import com.Bashour.OptionMessagesFX.AlertMessage.AlertMessage;
import com.Bashour.OptionMessagesFX.ConfirmMessage.ConfirmMessage;
import com.Bashour.OptionMessagesFX.DialogMessage.DialogMessage;
import com.Bashour.OptionMessagesFX.InputDialog.InputDialog;
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
        alertMessage.show();
    }

    @FXML
    void confirmMessageBtnAction(ActionEvent event) {

        new ConfirmMessage("Attention !", "Constructor 5").show();
        new ConfirmMessage("Attention !", "Constructor 4", "Yes", "No").show();
        new ConfirmMessage("Attention !", "Constructor 3", "Yes", "No", "#ff0000", "#0f0fe2").show();
        new ConfirmMessage("Attention !", "Constructor 2", "Yes", "No", "#ff0000", "#0f0fe2","White").show();
        new ConfirmMessage("Attention !", "Constructor 1", "Yes", "No", "#ff0000", "#0f0fe2","White", "/img/warning-circle.png").show();

        ConfirmMessage confirmMessage6 = new ConfirmMessage();
        confirmMessage6.setHeaderText("Header");
        confirmMessage6.setMessageText("Constructor 6 (using the show() Method with setters and getters for the properties)");
        confirmMessage6.setButton1Text("Button1");
        confirmMessage6.setButton2Text("Button2");
        confirmMessage6.setButton1Color("#767654");
        confirmMessage6.setButton2Color("#234514");
        confirmMessage6.setButtonTextFillColor("White");
        confirmMessage6.setImageSource("/img/warning-circle.png");
        confirmMessage6.setEnableBouncing(true);
        confirmMessage6.show();

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
        dialogMessage.show();

    }



    @FXML
    void inputMessageBtnAction(ActionEvent event) {

        InputDialog inputDialog = new InputDialog();
        inputDialog.show("Header", "tfpt", "Ok", "Cancel", "#657854", "#983467", "#564719", "#ffffff");


        InputDialog inputDialog1 = new InputDialog("hello", "promptText", "OK", "Cancel", "#223344", "#123456");
        inputDialog1.setTextFieldFocusColor("#ff0000");
        inputDialog1.show();
    }



}
