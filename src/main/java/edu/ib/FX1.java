package edu.ib;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class FX1 extends Application {

    public static void main(String[] args) {
        launch(args);
    }


    // stage : scena
    // scene : odsłona
    @Override
    public void start(Stage primaryStage) throws IOException {
        //Parent root= FXMLLoader.load(getClass().getResource("/fxml/mainWindow.fxml"));
        Parent root= FXMLLoader.load(getClass().getResource("/fxml/mainWindow.fxml"));
        Scene scene= new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Hello JavaFX");
        primaryStage.show();

    }
}
