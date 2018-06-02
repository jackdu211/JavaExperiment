import java.util.Random;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.scene.layout.HBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;




class DeckOfCards {


/*	public static void main(String[] args) {
		int[] deck = new int[52];
		for (int i =0; i < deck.length; i++ ) {
			deck[i] = i;
		}
		deck = random(deck);
		for (int i =0; i < deck.length; i++ ) {
			System.out.println(deck[i]);
		}


	}*/


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


public class showDeckOfCard{

	@Override
	public void start(Stage primaryStage){
		Pane pane = new HBox(10);
		pane.setPadding(new Insets(5,5,5,5));
		Image image = new Image("Image/headPortrait.jpeg");
		pane.getChildren().add(new ImageView(image));
		Scene scene = new Scene(pane, 200, 200);
		primaryStage.setScene(scene);
		 // primaryStage.setScene(pane);
		primaryStage.show();
	}



}



