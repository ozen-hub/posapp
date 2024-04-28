package com.devstack.pos.controller;

import com.devstack.pos.bo.BoFactory;
import com.devstack.pos.bo.custom.UserBo;
import com.devstack.pos.dto.UserDto;
import com.devstack.pos.util.PasswordUtil;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.UUID;

public class SignupFormController {
    public AnchorPane context;
    public TextField txtEmail;
    public PasswordField txtPassword;
    public TextField txtFullName;

    private UserBo userBo = BoFactory.getBo(BoFactory.BoType.USER);

    public void registerNowOnAction(ActionEvent actionEvent) throws IOException {
        UserDto dto = new UserDto(
                UUID.randomUUID().toString(),
                txtEmail.getText().trim(),
                PasswordUtil.hash(txtPassword.getText().trim()),
                txtFullName.getText()
        );
        userBo.create(dto);
        Stage stage =(Stage) context.getScene().getWindow();
        stage.centerOnScreen();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../views/LoginForm.fxml"))));

    }

    public void navigateToLoginForm(ActionEvent actionEvent) throws IOException {
        Stage stage =(Stage) context.getScene().getWindow();
        stage.centerOnScreen();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../views/LoginForm.fxml"))));
    }
}
