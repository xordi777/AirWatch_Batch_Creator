package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javax.swing.*;
import java.awt.*;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("AirWatch Batch Creator");
        Scene scene = new Scene(root, 600, 275);

        //Determine which stylesheet to load (depends on monitor resolution)
        if(checkScreenSize()) {
            scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
        } else {
            scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
        }

        primaryStage.setScene(scene);
        primaryStage.show();
        primaryStage.sizeToScene();
    }

    // Return true if the monitor resultion is higher than FHD.
    private boolean checkScreenSize() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        double width = screenSize.getWidth();
        double height = screenSize.getHeight();

        if(width > 1920) {
            return true;
        }
        else { return false;}
    }

    public static void main(String[] args) {
        launch(args);
    }
}
