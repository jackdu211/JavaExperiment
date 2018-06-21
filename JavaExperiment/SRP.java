import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.geometry.Insets;
import javafx.scene.layout.*;
import javafx.scene.shape.*;
import javafx.scene.text.Text; 
import javafx.geometry.Pos;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import java.util.Random;

public class SRP extends Application{
	@Override
	public void start(Stage primaryStage){
	  Label label1 = new Label("Please input your choice:");  
    TextField textField = new TextField ();  
    HBox hb = new HBox();  
    hb.setPadding(new Insets(5,5,5,5));
    Button submit = new Button("Submit");
    hb.getChildren().addAll(label1, textField, submit );  
    hb.setSpacing(10);
    hb.setAlignment(Pos.CENTER);

  
    HBox pane = new HBox(10);
    pane.setAlignment(Pos.CENTER);
    pane.setPadding(new Insets(5,5,5,5));
  	Image s = new Image("Image/s.png");
  	Image r = new Image("Image/r.png");
  	Image p = new Image("Image/p.png");
  	pane.getChildren().add(new ImageView(s));
  	pane.getChildren().add(new ImageView(r));
  	pane.getChildren().add(new ImageView(p));

  	VBox  vb = new VBox();
  	vb.getChildren().addAll(hb,pane);  
  	Scene scene = new Scene(vb, 600, 200);
  	primaryStage.setScene(scene);
  	primaryStage.show();

    submit.setOnAction(new EventHandler<ActionEvent>() {
    @Override
    public void handle(ActionEvent e) {
      

    HBox pane = new HBox(10);
    pane.setAlignment(Pos.CENTER);
    pane.setPadding(new Insets(5,5,5,5));
		Image s = new Image("Image/s.png");
		Image r = new Image("Image/r.png");
		Image p = new Image("Image/p.png");
 		int choice = Integer.parseInt(textField.getText());


    pane.getChildren().add(new Label("Your choice:"));
    switch (choice){
   	case 0: pane.getChildren().add(new ImageView(s));break;
   	case 1: pane.getChildren().add(new ImageView(r));break;
   	case 2: pane.getChildren().add(new ImageView(p));break;
    }
   pane.getChildren().add(new Label("Computer's choice"));
   Random rd =new Random();

   int random = rd.nextInt(3);
   switch (random){
   	case 0:pane.getChildren().add(new ImageView(s));break;
   	case 1:pane.getChildren().add(new ImageView(r));break;
   	case 2:pane.getChildren().add(new ImageView(p));break;
   }

   HBox pane1 = new HBox(10);
   pane1.setAlignment(Pos.CENTER);

   if (random == choice)
    	pane1.getChildren().add(new Label("平局"));
   if (random == 1 + choice)
    	pane1.getChildren().add(new Label("电脑胜"));
   if (random == 2 + choice)
    	pane1.getChildren().add(new Label("你胜"));

   if (choice == 1 + random)
    	pane1.getChildren().add(new Label("你胜"));
    if (choice == 2 + random)
    	pane1.getChildren().add(new Label("电脑胜"));
  VBox  vb = new VBox();
  vb.getChildren().addAll(pane,pane1); 
      Stage stage = new Stage();
      Scene scene = new Scene(vb, 650, 300);
  stage.setScene(scene);
  stage.show();

     }
	 });

	}
}