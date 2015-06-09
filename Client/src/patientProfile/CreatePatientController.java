package patientProfile;

import java.net.URL;
import java.util.ResourceBundle;

import application.ControlledScreen;
import application.ScreenController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class CreatePatientController implements Initializable, ControlledScreen {

	@FXML
	private TextField lastName;

	@FXML
	private TextField zipCode;

	@FXML
	private TextField MInitial;

	@FXML
	private TextField address;

	@FXML
	private TextField city;

	@FXML
	private TextField homePhone;

	@FXML
	private TextField Gender;

	@FXML
	private TextField monthOfBirth;

	@FXML
	private TextField ssn;

	@FXML
	private TextField firstName;

	@FXML
	private TextField dayOfBirth;

	@FXML
	private Button backButton;

	@FXML
	private TextField state;

	@FXML
	private Button saveButton;

	@FXML
	private TextField cellPhone;

	@FXML
	private TextField yearOfBirth;

	ScreenController myController;

	@FXML
	void handleSaveButton(ActionEvent event) {

	}

	@FXML
	void handleBackButton(ActionEvent event) {

	}

	public void setScreenParent(ScreenController screenParent) {
		myController = screenParent;
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub

	}

}
