package net.yetihafen.bezahldoc;

import atlantafx.base.theme.PrimerDark;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class BezahlDoc extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        Application.setUserAgentStylesheet(new PrimerDark().getUserAgentStylesheetBSS());
        FXMLLoader fxmlLoader = new FXMLLoader(BezahlDoc.class.getResource("main-ui.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}