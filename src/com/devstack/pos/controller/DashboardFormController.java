package com.devstack.pos.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class DashboardFormController {
    public AnchorPane context;

    public void openCustomerFormOnAction(ActionEvent actionEvent) throws IOException {
        setUi("CustomerForm");
    }

    public void setUi(String location) throws IOException {
        Stage stage =(Stage) context.getScene().getWindow();
        stage.centerOnScreen();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../views/"+location+".fxml"))));
    }

}
