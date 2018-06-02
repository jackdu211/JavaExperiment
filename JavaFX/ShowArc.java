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

public class ShowArc extends Application{


	@Override 
	public void start(Stage stage){

	Pane pane = new Pane();


	for (int i = 0; i <= 360 ; i += 30 ) {
		Arc arc = new Arc();
		arc.centerXProperty().bind(pane.widthProperty().divide(2));
		arc.centerYProperty().bind(pane.heightProperty().divide(2));
        arc.setRadiusX(175);
        arc.setRadiusY(175);
        arc.setStartAngle(i);
        arc.setLength(30);
        arc.setType(ArcType.ROUND);
		arc.setFill(Color.WHITE);
		arc.setStroke(Color.RED);
		arc.setType(ArcType.ROUND);
		pane.getChildren().add(arc);
	}

	



	Scene scene = new Scene(pane, 500, 500);
	stage.setTitle("Show Circle");
	stage.setScene(scene);
	stage.show();


	}
}
