package com.example.controllers;

import com.example.testpackage.SomeClass;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Test {

    @FXML
    private Label label1;

    @FXML
    private Label label2;

    @FXML
    private Label label3;


    @FXML
    private void initialize() {
        Platform.runLater(() -> {
            label1.setText(new SomeClass().testMethod());
            label2.setText("Obfuscation does not work on module-info.java");
            label3.setText("How do I fix it?");

        });

    }
}
