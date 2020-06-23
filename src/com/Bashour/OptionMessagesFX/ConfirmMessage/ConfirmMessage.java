package com.Bashour.OptionMessagesFX.ConfirmMessage;

import animatefx.animation.BounceIn;
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


public class ConfirmMessage  {

    AnchorPane anchorPane;

    private VBox vBox;
    private HBox hBox;
    private VBox vBox0;
    private ImageView imageView;
    private Label label;
    private Label messageTxt;
    private HBox hBox0;
    private JFXButton cancleBtn;
    private JFXButton okBtn;

    private Stage stage;

    static boolean buttonAnswer;


    String headerText = "";
    String messageText = "";
    String button1Text = "";
    String button2Text = "";
    String button1Color = "";
    String button2Color = "";
    String buttonTextFillColor = "";
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

    public String getButtonTextFillColor() {
        return buttonTextFillColor;
    }

    public void setButtonTextFillColor(String buttonTextFillColor) {
        this.buttonTextFillColor = buttonTextFillColor;
    }

    public String getButton1Color() {
        return button1Color;
    }

    public void setButton1Color(String button1Color) {
        this.button1Color = button1Color;
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

    public String getButton1Text() {
        return button1Text;
    }

    public void setButton1Text(String button1Text) {
        this.button1Text = button1Text;
    }

    public String getButton2Text() {
        return button2Text;
    }

    public void setButton2Text(String button2Text) {
        this.button2Text = button2Text;
    }

    public String getButton2Color() {
        return button2Color;
    }

    public void setButton2Color(String button2Color) {
        this.button2Color = button2Color;
    }

    public ConfirmMessage(){

        setHeaderText("Attention !");
        setMessageText("");
        setButton1Text("OK");
        setButton2Text("Cancel");
        setButton1Color("#ff0000");
        setButton2Color("#c3c3c3");
        setButtonTextFillColor("#010101");
        setImageSource("/img/warning-circle.png");

    }

    public ConfirmMessage(String headerText, String messageText){

        this.headerText = headerText;
        this.messageText = messageText;

        setButton1Text("OK");
        setButton2Text("Cancel");
        setButton1Color("#ff0000");
        setButton2Color("#c3c3c3");
        setButtonTextFillColor("#010101");
        setImageSource("/img/warning-circle.png");

//        if (imageSource.isEmpty() && buttonTextFillColor.isEmpty() && button1Color.isEmpty() && button2Color.isEmpty() && button1Text.isEmpty() && button2Text.isEmpty()){
//            show(headerText,messageText,"Yes","No","#f80000","#e2e2e2","#010101","/img/warning-circle.png");
//        }else{
//            show(headerText,messageText,getButton1Text(),getButton2Text(),getButton1Color(),getButton2Color(),getButtonTextFillColor(),getImageSource());
//        }
    }

    public ConfirmMessage(String headerText, String messageText, String button1Text, String button2Text){

        this.headerText = headerText;
        this.messageText = messageText;
        this.button1Text = button1Text;
        this.button2Text = button2Text;

        setButton1Color("#ff0000");
        setButton2Color("#c3c3c3");
        setButtonTextFillColor("#010101");
        setImageSource("/img/warning-circle.png");
    }

    public ConfirmMessage(String headerText, String messageText, String button1Text, String button2Text, String button1Color, String button2Color){

        this.headerText = headerText;
        this.messageText = messageText;
        this.button1Text = button1Text;
        this.button2Text = button2Text;
        this.button1Color = button1Color;
        this.button2Color = button2Color;

        setButtonTextFillColor("#010101");
        setImageSource("/img/warning-circle.png");

    }

    public ConfirmMessage(String headerText, String messageText, String button1Text, String button2Text, String button1Color, String button2Color,String buttonTextFillColor){

        this.headerText = headerText;
        this.messageText = messageText;
        this.button1Text = button1Text;
        this.button2Text = button2Text;
        this.button1Color = button1Color;
        this.button2Color = button2Color;
        this.buttonTextFillColor = buttonTextFillColor;

        setImageSource("/img/warning-circle.png");

    }

    public ConfirmMessage(String headerText, String messageText, String button1Text, String button2Text, String button1Color, String button2Color,String buttonTextFillColor, String imageSource){

        this.headerText = headerText;
        this.messageText = messageText;
        this.button1Text = button1Text;
        this.button2Text = button2Text;
        this.button1Color = button1Color;
        this.button2Color = button2Color;
        this.buttonTextFillColor = buttonTextFillColor;
        this.imageSource = imageSource;

    }


    public boolean show(String headerText, String messageText, String button1Text, String button2Text, String button1Color, String button2Color, String buttonTextFillColor, String imageSource){
         stage = new Stage();

         anchorPane = new AnchorPane();

        vBox = new VBox();
        hBox = new HBox();
        vBox0 = new VBox();
        imageView = new ImageView();
        label = new Label();
        messageTxt = new Label();
        hBox0 = new HBox();
        cancleBtn = new JFXButton(button2Text);
        okBtn = new JFXButton(button1Text);

        anchorPane.setPrefHeight(148.0);
        anchorPane.setPrefWidth(432.0);

        okBtn.setPrefSize(80.0, 30);
        cancleBtn.setPrefSize(80.0, 30);

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
        imageView.setImage(new Image(getClass().getResource(imageSource).toExternalForm()));

        label.setAlignment(Pos.CENTER_LEFT);
        label.setPrefHeight(50.0);
        label.setPrefWidth(338.0);
        label.setText(headerText);
        label.setFont(new Font(18.0));
        HBox.setMargin(label, new Insets(0.0, 5.0, 0.0, 10.0));
        VBox.setMargin(hBox, new Insets(0.0, 0.0, 10.0, 0.0));

        messageTxt.setAlignment(Pos.CENTER_LEFT);
        messageTxt.setText(messageText);
        messageTxt.setFont(new Font(15.0));
        VBox.setMargin(messageTxt, new Insets(0.0, 10.0, 20.0, 15.0));

        hBox0.setAlignment(Pos.CENTER);
        VBox.setMargin(hBox0, new Insets(0.0, 15.0, 10.0, 0.0));

//        cancleBtn.getStylesheets().add("/css/OptionMessagesFX.css");
        HBox.setMargin(cancleBtn, new Insets(0.0, 20.0, 0.0, 0.0));

        okBtn.setLayoutX(346.0);
        okBtn.setLayoutY(10.0);
//        okBtn.getStyleClass().add("button-red");
//        okBtn.getStylesheets().add("/css/OptionMessagesFX.css");

        okBtn.setStyle("-fx-background-color:" +button1Color+"; -fx-text-fill: "+buttonTextFillColor+";");
        cancleBtn.setStyle("-fx-background-color:" +button2Color+"; -fx-text-fill: "+buttonTextFillColor+";");

        hBox.getChildren().add(label);
        vBox0.getChildren().add(imageView);
        hBox.getChildren().add(vBox0);
        vBox.getChildren().add(hBox);
        vBox.getChildren().add(messageTxt);
        hBox0.getChildren().add(cancleBtn);
        hBox0.getChildren().add(okBtn);
        vBox.getChildren().add(hBox0);
        anchorPane.getChildren().add(vBox);

        okBtn.setOnAction(event -> {
             buttonAnswer = true;
             Stage oldStage = (Stage) vBox.getScene().getWindow();
             oldStage.close();
        });
        cancleBtn.setOnAction(event -> {
            buttonAnswer = false;
            Stage oldStage = (Stage) vBox.getScene().getWindow();
            oldStage.close();
        });


        new Shake(imageView).play();

        Scene scene = new Scene(anchorPane);
//        stage.initStyle(StageStyle.UNDECORATED);

        stage.initModality(Modality.APPLICATION_MODAL);

        stage.setTitle("Confirm Message");

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


    public boolean show(){


        stage = new Stage();

        anchorPane = new AnchorPane();

        vBox = new VBox();
        hBox = new HBox();
        vBox0 = new VBox();
        imageView = new ImageView();
        label = new Label();
        messageTxt = new Label();
        hBox0 = new HBox();
        cancleBtn = new JFXButton(getButton2Text());
        okBtn = new JFXButton(getButton1Text());

        anchorPane.setPrefHeight(148.0);
        anchorPane.setPrefWidth(432.0);

        okBtn.setPrefSize(80.0, 30);
        cancleBtn.setPrefSize(80.0, 30);

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
        imageView.setImage(new Image(getClass().getResource(getImageSource()).toExternalForm()));

        label.setAlignment(Pos.CENTER_LEFT);
        label.setPrefHeight(50.0);
        label.setPrefWidth(338.0);
        label.setText(getHeaderText());
        label.setFont(new Font(18.0));
        HBox.setMargin(label, new Insets(0.0, 5.0, 0.0, 10.0));
        VBox.setMargin(hBox, new Insets(0.0, 0.0, 10.0, 0.0));

        messageTxt.setAlignment(Pos.CENTER_LEFT);
        messageTxt.setText(getMessageText());
        messageTxt.setFont(new Font(15.0));
        VBox.setMargin(messageTxt, new Insets(0.0, 10.0, 20.0, 15.0));

        hBox0.setAlignment(Pos.CENTER);
        VBox.setMargin(hBox0, new Insets(0.0, 15.0, 10.0, 0.0));

//        cancleBtn.getStylesheets().add("/css/OptionMessagesFX.css");
        HBox.setMargin(cancleBtn, new Insets(0.0, 20.0, 0.0, 0.0));

        okBtn.setLayoutX(346.0);
        okBtn.setLayoutY(10.0);
//        okBtn.getStyleClass().add("button-red");
//        okBtn.getStylesheets().add("/css/OptionMessagesFX.css");

        okBtn.setStyle("-fx-background-color:" +getButton1Color()+"; -fx-text-fill: "+getButtonTextFillColor()+";");
        cancleBtn.setStyle("-fx-background-color:" +getButton2Color()+"; -fx-text-fill: "+getButtonTextFillColor()+";");

        hBox.getChildren().add(label);
        vBox0.getChildren().add(imageView);
        hBox.getChildren().add(vBox0);
        vBox.getChildren().add(hBox);
        vBox.getChildren().add(messageTxt);
        hBox0.getChildren().add(cancleBtn);
        hBox0.getChildren().add(okBtn);
        vBox.getChildren().add(hBox0);
        anchorPane.getChildren().add(vBox);

        okBtn.setOnAction(event -> {
            buttonAnswer = true;
            Stage oldStage = (Stage) vBox.getScene().getWindow();
            oldStage.close();
        });
        cancleBtn.setOnAction(event -> {
            buttonAnswer = false;
            Stage oldStage = (Stage) vBox.getScene().getWindow();
            oldStage.close();
        });


        new Shake(imageView).play();

        Scene scene = new Scene(anchorPane);
//        stage.initStyle(StageStyle.UNDECORATED);

        stage.initModality(Modality.APPLICATION_MODAL);

        stage.setTitle("Confirm Message");

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
