package com.Bashour.OptionMessagesFX.InputDialog;

import animatefx.animation.Shake;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.stage.Modality;
import javafx.stage.Stage;

public  class InputDialog {

    private Stage stage;
    AnchorPane anchorPane;
    private VBox vBox;
    private Label label;
    private HBox hBox;
    private JFXTextField enteredTextTxt;
    private HBox hBox0;
    private JFXButton cancleBtnA;
    private JFXButton okBtn;

    String enteredText = "";

    String header = "";
    String textFieldPromptText = "";
    String buttonPrimaryText = "";
    String buttonCancelText = "";
    String textFieldFocusColor = "";
    String textFieldUnFocusColor = "";
    String buttonsColor = "";
    String buttonsTextFillColor = "";

    public String getEnteredText() {
        return enteredText;
    }

    public void setEnteredText(String enteredText) {
        this.enteredText = enteredText;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getTextFieldPromptText() {
        return textFieldPromptText;
    }

    public void setTextFieldPromptText(String textFieldPromptText) {
        this.textFieldPromptText = textFieldPromptText;
    }

    public String getButtonPrimaryText() {
        return buttonPrimaryText;
    }

    public void setButtonPrimaryText(String buttonPrimaryText) {
        this.buttonPrimaryText = buttonPrimaryText;
    }

    public String getButtonCancelText() {
        return buttonCancelText;
    }

    public void setButtonCancelText(String buttonCancelText) {
        this.buttonCancelText = buttonCancelText;
    }

    public String getTextFieldFocusColor() {
        return textFieldFocusColor;
    }

    public void setTextFieldFocusColor(String textFieldFocusColor) {
        this.textFieldFocusColor = textFieldFocusColor;
    }

    public String getTextFieldUnFocusColor() {
        return textFieldUnFocusColor;
    }

    public void setTextFieldUnFocusColor(String textFieldUnFocusColor) {
        this.textFieldUnFocusColor = textFieldUnFocusColor;
    }

    public String getButtonsColor() {
        return buttonsColor;
    }

    public void setButtonsColor(String buttonsColor) {
        this.buttonsColor = buttonsColor;
    }

    public String getButtonsTextFillColor() {
        return buttonsTextFillColor;
    }

    public void setButtonsTextFillColor(String buttonsTextFillColor) {
        this.buttonsTextFillColor = buttonsTextFillColor;
    }

    public InputDialog() {

        setHeader("Attention !");
        setTextFieldPromptText("Enter the Text :");
        setButtonPrimaryText("OK");
        setButtonCancelText("Cancel");
        setTextFieldFocusColor("2262C6");
        setTextFieldUnFocusColor("#808080");
        setButtonsColor("#c3c3c3");
        setButtonsTextFillColor("#010101");
    }

    public InputDialog(String header, String textFieldPromptText) {
        this.header = header;
        this.textFieldPromptText = textFieldPromptText;

        setButtonPrimaryText("OK");
        setButtonCancelText("Cancel");
        setTextFieldFocusColor("2262C6");
        setTextFieldUnFocusColor("#808080");
        setButtonsColor("#c3c3c3");
        setButtonsTextFillColor("#010101");


    }

    public InputDialog(String header, String textFieldPromptText, String buttonPrimaryText, String buttonCancelText) {
        this.header = header;
        this.textFieldPromptText = textFieldPromptText;
        this.buttonPrimaryText = buttonPrimaryText;
        this.buttonCancelText = buttonCancelText;

        setTextFieldFocusColor("2262C6");
        setTextFieldUnFocusColor("#808080");
        setButtonsColor("#c3c3c3");
        setButtonsTextFillColor("#010101");
    }

    public InputDialog(String header, String textFieldPromptText, String buttonPrimaryText, String buttonCancelText, String textFieldFocusColor, String textFieldUnFocusColor) {
        this.header = header;
        this.textFieldPromptText = textFieldPromptText;
        this.buttonPrimaryText = buttonPrimaryText;
        this.buttonCancelText = buttonCancelText;
        this.textFieldFocusColor = textFieldFocusColor;
        this.textFieldUnFocusColor = textFieldUnFocusColor;

        setButtonsColor("#c3c3c3");
        setButtonsTextFillColor("#010101");
    }

    public InputDialog(String header, String textFieldPromptText, String buttonPrimaryText, String buttonCancelText, String textFieldFocusColor, String textFieldUnFocusColor, String buttonsColor, String buttonsTextFillColor) {
        this.header = header;
        this.textFieldPromptText = textFieldPromptText;
        this.buttonPrimaryText = buttonPrimaryText;
        this.buttonCancelText = buttonCancelText;
        this.textFieldFocusColor = textFieldFocusColor;
        this.textFieldUnFocusColor = textFieldUnFocusColor;
        this.buttonsColor = buttonsColor;
        this.buttonsTextFillColor = buttonsTextFillColor;
    }

    public String show(String header, String textFieldPromptText, String buttonPrimaryText, String buttonCancelText, String textFieldFocusColor, String textFieldUnFocusColor, String buttonsColor, String buttonsTextFillColor) {

        stage = new Stage();
        anchorPane = new AnchorPane();
        vBox = new VBox();
        label = new Label();
        hBox = new HBox();
        enteredTextTxt = new JFXTextField();
        hBox0 = new HBox();
        cancleBtnA = new JFXButton(buttonCancelText);
        okBtn = new JFXButton(buttonPrimaryText);


        enteredTextTxt.setPromptText(textFieldPromptText);

        anchorPane.setPrefHeight(169.0);
        anchorPane.setPrefWidth(428.0);

        anchorPane.setBottomAnchor(vBox, 0.0);
        anchorPane.setLeftAnchor(vBox, 0.0);
        anchorPane.setRightAnchor(vBox, 0.0);
        anchorPane.setTopAnchor(vBox, 0.0);
        vBox.setAlignment(Pos.TOP_LEFT);
        vBox.setLayoutX(175.0);
        vBox.setLayoutY(-31.0);
        vBox.setPrefHeight(169.0);
        vBox.setPrefWidth(474.0);

        label.setText(header);
        label.setFont(new Font(18.0));
        VBox.setMargin(label, new Insets(10.0));

        hBox.setAlignment(Pos.CENTER);
        hBox.setPrefHeight(52.0);
        hBox.setPrefWidth(474.0);
        VBox.setMargin(hBox, new Insets(15.0, 0.0, 0.0, 0.0));

        enteredTextTxt.setFont(new Font(15.0));
        enteredTextTxt.setAlignment(Pos.CENTER);
        enteredTextTxt.setFocusColor(Paint.valueOf(textFieldFocusColor)); //"#49bde3"
        enteredTextTxt.setUnFocusColor(Paint.valueOf(textFieldUnFocusColor)); //"#2262C6"
        enteredTextTxt.setLabelFloat(true);
        enteredTextTxt.setPrefSize(300, 35);

        hBox0.setAlignment(Pos.CENTER);
        hBox0.setPrefHeight(67.0);
        hBox0.setPrefWidth(474.0);
//        hBox0.getStylesheets().add("/css/OptionMessagesFX.css");

        okBtn.setStyle("-fx-background-color: "+buttonsColor+"; -fx-background-radius: 15px; -fx-text-fill: "+buttonsTextFillColor+";");
        cancleBtnA.setStyle("-fx-background-color: "+buttonsColor+"; -fx-background-radius: 15px; -fx-text-fill: "+buttonsTextFillColor+";");

        HBox.setMargin(cancleBtnA, new Insets(0.0, 10.0, 0.0, 20.0));

        okBtn.setLayoutX(373.0);
        okBtn.setLayoutY(23.0);

        okBtn.setPrefSize(80, 30);
        cancleBtnA.setPrefSize(80, 30);

        HBox.setMargin(okBtn, new Insets(0.0, 20.0, 0.0, 10.0));

        okBtn.setOnAction(event -> {
            enteredText = enteredTextTxt.getText();
            if (enteredText.equals("")){
                new Shake(enteredTextTxt).play();
            }else {
                Stage oldStage = (Stage) vBox.getScene().getWindow();
                oldStage.close();
            }
        });

        cancleBtnA.setOnAction(event -> {
            enteredText = "no";
            Stage oldStage = (Stage) vBox.getScene().getWindow();
            oldStage.close();
        });

        vBox.getChildren().add(label);
        hBox.getChildren().add(enteredTextTxt);
        vBox.getChildren().add(hBox);
        hBox0.getChildren().add(cancleBtnA);
        hBox0.getChildren().add(okBtn);
        vBox.getChildren().add(hBox0);
        anchorPane.getChildren().add(vBox);

        Scene scene = new Scene(anchorPane);

        stage.initModality(Modality.APPLICATION_MODAL);

        stage.setScene(scene);

        stage.showAndWait();

        return enteredText;
    }

    public String show() {

        stage = new Stage();
        anchorPane = new AnchorPane();
        vBox = new VBox();
        label = new Label();
        hBox = new HBox();
        enteredTextTxt = new JFXTextField();
        hBox0 = new HBox();
        cancleBtnA = new JFXButton(getButtonCancelText());
        okBtn = new JFXButton(getButtonPrimaryText());


        enteredTextTxt.setPromptText(getTextFieldPromptText());

        anchorPane.setPrefHeight(169.0);
        anchorPane.setPrefWidth(428.0);

        anchorPane.setBottomAnchor(vBox, 0.0);
        anchorPane.setLeftAnchor(vBox, 0.0);
        anchorPane.setRightAnchor(vBox, 0.0);
        anchorPane.setTopAnchor(vBox, 0.0);
        vBox.setAlignment(Pos.TOP_LEFT);
        vBox.setLayoutX(175.0);
        vBox.setLayoutY(-31.0);
        vBox.setPrefHeight(169.0);
        vBox.setPrefWidth(474.0);

        label.setText(getHeader());
        label.setFont(new Font(18.0));
        VBox.setMargin(label, new Insets(10.0));

        hBox.setAlignment(Pos.CENTER);
        hBox.setPrefHeight(52.0);
        hBox.setPrefWidth(474.0);
        VBox.setMargin(hBox, new Insets(15.0, 0.0, 0.0, 0.0));

        enteredTextTxt.setFont(new Font(15.0));
        enteredTextTxt.setAlignment(Pos.CENTER);
        enteredTextTxt.setFocusColor(Paint.valueOf(getTextFieldFocusColor())); //"#49bde3"
        enteredTextTxt.setUnFocusColor(Paint.valueOf(getTextFieldUnFocusColor())); //"#2262C6"
        enteredTextTxt.setLabelFloat(true);
        enteredTextTxt.setPrefSize(300, 35);

        hBox0.setAlignment(Pos.CENTER);
        hBox0.setPrefHeight(67.0);
        hBox0.setPrefWidth(474.0);
//        hBox0.getStylesheets().add("/css/OptionMessagesFX.css");

        okBtn.setStyle("-fx-background-color: "+getButtonsColor()+"; -fx-background-radius: 15px; -fx-text-fill: "+getButtonsTextFillColor()+";");
        cancleBtnA.setStyle("-fx-background-color: "+getButtonsColor()+"; -fx-background-radius: 15px; -fx-text-fill: "+getButtonsTextFillColor()+";");

        HBox.setMargin(cancleBtnA, new Insets(0.0, 10.0, 0.0, 20.0));

        okBtn.setLayoutX(373.0);
        okBtn.setLayoutY(23.0);

        okBtn.setPrefSize(80, 30);
        cancleBtnA.setPrefSize(80, 30);

        HBox.setMargin(okBtn, new Insets(0.0, 20.0, 0.0, 10.0));

        okBtn.setOnAction(event -> {
            enteredText = enteredTextTxt.getText();
            if (enteredText.equals("")){
                new Shake(enteredTextTxt).play();
            }else {
                Stage oldStage = (Stage) vBox.getScene().getWindow();
                oldStage.close();
            }
        });

        cancleBtnA.setOnAction(event -> {
            enteredText = "no";
            Stage oldStage = (Stage) vBox.getScene().getWindow();
            oldStage.close();
        });

        vBox.getChildren().add(label);
        hBox.getChildren().add(enteredTextTxt);
        vBox.getChildren().add(hBox);
        hBox0.getChildren().add(cancleBtnA);
        hBox0.getChildren().add(okBtn);
        vBox.getChildren().add(hBox0);
        anchorPane.getChildren().add(vBox);

        Scene scene = new Scene(anchorPane);

        stage.initModality(Modality.APPLICATION_MODAL);

        stage.setScene(scene);

        stage.showAndWait();

        return enteredText;
    }
}
