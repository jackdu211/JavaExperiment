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

public class ShowLine extends Application{

	@Override 
	public void start(Stage primaryStage){


	Label label1 = new Label("Please input the first Node:");  
	label1.setFont(new Font("Arial", 18));  
	label1.setTextFill(Color.RED);


	HBox hbox1 = new HBox();
	TextField textField1 = new TextField ();  
    TextField textField2 = new TextField (); 
    textField1.setPrefColumnCount(3);
    textField2.setPrefColumnCount(3);
    hbox1.getChildren().addAll( new Label("beginX:"), textField1, new Label("  beginY:"), textField2);
    hbox1.setAlignment(Pos.CENTER);
    TextField textField3 = new TextField ();  
    TextField textField4 = new TextField (); 
    textField3.setPrefColumnCount(3);
    textField4.setPrefColumnCount(3);
    hbox1.getChildren().addAll(new Label("  endX:"), textField3,  new Label("  endY:"), textField4);
    



	HBox hbox2 = new HBox();
	hbox2.setAlignment(Pos.CENTER);
	TextField textField5 = new TextField ();  
    TextField textField6 = new TextField (); 
    textField5.setPrefColumnCount(3);
    textField6.setPrefColumnCount(3); 
    hbox2.getChildren().addAll( new Label("beginX:"), textField5, new Label("  beginY:"), textField6);
    hbox2.setAlignment(Pos.CENTER);
    TextField textField7 = new TextField ();  
    TextField textField8 = new TextField (); 
    textField7.setPrefColumnCount(3);
    textField8.setPrefColumnCount(3);
    hbox2.getChildren().addAll(new Label("  endX:"), textField7,  new Label("  endY:"), textField8);



  
	Label label2 = new Label("Please input the scenod Node:");    
	label2.setFont(new Font("Arial", 18));  
	label2.setTextFill(Color.RED);
  
    VBox vb = new VBox();  
    vb.setPadding(new Insets(5,5,5,5));
    Button submit = new Button("Submit");
    vb.getChildren().addAll(label1, hbox1, label2, hbox2, submit );  
    vb.setSpacing(10);
    vb.setAlignment(Pos.CENTER);
    Scene scene = new Scene(vb, 500, 200);
	primaryStage.setScene(scene);
	primaryStage.show();


 	submit.setOnAction(new EventHandler<ActionEvent>() {

        @Override
            public void handle(ActionEvent e) {
			     int beginX = Integer.parseInt(textField1.getText());
			     int beginY = Integer.parseInt(textField2.getText());
			     int endX = Integer.parseInt(textField3.getText());
			     int endY = Integer.parseInt(textField4.getText());

			     int beginX2 = Integer.parseInt(textField5.getText());
			     int beginY2 = Integer.parseInt(textField6.getText());
			     int endX2 = Integer.parseInt(textField7.getText());
			     int endY2 = Integer.parseInt(textField8.getText());



			  	// System.out.println(endY2);

			    Pane pane = new Pane();

			    Line x = new Line(0,400,800,400);
			   	x.setStroke(Color.BLACK);
			    x.setStrokeWidth(1);
			    Line y = new Line(400,0,400,800);
			    y.setStroke(Color.BLACK);
			    y.setStrokeWidth(1);

			    Line line1 = new Line( beginX + 400, -beginY + 400, endX + 400, -endY + 400);
			    line1.setStroke(Color.RED);
			    line1.setStrokeWidth(3);
			    Line line2 = new Line( beginX2 + 400, -beginY2 + 400, endX2 + 400, -endY2 + 400);
			    line2.setStroke(Color.GREEN);
			    line2.setStrokeWidth(3);

			    pane.getChildren().addAll(x, y, line1, line2);

			    Text begin = new Text("("+beginX + "," + beginY + ")"); 
			    begin.setX( beginX + 400);
			    begin.setY( -beginY + 400);
			    Text end = new Text("("+endX + "," + endY + ")");
			    end.setX( endX + 400);
			    end.setY( -endY + 400);
			    Text begin2 = new Text("("+beginX2 + "," + beginY2 + ")"); 
			    begin2.setX( beginX2 + 400);
			    begin2.setY( -beginY2 + 400);
			    Text end2 = new Text("("+endX2 + "," + endY2 + ")");
			    end2.setX( endX2 + 400);
			    end2.setY( -endY2 + 400);



			    int[] X = { beginX + 400, 400 + beginX2, 400 + endX, 400 + endX2};
			    int[] Y = {400 - beginY,400 - beginY2, 400 - endY, 400 - endY2};


			    // int setCenterX = begi


			    for (int i = 0; i < 4 ; i++) {
			    	Circle C = new Circle();
			    	C.setFill(Color.BLUE);
			    	C.setCenterX(X[i]);
			    	C.setCenterY(Y[i]);
			    	C.setRadius(3.5);
			     	pane.getChildren().add(C);
			     } 


			    pane.getChildren().addAll(begin, end, begin2, end2);


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


			    double k1 = (beginY - endY)  * 1.0/ (beginX - endX);
			    double k2 = (beginY2 - endY2) * 1.0 / (beginX2 - endX2);

			    if (k1 == k2) {
						Text wt = new Text("两线平行无交点"); 
						wt.setX(200);
					    wt.setY(200);
					    pane.getChildren().add(wt);

			    }

			    double CENTERX = (beginY2 - beginY + k1 * beginX - k2 * beginX2) * 1.0 / (k1 - k2);
			    double CENTERY = (beginY + beginY2 - k1 * beginX - k2 * beginX2 + CENTERX *(k1 + k2)) / 2.0;

			    Circle cp = new Circle();
		    	cp.setFill(Color.BLACK);
		    	cp.setCenterX(CENTERX + 400);
		    	cp.setCenterY(400 - CENTERY);
		    	cp.setRadius(4.5);
		     	pane.getChildren().add(cp);

		     	Text ct = new Text("("+CENTERX + "," + CENTERY + ")"); 

		 
		     	ct.setX(CENTERX + 400);
			    ct.setY(400 - CENTERY);
			    pane.getChildren().add(ct);





			    
			    Stage stage = new Stage();
			    Scene scene = new Scene(pane, 800,800);
		        stage.setTitle("Show Line");
		        stage.setScene(scene);
		        stage.show();
             }
         });

	}


}




