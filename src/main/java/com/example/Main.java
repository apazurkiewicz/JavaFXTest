package com.example;

import com.example.testpackage.SomeClass;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        System.out.println("lauched");
        primaryStage.setWidth(800);
        primaryStage.setHeight(600);


        AnchorPane pane = new AnchorPane();
        SomeClass someClass = new SomeClass();
        Label label = new Label(someClass.testMethod());
        pane.getChildren().add(label);
        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(
            String[] args) {
        launch(args);
    }
}
