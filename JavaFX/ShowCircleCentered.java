import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.*;
public class ShowCircleCentered extends Application{

	@Override
	public void start(Stage stage){


		/*Circle not always in the center */


	/*	Pane pane = new Pane();
		Circle circle = new Circle();
		circle.setCenterX(100);
		circle.setCenterY(100);
		circle.setRadius(50);
		circle.setStroke(Color.RED);
		circle.setFill(Color.BLUE);
		pane.getChildren().add(circle);

		Label label = new Label("FONT");
		pane.getChildren().add(label);
		Scene scene = new Scene(pane, 200, 200);
		stage.setTitle("Show Circle");
		stage.setScene(scene);
		stage.show();
*/









		Pane pane = new Pane();
		Circle circle = new Circle();
		circle.centerXProperty().bind(pane.widthProperty().divide(2));
		circle.centerYProperty().bind(pane.heightProperty().divide(2));
		circle.setRadius(50);
		circle.setStroke(Color.RED);
		circle.setFill(Color.BLUE);
		pane.getChildren().add(circle);

		Scene scene = new Scene(pane, 200, 200);
		stage.setTitle("Show Circle");
		stage.setScene(scene);
		stage.show();

	}
}