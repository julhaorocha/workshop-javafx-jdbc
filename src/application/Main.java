package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.stage.Stage;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/gui/MainView.fxml"));//instancia o FXMLLoader passando o caminho da view
			ScrollPane scrollPane = loader.load();//chama o loader
			
			scrollPane.setFitToHeight(true);
			scrollPane.setFitToWidth(true);
			
			Scene mainScene = new Scene(scrollPane);//cria a cena principal passando um objeto
			primaryStage.setScene(mainScene);//seta a cena principal
			primaryStage.setTitle("Sample JavaFX application");//titulo do palco
			primaryStage.show();//mostra o palco na tela
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
