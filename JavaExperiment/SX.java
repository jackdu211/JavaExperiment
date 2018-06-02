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

public class SX extends Application {
 /*  public static void main(String[] args) {
        Application.launch(args);
    }
*/
    @Override
    public void start(Stage stage) {
       
        
        Pane pane = new Pane();

        for (int i = 0; i <= 360 ; i += 30 ) {
            Arc arc = new Arc();
            arc.centerXProperty().bind(pane.widthProperty().divide(2));
            arc.centerYProperty().bind(pane.heightProperty().divide(2));
            // arc.setCenterX(210);
            // arc.setCenterY(300);
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




         String[] SX = {"鼠","牛","虎","兔","龙","蛇","马","羊","猴","鸡","狗","猪"};

        for (int i = 0; i < 12 ; i++) {

            
            Text text = new Text((210 + Math.cos(Math.PI * i / 6.0 +  Math.PI / 12.0) * 190 ), (300 + Math.sin(Math.PI * i / 6.0 +  Math.PI / 12.0) * 190 ), SX[i]);
           
            pane.getChildren().add(text);
        }






        Label label1 = new Label("Please input a year:");  
        TextField textField = new TextField ();  
        HBox hb = new HBox();  
        hb.setPadding(new Insets(5,5,5,5));
        Button submit = new Button("Submit");
        hb.getChildren().addAll(label1, textField, submit );  
        hb.setSpacing(10); 
        pane.getChildren().add(hb);

             

        Arc arc = new Arc();
        arc.centerXProperty().bind(pane.widthProperty().divide(2));
        arc.centerYProperty().bind(pane.heightProperty().divide(2));
        arc.setRadiusX(175);
        arc.setRadiusY(175);
        arc.setLength(30);
        arc.setFill(Color.RED);
        arc.setType(ArcType.ROUND);
        pane.getChildren().add(arc);


        Scene scene = new Scene(pane, 420,600);
        stage.setTitle("Show Circle");
        stage.setScene(scene);
        stage.show();



       submit.setOnAction(new EventHandler<ActionEvent>() {

        @Override
            public void handle(ActionEvent e) {
               int year = Integer.parseInt(textField.getText());
               System.out.print(year);
               int temp = year - 1923;
               int sx = temp % 12;
               arc.setStartAngle(- sx * 30);

             }
         });
 


    }
}