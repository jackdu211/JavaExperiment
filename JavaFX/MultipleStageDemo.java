import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.layout.StackPane;



public class MultipleStageDemo extends Application{



	@Override
	public void start (Stage primaryStage){



		// Scene scene = new Scene(new Button("OK"), 200, 20);
		StackPane pane = new StackPane();
		pane.getChildren().add(new Button("OK"));
		pane.setRotate(45);
		primaryStage.setTitle("MyjavaFX");
		primaryStage.setHeight(100);
		Scene scene = new Scene(pane, 200, 20);
		primaryStage.setScene(scene);
		 // primaryStage.setScene(pane);
		primaryStage.show();




	}





}