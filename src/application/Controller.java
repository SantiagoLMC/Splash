package application;

import java.io.IOException;

import javafx.animation.FadeTransition;
import javafx.animation.RotateTransition;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Controller {
	
	@FXML
	ImageView cruz;
	
	@FXML
	Pane nube;
	
	public void initialize() {
		rotarCruz();
		rotarNube();
	}

	private void rotarNube() {
		RotateTransition rotar = new RotateTransition(Duration.seconds(0.7), nube);
		rotar.setByAngle(-360);
		rotar.setCycleCount(2);
		rotar.play();
	}

	private void rotarCruz() {
		RotateTransition rotar = new RotateTransition(Duration.seconds(0.7), cruz);
		rotar.setByAngle(360);
		rotar.setCycleCount(2);
		rotar.play();
	}
}