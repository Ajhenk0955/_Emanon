package application;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ScreenFramework extends Application {
	public static final String MAIN_MENU = "main menu";
	public static final String MAIN_MENU_FXML = "MainMenu.fxml";
	public static final String SEARCH = "search";
	public static final String SEARCH_FXML = "Search1.fxml";
	public static final String CREATE_PATIENT = "Create patient";
	public static final String CREATE_PATIENT_FXML = "CreatePatient.fxml";
	public static final String SEARCH_RESULTS = "Search results";
	public static final String SEARCH_RESULTS_FXML = "SearchResults.fxml";
	public static final String LOGIN = "Login";
	public static final String LOGIN_FXML = "Login.fxml";
	public static final String EDIT_USER_PROFILE = "Edit profile";
	public static final String EDIT_USER_PROFILE_FXML = "EditUserProfile.fxml";

	@Override
	public void start(Stage primaryStage) {

		ScreenController mainContainer = new ScreenController();
		mainContainer.loadScreen(ScreenFramework.MAIN_MENU,
				ScreenFramework.MAIN_MENU_FXML);
		mainContainer.loadScreen(ScreenFramework.SEARCH,
				ScreenFramework.SEARCH_FXML);
		mainContainer.loadScreen(ScreenFramework.CREATE_PATIENT,
				ScreenFramework.CREATE_PATIENT_FXML);
		mainContainer.loadScreen(ScreenFramework.LOGIN,
				ScreenFramework.LOGIN_FXML);
		mainContainer.loadScreen(ScreenFramework.SEARCH_RESULTS,
				ScreenFramework.SEARCH_RESULTS_FXML);
		mainContainer.loadScreen(ScreenFramework.EDIT_USER_PROFILE,
				ScreenFramework.EDIT_USER_PROFILE_FXML);

		mainContainer.setScreen(ScreenFramework.LOGIN);

		Group root = new Group();
		root.getChildren().addAll(mainContainer);
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}
}
