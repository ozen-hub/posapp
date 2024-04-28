package com.devstack.pos.controller;

import com.devstack.pos.bo.BoFactory;
import com.devstack.pos.bo.custom.UserBo;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.io.IOException;

public class LoginFormController {
    public AnchorPane context;
    public TextField txtEmail;
    public PasswordField txtPassword;

    private UserBo userBo = BoFactory.getBo(BoFactory.BoType.USER);

    public void signInOnAction(ActionEvent actionEvent) throws IOException {
        if (userBo.login(txtEmail.getText().trim(), txtPassword.getText())) {
            Stage stage = (Stage) context.getScene().getWindow();
            stage.centerOnScreen();
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../views/DashboardForm.fxml"))));
            new Alert(Alert.AlertType.INFORMATION, "Welcome!..").show();
        } else {
            new Alert(Alert.AlertType.WARNING, "Username or password is incorrect!").show();
        }
    }

    public void navigateToSignUp(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) context.getScene().getWindow();
        stage.centerOnScreen();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../views/SignupForm.fxml"))));
    }
}
