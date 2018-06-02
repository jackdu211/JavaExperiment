import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.scene.layout.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ShowHBoxVBox extends Application{




	@Override
	public void start(Stage primaryStage){
		
		
		BorderPane pane = new BorderPane();

		pane.setTop(getHBox());
		pane.setBottomP(getVBox());

		Scene scene = new Scene(pane, 500, 200);
		primaryStage.setScene(scene);
		primaryStage.show();
	}


	private HBox getHBox(){
		HBox h = new HBox(15);
		h.setPadding(new Insets(15,15,15,15));
		h.getChildren().add(new Button("Computer Science"));
		h.getChildren().add(new Button("Chemistry"));
		ImageView imageview = new ImageView(new Image("Image/headPortrait.jpeg"));
		h.getChildren().add(imageview);

		return h;
	}


	private VBox getVBox(){
		VBox v = new VBox(15);

		Label[] courses = {
			new Label("CS"),
			new Label("EE"),
		};


		for (Label course : courses ) {
			v.getChildren().add(course);
		}
		

		return v;
	}





} 