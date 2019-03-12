package menu;
	

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.Loader;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	
	private static ViewController viewController = new ViewController();
	@Override
	public void start(Stage primaryStage) {
		viewController.setStage(primaryStage);
		viewController.showMenu();
	}
	
	
	public static void showMenu() {
		viewController.showMenu();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
