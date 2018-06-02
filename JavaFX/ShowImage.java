import java.util.Random;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.geometry.Insets;
import javafx.scene.layout.*;
import javafx.scene.shape.*;
import javafx.scene.text.Text; 
import javafx.geometry.Pos;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;


public class ShowImage extends Application{

	@Override
	public void start(Stage primaryStage){
		
		Image image = new Image("Image/headPortrait.jpeg");

		VBox vBox = new VBox();

		for (int j = 0; j < 5 ; j ++ ) {
			HBox hBox = new HBox();
			hBox.setPadding(new Insets(5,5,5,5));
			for (int i = 0; i < 6 ; i++ ) {
				hBox.getChildren().add(new ImageView(image));
			}
			vBox.getChildren().add(hBox);
			

		}
		Button submit = new Button("Submit");
		vBox.getChildren().add(submit);
		Scene scene = new Scene(vBox, 1000, 600);
		primaryStage.setScene(scene);
		 // primaryStage.setScene(pane);
		primaryStage.show();


       submit.setOnAction(new EventHandler<ActionEvent>() {

        @Override
            public void handle(ActionEvent e) {
               
				vBox.getChildren().remove(hBox);
             }
         });
	}
}


class DeckOfCards {


	public static void main(String[] args) {
		int[] deck = new int[52];
		for (int i =0; i < deck.length; i++ ) {
			deck[i] = i;
		}
		deck = random(deck);
		for (int i =0; i < deck.length; i++ ) {
			System.out.println(deck[i]);
		}


	}


	public static int[] random(int[] arr){
		int length = arr.length;
		int[] newarr = new int[length];
		Random r = new Random();
		int k = 0;

		while(k < length){
			int index = r.nextInt(length - k);	
			newarr[k++] = arr[index];
			arr[index] = arr[length - k];
		}

		return newarr;
	}
}
