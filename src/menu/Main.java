package menu;
	


import java.util.Arrays;
import java.util.Random;

import javafx.application.Application;
import javafx.stage.Stage;
import risk.models.Die;
import risk.models.enums.DieType;


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
