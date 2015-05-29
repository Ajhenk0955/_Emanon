package search;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;

public class SearchController implements Innitializable, ControlledScreen {

	@FXML
	private CheckBox earBox;

	@FXML
	private Button Search1_goButton;

	@FXML
	private CheckBox noseBox;

	@FXML
	private TextField searchTerm;

	@FXML
	private Button backButton;

	@FXML
	private CheckBox medicareBox;

	@FXML
	private CheckBox vaBox;

	@FXML
	private CheckBox eyeBox;

	@FXML
	private CheckBox insuranceBox;

	ScreensController myController;

	@FXML
	void search1_buttons(ActionEvent event) {

	}

	@FXML
	void handleBackButton(ActionEvent event) {

	}

	public void setScreenParent(ScreensController screenParent) {
		myController = screenParent;
	}

	@Override
	public void initialize(URL url, ResourceBundle rb) {
		// TODO
	}
}
