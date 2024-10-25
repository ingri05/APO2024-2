package com.example.demoinicial.Controller;

import com.example.demoinicial.model.User;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @FXML
    private Label welcomeText;

    @FXML
    private Label lName;

    @FXML
    private TextField txtName;

    @FXML
    private Button btnName;

    //Objeto UserController
    private UserController userController;

    @FXML
    public void registerUser() {
        String name = txtName.getText();

        userController.addUser(new User(null,name,0));
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("User registered");
        alert.setHeaderText("Success");
        alert.setContentText("User registered successfully");
        alert.showAndWait();

        welcomeText.setText(userController.toString());
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        userController = UserController.getInstance();
    }
}