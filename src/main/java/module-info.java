module com.example.demoinicial {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.demoinicial to javafx.fxml;
    exports com.example.demoinicial;
    exports com.example.demoinicial.Controller;
    opens com.example.demoinicial.Controller to javafx.fxml;
    opens com.example.demoinicial.model to javafx.base;
}
