package desktop.starter.app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Locale;
import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) throws Exception {
//        ResourceBundle bundle = ResourceBundle.getBundle("bundles/lang",new Locale("ru"));
    	ResourceBundle bundle = test();
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"),bundle);
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
    public static PropertyResourceBundle test() throws IOException {
    	try (FileInputStream fis = new FileInputStream("bundles/lang_ru.properties")) {
  		  return new PropertyResourceBundle(fis);
  		}
    }
}
