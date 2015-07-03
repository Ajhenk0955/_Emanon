package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class MainMenuController implements Initializable, ControlledScreen {

	@FXML
	private Button searchButton;

	@FXML
	private TextField searchTerm;

	@FXML
	private Button quickSearch;

	@FXML
	private Button edit_UserProfile;

	@FXML
	private Button createPatientButton;

	@FXML
	private Button logoutButton;

	ScreenController myController;

	@FXML
	void handleSearchButton(ActionEvent event) {

	}

	@FXML
	void handleQuickSearchButton(ActionEvent event) {

	}

	@FXML
	void handleUserProfile(ActionEvent event) {

	}

	@FXML
	void handleAddPatientButton(ActionEvent event) {

	}

	@FXML
	void handleMMLogoutButton(ActionEvent event) {

	}

	public void setScreenParent(ScreenController screenParent) {
		myController = screenParent;
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub

	}

}
