package menu;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class ViewController {
	public Stage stage;
	public StartMenuController startMenuController = null;
	public Scene startMenuScene = null;
	public void makeStartMenuController() {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/menu/view/FXML/StartMenu.fxml"));
			Parent root;
			root = loader.load();
			startMenuScene = new Scene(root, 600, 400);
			startMenuController = loader.getController();
			startMenuController.setViewController(this);
			startMenuController.setStage(stage);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void setStage(Stage stage) {
		this.stage = stage;
	}
	public void showMenu() {
		if (startMenuController == null) {
			makeStartMenuController();
		}
		stage.setMaximized(false);
		stage.setTitle("Game Galore :: Game Selection");
		stage.setScene(startMenuScene);
		stage.setOnCloseRequest(e -> stage.close());
		stage.show();
	}
}
