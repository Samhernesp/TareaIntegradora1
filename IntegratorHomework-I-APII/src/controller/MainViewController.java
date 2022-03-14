package controller;

import java.io.File;
import application.Main;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.DirectoryChooser;

public class MainViewController {
	
	private Main main;
	
	public void setMain(Main main) {
		this.main = main;
	}
	
	@FXML
	Button addFunctionButton;
	
	@FXML
	Button logoutButton;
	
	@FXML
	void addFunction() {
		main.openRegistry();
	}
	
	@FXML
	void logout() {
		main.openLogin();
	}
}
