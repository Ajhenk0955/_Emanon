package accountManagement;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController implements Innitializable, ControlledScreen{

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
    
    ScreensController myController; 

    @FXML
    void handleLoginHyperlink(ActionEvent event) {

    }

    @FXML
    void handleSignUpButton(ActionEvent event) {

    }

    @FXML
    void handleLoginButton(ActionEvent event) {

    }
    
    public void setScreenParent(ScreensController screenParent){ 
        myController = screenParent; 
     }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) { 
        // TODO 
   	} 

}
