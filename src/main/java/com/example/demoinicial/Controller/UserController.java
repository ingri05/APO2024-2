package com.example.demoinicial.Controller;

import com.example.demoinicial.model.User;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;


public class UserController {
        private static UserController instance;
        private final ObservableList<User> users;

        private UserController() {
            users = FXCollections.observableArrayList();
        }

        public static UserController getInstance() {
            if (instance == null) {
                instance = new UserController();
            }
            return instance;
        }

        public void addUser(User User) {
            users.add(User);
        }

        public ObservableList<User> getUsers() {
            return users;
        }

        public String toString(){
            StringBuilder msg = new StringBuilder();
            for(User user : users) {
                msg.append(user.toString()).append("\n");
            }
            return msg.toString();
        }

}
