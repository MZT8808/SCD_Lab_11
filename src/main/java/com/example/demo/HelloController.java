package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onButton1Click(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Pop_up_window.fxml"));
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void onButton2Click(ActionEvent event) throws IOException {
        Parent root1 = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
        Stage stage1 = (Stage) ((Node)event.getSource()).getScene().getWindow();
        Scene scene1 = new Scene(root1);
        stage1.setScene(scene1);
        stage1.show();
    }

    public void Logout(ActionEvent event) {

    }

    public void cancel(ActionEvent event) {
    }
}