package menu;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import views.Main;

public class StartMenuController {

	@FXML
	private Button battleshipButton;
	@FXML
	private Button blackjackButton;
	@FXML
	private Button riskButton;
	@FXML
	private Button unoButton;
	@FXML
	private Button exitButton;
	@FXML
	private void startBattleship() {
		views.Main main = new Main();
		main.start(stage);
	}
	@FXML 
	private void startBlackjack() {
		blackjack.driver.Main.main(null);
	}
	@FXML 
	private void startRisk() {
		risk.controllers.RiskController.run(stage);
	}
	@FXML
	private void startUno() {
		uno.application.Main main = new uno.application.Main();
		main.start(stage);
	}
	@FXML 
	private void exit() {
		stage.close();
	}
	private ViewController viewController;
	public void setViewController(ViewController viewController) {
		this.viewController = viewController;
	}
	private Stage stage;
	public void setStage(Stage stage) {
		this.stage = stage;
	}
}
