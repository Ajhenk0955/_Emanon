package search;

import java.net.URL;
import java.util.ResourceBundle;

import application.ControlledScreen;
import application.ScreenController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;

public class SearchController implements Initializable, ControlledScreen {

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

	ScreenController myController;

	@FXML
	void search1_buttons(ActionEvent event) {

	}

	@FXML
	void handleBackButton(ActionEvent event) {

	}

	@Override
	public void setScreenParent(ScreenController screenPage) {
		// TODO Auto-generated method stub

	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub

	}
}
