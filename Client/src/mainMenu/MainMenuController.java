package mainMenu;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class MainMenuController Innitializable, ControlledScreen{

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
    
    ScreensController myController;

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
    
    
    public void setScreenParent(ScreensController screenParent){ 
        myController = screenParent; 
     }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) { 
        // TODO 
   	} 

}
