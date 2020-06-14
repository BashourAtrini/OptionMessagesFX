package com.Bashour.OptionMessagesFX.DialogMessage;

import animatefx.animation.BounceIn;
import animatefx.animation.BounceOut;
import animatefx.animation.Shake;
import com.jfoenix.controls.JFXButton;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class DialogMessage {

    AnchorPane  anchorPane;

    private VBox vBox;
    private HBox hBox;
    private VBox vBox0;
    private ImageView imageView;
    private Label label;
    private Label messageTxt;
    private HBox hBox0;
    private JFXButton okBtn;


    private Stage stage;

    static String buttonAnswer;

    String buttonsColor = "";

    String headerText= "";

    String messageText = "";

    String imageSource = "";

    boolean enableBouncing = false;
    boolean enableShaking = false;

    public boolean isEnableBouncing() {
        return enableBouncing;
    }

    public void setEnableBouncing(boolean enableBouncing) {
        this.enableBouncing = enableBouncing;
    }

    public boolean isEnableShaking() {
        return enableShaking;
    }

    public void setEnableShaking(boolean enableShaking) {
        this.enableShaking = enableShaking;
    }

    public String getImageSource() {
        return imageSource;
    }

    public void setImageSource(String imageSource) {
        this.imageSource = imageSource;
    }

    public String getHeaderText() {
        return headerText;
    }

    public void setHeaderText(String headerText) {
        this.headerText = headerText;
    }

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    public String getButtonsColor() {
        return buttonsColor;
    }

    public void setButtonsColor(String buttonsColor) {
        this.buttonsColor = buttonsColor;
    }

    public DialogMessage(){

    }

    public DialogMessage(String headerText, String messageText){
        super();

        this.headerText = headerText;
        this.messageText = messageText;

        if (imageSource.isEmpty() && buttonsColor.isEmpty()) {
            showDialogMessage(headerText, messageText, "#c3c3c3", "/img/warning-triangle.png");
        }else{
            showDialogMessage(headerText, messageText, getButtonsColor(), getImageSource());
        }



    }



    public DialogMessage(String headerText, String messageText, String buttonsColor){
        super();
        this.headerText = headerText;
        this.messageText = messageText;
        this.buttonsColor = buttonsColor;

        if (imageSource.isEmpty()) {
            showDialogMessage(headerText, messageText, buttonsColor, "/img/warning-triangle.png");
        }else{
            showDialogMessage(headerText, messageText, buttonsColor, getImageSource());
        }
    }

    public DialogMessage(String headerText, String messageText, String buttonsColor, String imageSource){
        super();
        this.headerText = headerText;
        this.messageText = messageText;
        this.buttonsColor = buttonsColor;

        showDialogMessage(headerText, messageText, buttonsColor, imageSource);
    }


    public String showDialogMessage(String headerText, String messageTextVar, String buttonsColor, String imageSource){
         stage = new Stage();

         anchorPane = new AnchorPane();

        vBox = new VBox();
        hBox = new HBox();
        vBox0 = new VBox();
        imageView = new ImageView();
        label = new Label();
        messageTxt = new Label();
        hBox0 = new HBox();
        okBtn = new JFXButton("OK");


        anchorPane.setPrefHeight(148.0);
        anchorPane.setPrefWidth(432.0);

        okBtn.setPrefSize(60.0, 30);

        hBox.setStyle("-fx-background-color:  #e2e2e2");

        stage.setAlwaysOnTop(true);


        anchorPane.setBottomAnchor(vBox, 0.0);
        anchorPane.setLeftAnchor(vBox, 0.0);
        anchorPane.setRightAnchor(vBox, 0.0);
        anchorPane.setTopAnchor(vBox, 0.0);
        vBox.setAlignment(Pos.TOP_LEFT);
        vBox.setLayoutX(158.0);
        vBox.setLayoutY(-33.0);
        vBox.setPrefHeight(167.0);
        vBox.setPrefWidth(432.0);

        hBox.setAlignment(Pos.TOP_LEFT);
        hBox.setPrefHeight(41.0);
        hBox.setPrefWidth(432.0);

        HBox.setHgrow(vBox0, javafx.scene.layout.Priority.ALWAYS);
        vBox0.setAlignment(Pos.CENTER_RIGHT);
        vBox0.setPrefHeight(200.0);
        vBox0.setPrefWidth(383.0);

        imageView.setFitHeight(45.0);
        imageView.setFitWidth(55.0);
        imageView.setPickOnBounds(true);
        imageView.setPreserveRatio(true);
        VBox.setMargin(imageView, new Insets(5.0, 5.0, 5.0, 10.0));

        imageView.setImage(new Image(DialogMessage.class.getResource(imageSource).toExternalForm()));

        label.setAlignment(Pos.CENTER_LEFT);
        label.setPrefHeight(50.0);
        label.setPrefWidth(338.0);
        label.setText(headerText);
        label.setFont(new Font(18.0));
        HBox.setMargin(label, new Insets(0.0, 5.0, 0.0, 10.0));
        VBox.setMargin(hBox, new Insets(0.0, 0.0, 10.0, 0.0));

        messageTxt.setAlignment(Pos.CENTER_LEFT);
        messageTxt.setText(messageTextVar);
        messageTxt.setFont(new Font(15.0));
        VBox.setMargin(messageTxt, new Insets(0.0, 10.0, 20.0, 15.0));

        hBox0.setAlignment(Pos.CENTER);
        VBox.setMargin(hBox0, new Insets(0.0, 15.0, 10.0, 0.0));


        okBtn.setLayoutX(346.0);
        okBtn.setLayoutY(10.0);
//        okBtn.getStyleClass().add("button");
//        okBtn.getStylesheets().add("/css/other_css.css");

        okBtn.setStyle("-fx-background-color: "+buttonsColor+";");


        hBox.getChildren().add(label);
        vBox0.getChildren().add(imageView);
        hBox.getChildren().add(vBox0);
        vBox.getChildren().add(hBox);
        vBox.getChildren().add(messageTxt);
        hBox0.getChildren().add(okBtn);
        vBox.getChildren().add(hBox0);
        anchorPane.getChildren().add(vBox);

        okBtn.setOnAction(event -> {
             buttonAnswer = "yes";
             Stage oldStage = (Stage) vBox.getScene().getWindow();
             oldStage.close();
        });


        Scene scene = new Scene(anchorPane);
//        stage.initStyle(StageStyle.UNDECORATED);

        stage.initModality(Modality.APPLICATION_MODAL);

        stage.setTitle("Dialog Message");

        if (enableBouncing) {
            new BounceIn(anchorPane).play();
        }
        if (enableShaking){
            new Shake(anchorPane).play();
        }

        stage.setScene(scene);
        stage.showAndWait();

        return buttonAnswer;
    }


    public String showDialogMessage(){
        stage = new Stage();

        anchorPane = new AnchorPane();

        vBox = new VBox();
        hBox = new HBox();
        vBox0 = new VBox();
        imageView = new ImageView();
        label = new Label();
        messageTxt = new Label();
        hBox0 = new HBox();
        okBtn = new JFXButton("OK");


        anchorPane.setPrefHeight(148.0);
        anchorPane.setPrefWidth(432.0);

        okBtn.setPrefSize(60.0, 30);

        hBox.setStyle("-fx-background-color:  #e2e2e2");

        stage.setAlwaysOnTop(true);


        anchorPane.setBottomAnchor(vBox, 0.0);
        anchorPane.setLeftAnchor(vBox, 0.0);
        anchorPane.setRightAnchor(vBox, 0.0);
        anchorPane.setTopAnchor(vBox, 0.0);
        vBox.setAlignment(Pos.TOP_LEFT);
        vBox.setLayoutX(158.0);
        vBox.setLayoutY(-33.0);
        vBox.setPrefHeight(167.0);
        vBox.setPrefWidth(432.0);

        hBox.setAlignment(Pos.TOP_LEFT);
        hBox.setPrefHeight(41.0);
        hBox.setPrefWidth(432.0);

        HBox.setHgrow(vBox0, javafx.scene.layout.Priority.ALWAYS);
        vBox0.setAlignment(Pos.CENTER_RIGHT);
        vBox0.setPrefHeight(200.0);
        vBox0.setPrefWidth(383.0);

        imageView.setFitHeight(45.0);
        imageView.setFitWidth(55.0);
        imageView.setPickOnBounds(true);
        imageView.setPreserveRatio(true);
        VBox.setMargin(imageView, new Insets(5.0, 5.0, 5.0, 10.0));

        imageView.setImage(new Image(DialogMessage.class.getResource(getImageSource()).toExternalForm()));

        label.setAlignment(Pos.CENTER_LEFT);
        label.setPrefHeight(50.0);
        label.setPrefWidth(338.0);
        label.setText(headerText);
        label.setFont(new Font(18.0));
        HBox.setMargin(label, new Insets(0.0, 5.0, 0.0, 10.0));
        VBox.setMargin(hBox, new Insets(0.0, 0.0, 10.0, 0.0));

        messageTxt.setAlignment(Pos.CENTER_LEFT);
        messageTxt.setText(getMessageText());
        messageTxt.setFont(new Font(15.0));
        VBox.setMargin(messageTxt, new Insets(0.0, 10.0, 20.0, 15.0));

        hBox0.setAlignment(Pos.CENTER);
        VBox.setMargin(hBox0, new Insets(0.0, 15.0, 10.0, 0.0));

        okBtn.setLayoutX(346.0);
        okBtn.setLayoutY(10.0);
//        okBtn.getStyleClass().add("button");
//        okBtn.getStylesheets().add("/css/other_css.css");

        okBtn.setStyle("-fx-background-color: "+getButtonsColor()+";");

        hBox.getChildren().add(label);
        vBox0.getChildren().add(imageView);
        hBox.getChildren().add(vBox0);
        vBox.getChildren().add(hBox);
        vBox.getChildren().add(messageTxt);
        hBox0.getChildren().add(okBtn);
        vBox.getChildren().add(hBox0);
        anchorPane.getChildren().add(vBox);

        okBtn.setOnAction(event -> {
            buttonAnswer = "yes";
            Stage oldStage = (Stage) vBox.getScene().getWindow();
            oldStage.close();
        });

        Scene scene = new Scene(anchorPane);
//        stage.initStyle(StageStyle.UNDECORATED);

        stage.initModality(Modality.APPLICATION_MODAL);

        stage.setTitle("Dialog Message");

        if (enableBouncing) {
            new BounceIn(anchorPane).play();
        }
        if (enableShaking){
            new Shake(anchorPane).play();
        }

        stage.setScene(scene);
        stage.showAndWait();

        return buttonAnswer;
    }

}
