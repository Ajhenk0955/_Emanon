package screensframework;

import java.net.URL;
import java.util.ResourceBundle;

import application.ControlledScreen;
import application.ScreenController;
import application.ScreenFramework;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController implements Initializable, ControlledScreen {

	@FXML
	private TextField login_Username;

	@FXML
	private Label login_Label;

	@FXML
	private Button signUpButton;

	@FXML
	private Button login_Button;

	@FXML
	private PasswordField login_Password;

	@FXML
	private Hyperlink login_Hyperlink;

	ScreenController myController;

	@FXML
	void handleLoginHyperlink(ActionEvent event) {

	}

	@FXML
	void handleSignUpButton(ActionEvent event) {

	}

	@FXML
	void handleLoginButton(ActionEvent event) {
		//run input validation
		//change window
		myController.setScreen(ScreenFramework.MAIN_MENU);
	}

	public void setScreenParent(ScreenController screenParent) {
		myController = screenParent;
	}

	@Override
	public void initialize(URL url, ResourceBundle rb) {
		// TODO
	}

}
