package com.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.net.URL;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        System.out.println("lauched");
        primaryStage.setWidth(800);
        primaryStage.setHeight(600);

        URL fxmlURL = Main.class.getResource("test.fxml");

        System.out.println(fxmlURL);

        FXMLLoader loader = new FXMLLoader(fxmlURL);
        AnchorPane pane = loader.load();

        primaryStage.setScene(new Scene(pane));
        primaryStage.show();
    }

    public static void main(
            String[] args) {
        launch(args);
    }
}
