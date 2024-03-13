module com.example.numm {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.numm to javafx.fxml;
    exports com.example.numm;
}