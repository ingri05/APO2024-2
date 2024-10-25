package com.example.demoinicial.Controller;


import com.example.demoinicial.model.User;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class TableController implements Initializable {

    @FXML
    private TextField txtCode;

    @FXML
    private TextField txtName;

    @FXML
    private TextField txtScore;

    @FXML
    private Button btnAdd;

    @FXML
    private TableView<User> tvUser;

    @FXML
    private TableColumn<User, String> colCode;

    @FXML
    private TableColumn<User, String> colName;

    @FXML
    private TableColumn<User, Double> colScore;

    @FXML
    public void addUser(ActionEvent actionEvent) {
        String code = txtCode.getText();
        String name = txtName.getText();
        double score = Double.parseDouble(txtScore.getText());

        UserController.getInstance().addUser(new User(code,name,score));
        txtCode.setText("");
        txtName.setText("");
        txtScore.setText("");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        colCode.setCellValueFactory(new PropertyValueFactory<>("code"));
        colName.setCellValueFactory(new PropertyValueFactory<>("name"));
        colScore.setCellValueFactory(new PropertyValueFactory<>("score"));

        tvUser.setItems(UserController.getInstance().getUsers());
    }

}
