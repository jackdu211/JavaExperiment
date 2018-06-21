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
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import java.util.Random;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;

public class E30 extends Application{

	@Override 
	public void start(Stage primaryStage){

	Label label1 = new Label("Please input the Node:");  
	label1.setFont(new Font("Arial", 18));  
	label1.setTextFill(Color.RED);


	HBox hbox1 = new HBox();
	TextField textField1 = new TextField ();  
    TextField textField2 = new TextField (); 
    textField1.setPrefColumnCount(3);
    textField2.setPrefColumnCount(3);
    hbox1.getChildren().addAll( new Label("X1:"), textField1, new Label("  Y1:"), textField2);
    hbox1.setAlignment(Pos.CENTER);
    TextField textField3 = new TextField ();  
    TextField textField4 = new TextField (); 
    textField3.setPrefColumnCount(3);
    textField4.setPrefColumnCount(3);
    hbox1.getChildren().addAll(new Label("  X2:"), textField3,  new Label("  Y2:"), textField4);


	HBox hbox2 = new HBox();
	hbox2.setAlignment(Pos.CENTER);
	TextField textField5 = new TextField ();  
    TextField textField6 = new TextField (); 
    textField5.setPrefColumnCount(3);
    textField6.setPrefColumnCount(3); 
    hbox2.getChildren().addAll( new Label("X3:"), textField5, new Label("  Y3:"), textField6);
    hbox2.setAlignment(Pos.CENTER);
    TextField textField7 = new TextField ();  
    TextField textField8 = new TextField (); 
    textField7.setPrefColumnCount(3);
    textField8.setPrefColumnCount(3);
    hbox2.getChildren().addAll(new Label("  X4:"), textField7,  new Label("  Y4:"), textField8);

	HBox hbox3 = new HBox();
	hbox3.setAlignment(Pos.CENTER);
	TextField textField9 = new TextField ();  
    TextField textField10 = new TextField (); 
    textField9.setPrefColumnCount(3);
    textField10.setPrefColumnCount(3); 
    TextField textField11 = new TextField ();  
    TextField textField12 = new TextField (); 
    textField11.setPrefColumnCount(3);
    textField12.setPrefColumnCount(3); 
    hbox3.getChildren().addAll( new Label("X5:"), textField9, new Label("  Y5:"), textField10);
	hbox3.getChildren().addAll( new Label("X6:"), textField11, new Label("  Y6:"), textField12);

  	
    VBox vb = new VBox();  
    vb.setPadding(new Insets(5,5,5,5));
    Button submit = new Button("Submit");
    vb.getChildren().addAll(label1, hbox1, hbox2, hbox3, submit );  
    vb.setSpacing(10);
    vb.setAlignment(Pos.CENTER);
    Scene scene = new Scene(vb, 500, 200);
	primaryStage.setScene(scene);
	primaryStage.show();



 	submit.setOnAction(new EventHandler<ActionEvent>() {

        @Override
            public void handle(ActionEvent e) {
			     int X_1 = Integer.parseInt(textField1.getText());
			     int Y_1 = Integer.parseInt(textField2.getText());
			     int X_2 = Integer.parseInt(textField3.getText());
			     int Y_2 = Integer.parseInt(textField4.getText());
			     int X_3 = Integer.parseInt(textField5.getText());
			     int Y_3 = Integer.parseInt(textField6.getText());
			     int X_4 = Integer.parseInt(textField7.getText());
			     int Y_4 = Integer.parseInt(textField8.getText());
				 int X_5 = Integer.parseInt(textField9.getText());
			     int Y_5 = Integer.parseInt(textField10.getText());
			     int X_6 = Integer.parseInt(textField11.getText());
			     int Y_6 = Integer.parseInt(textField12.getText());

			    Pane pane = new Pane();

			    Line x = new Line(0,400,800,400);
			   	x.setStroke(Color.BLACK);
			    x.setStrokeWidth(1);
			    Line y = new Line(400,0,400,800);
			    y.setStroke(Color.BLACK);
			    y.setStrokeWidth(1);
			    pane.getChildren().addAll(x, y);
			   

			    int[] X = { X_1 + 400, 400 + X_2, 400 + X_3, 400 + X_4, 400 + X_5, 400 + X_6};
			    int[] Y = {400 - Y_1 ,400 - Y_2, 400 - Y_3, 400 - Y_4,400 - Y_5, 400 - Y_6};

			    int maxX = X[0] - 400,maxY = 400 - Y[0],minX = X[0] - 400,minY = 400 - Y[0];

			  
			    for (int i = 0; i < 6 ; i++) {
			    	if(maxX < X[i] - 400)
			    		maxX = X[i] - 400;
			    	if(minX > X[i] - 400)
			    		minX = X[i] - 400;
			    	if(maxY < 400 - Y[i])
			    		maxY = 400 - Y[i];
			    	if(minY > 400 - Y[i])
			    		minY = 400 - Y[i];
			    	Circle C = new Circle();
			    	C.setFill(Color.BLUE);
			    	C.setCenterX(X[i]);
			    	C.setCenterY(Y[i]);
			    	C.setRadius(3.5);
			     	pane.getChildren().add(C);
			     } 




 				for (int i = 0; i < 6 ; i++) {
			    Text text = new Text("("+(X[i]-400) + "," + (400 - Y[i]) + ")"); 
			    text.setX(X[i]);
			    text.setY(Y[i]);
			    pane.getChildren().add(text);
 				}

 				int[] pointX = {minX,maxX};
 				int[] pointY = {minY,maxY};

 				for(int i = 0; i < 2; i++ )
 					for (int j = 0; j < 2; j++) {
	 					Circle C = new Circle();
				    	C.setFill(Color.RED);
				    	C.setCenterX(pointX[i] + 400);
				    	C.setCenterY(400 - pointY[j]);
				    	C.setRadius(5.5);
					    pane.getChildren().add(C);
 					}


 					Line line1 = new Line( maxX + 400, -maxY + 400, maxX + 400, -minY + 400);
				    line1.setStroke(Color.RED);
				    line1.setStrokeWidth(3);
				    Line line2 = new Line( maxX + 400, -maxY + 400, minX + 400, -maxY + 400);
				    line2.setStroke(Color.RED);
				    line2.setStrokeWidth(3);
				    Line line3 = new Line( minX + 400, -minY + 400, maxX + 400, -minY + 400);
				    line3.setStroke(Color.RED);
				    line3.setStrokeWidth(3);
				    Line line4 = new Line( minX + 400, -minY + 400, minX + 400, -maxY + 400);
				    line4.setStroke(Color.RED);
				    line4.setStrokeWidth(3);
 				pane.getChildren().addAll(line1,line2,line3,line4);


			    for (int i = 0; i < 800 ; i += 100 ) {
			    	Line  A = new Line(i , 400, i, 397);
			    	A.setStroke(Color.BLUE);
			    	pane.getChildren().add(A);
			    }


			    for (int i = 0; i < 800 ; i += 100 ) {
			    	Line  A = new Line(400 , i, 403, i);
			    	A.setStroke(Color.BLUE);
			    	pane.getChildren().add(A);
			    }


			    for (int i = 0; i < 800 ; i += 100) {
			    		Text T = new Text(""+ (i - 400));
			    		T.setX(i);
			    		T.setY(415);
			    		pane.getChildren().add(T);
			    }


			    for (int i = 0; i < 800 ; i += 100) {
			    		if (400 - i == 0) 
			    			continue;
			    		Text T = new Text("" + (400 - i));
			    		T.setX(370);
			    		T.setY(i);
			    		pane.getChildren().add(T);
			    }


			    
			    Stage stage = new Stage();
			    Scene scene = new Scene(pane, 800,800);
		        stage.setTitle("Center Point");
		        stage.setScene(scene);
		        stage.show();
             }
         });

	}


}



