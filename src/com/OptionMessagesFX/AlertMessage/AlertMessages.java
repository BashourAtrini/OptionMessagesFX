package com.OptionMessagesFX.AlertMessage;

import animatefx.animation.BounceIn;
import animatefx.animation.BounceOut;
import com.jfoenix.controls.JFXButton;
import javafx.geometry.Insets;
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
import javafx.stage.StageStyle;

public class AlertMessages {

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
    private JFXButton thirdBtn;

    private Stage stage;

    static String buttonAnswer;



    public String showConfirm(String messageTextVar, String thirdBtnTxt){
         stage = new Stage();

         anchorPane = new AnchorPane();

        vBox = new VBox();
        hBox = new HBox();
        vBox0 = new VBox();
        imageView = new ImageView();
        label = new Label();
        messageTxt = new Label();
        hBox0 = new HBox();
        cancleBtn = new JFXButton("لا");
        okBtn = new JFXButton("نعم");
        thirdBtn = new JFXButton(thirdBtnTxt);


        anchorPane.setPrefHeight(148.0);
        anchorPane.setPrefWidth(432.0);

        okBtn.setPrefSize(60.0, 30);
        cancleBtn.setPrefSize(60.0, 30);
        thirdBtn.setPrefSize(100.0, 30);

        hBox.setStyle("-fx-background-color:  #e2e2e2");

        stage.setAlwaysOnTop(true);


        anchorPane.setBottomAnchor(vBox, 0.0);
        anchorPane.setLeftAnchor(vBox, 0.0);
        anchorPane.setRightAnchor(vBox, 0.0);
        anchorPane.setTopAnchor(vBox, 0.0);
        vBox.setAlignment(javafx.geometry.Pos.TOP_RIGHT);
        vBox.setLayoutX(158.0);
        vBox.setLayoutY(-33.0);
        vBox.setPrefHeight(167.0);
        vBox.setPrefWidth(432.0);

        hBox.setAlignment(javafx.geometry.Pos.TOP_RIGHT);
        hBox.setPrefHeight(41.0);
        hBox.setPrefWidth(432.0);

        HBox.setHgrow(vBox0, javafx.scene.layout.Priority.ALWAYS);
        vBox0.setPrefHeight(200.0);
        vBox0.setPrefWidth(383.0);

        imageView.setFitHeight(45.0);
        imageView.setFitWidth(55.0);
        imageView.setPickOnBounds(true);
        imageView.setPreserveRatio(true);
        VBox.setMargin(imageView, new Insets(5.0, 0.0, 0.0, 10.0));
        imageView.setImage(new Image(getClass().getResource("/img/warning-circle.png").toExternalForm()));

        label.setAlignment(javafx.geometry.Pos.CENTER_RIGHT);
        label.setPrefHeight(50.0);
        label.setPrefWidth(338.0);
        label.setText("الرجاء الإنتباه!");
        label.setFont(new Font(18.0));
        HBox.setMargin(label, new Insets(0.0, 5.0, 0.0, 0.0));
        VBox.setMargin(hBox, new Insets(0.0, 0.0, 10.0, 0.0));

        messageTxt.setAlignment(javafx.geometry.Pos.CENTER_RIGHT);
        messageTxt.setText(messageTextVar);
        messageTxt.setFont(new Font(15.0));
        VBox.setMargin(messageTxt, new Insets(0.0, 10.0, 20.0, 10.0));

        hBox0.setAlignment(javafx.geometry.Pos.CENTER_RIGHT);
        VBox.setMargin(hBox0, new Insets(0.0, 15.0, 10.0, 0.0));

        thirdBtn.getStylesheets().add("/css/other_css.css");
        HBox.setMargin(thirdBtn, new Insets(0.0, 20.0, 0.0, 0.0));

        cancleBtn.getStylesheets().add("/css/other_css.css");
        HBox.setMargin(cancleBtn, new Insets(0.0, 20.0, 0.0, 0.0));

        okBtn.setLayoutX(346.0);
        okBtn.setLayoutY(10.0);
        okBtn.getStyleClass().add("button");
        okBtn.getStylesheets().add("/css/other_css.css");


        vBox0.getChildren().add(imageView);
        hBox.getChildren().add(vBox0);
        hBox.getChildren().add(label);
        vBox.getChildren().add(hBox);
        vBox.getChildren().add(messageTxt);
        if (! thirdBtnTxt.isEmpty()){
        hBox0.getChildren().add(thirdBtn);}
        hBox0.getChildren().add(cancleBtn);
        hBox0.getChildren().add(okBtn);
        vBox.getChildren().add(hBox0);
        anchorPane.getChildren().add(vBox);

        okBtn.setOnAction(event -> {
             buttonAnswer = "yes";
             Stage oldStage = (Stage) vBox.getScene().getWindow();
             oldStage.close();
        });
        cancleBtn.setOnAction(event -> {
            buttonAnswer = "no";
            new BounceOut(anchorPane).play();
            Stage oldStage = (Stage) vBox.getScene().getWindow();
            oldStage.close();
        });
        thirdBtn.setOnAction(event -> {
            buttonAnswer = "thirdBtn";
            Stage oldStage = (Stage) vBox.getScene().getWindow();
            oldStage.close();
        });


        Scene scene = new Scene(anchorPane);
        stage.initStyle(StageStyle.UNDECORATED);

        stage.initModality(Modality.APPLICATION_MODAL);

        new BounceIn(anchorPane).play();

        stage.setScene(scene);
        stage.showAndWait();

        return buttonAnswer;
    }

}
