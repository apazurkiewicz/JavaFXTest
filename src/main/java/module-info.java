module com.example {
    requires javafx.base;
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;

    opens com.example to javafx.fxml;

    exports com.example;

}