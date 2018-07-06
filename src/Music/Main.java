package Music;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

public class Main extends Application implements EventHandler<ActionEvent>{
	
	Button btnPlay, btnPause;

	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Titel");
		
		btnPlay = new Button("PLAY");
		btnPlay.setOnAction(this);
		
		
		btnPause = new Button("PAUSE");
		btnPlay.setOnAction(this);
		
		StackPane layout = new StackPane();
		layout.getChildren().add(btnPlay);
		layout.getChildren().add(btnPause);
		
		Scene scene = new Scene(layout, 300, 250);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	@Override
	public void handle(ActionEvent event) {
		Media media;
		media = new Media("file:///D:/Musik/4-Alligatoah%20-%20Musik%20Ist%20Keine%20Lösung%20-%20Lass%20liegen.mp3");
		MediaPlayer mp = new MediaPlayer(media);
		if (event.getSource() == btnPlay ) {
			mp.play();	        
		} else if (event.getSource() == btnPause) {
			mp.pause();
		}
	}
}
