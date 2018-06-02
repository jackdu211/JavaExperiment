import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;


public class FirstJavaFX  extends Application{



	@Override
	public void start(Stage p){
		Button btOK = new Button("OK");
		Scene scene = new Scene(btOK, 200, 250);
		p.setTitle("MyJavaFX");
		p.setScene(scene);
		p.show();

	}

	public static void mian (String args[]){

		Application.launch();

	}


	 }
