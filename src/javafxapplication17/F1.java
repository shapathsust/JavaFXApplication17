package javafxapplication17;
import javafx.animation.PauseTransition;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.layout.VBox;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.Background;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;
import javafx.stage.StageStyle;
import javafx.util.Duration;
public class F1  {
    
    public static void st1(){
        Stage primaryStage=new Stage();
       StackPane root1 =new StackPane();
       VBox V=new VBox(30);
       Image img=new Image("file:save.JPG");
        BackgroundSize BS=new BackgroundSize(1350,700,true,true,true,false);
        BackgroundImage BI=new BackgroundImage(img,BackgroundRepeat.REPEAT,BackgroundRepeat.NO_REPEAT,BackgroundPosition.CENTER,BS);
        Background B=new Background(BI);
      Button b1=new Button("See All");
      Button b2=new Button("Lesson");
      Button b4=new Button("Include");
      Button b3=new Button(" About ");
        Button b5=new Button("  Exit    ");
         PauseTransition delay=new PauseTransition(Duration.seconds(1));
           delay.setOnFinished(event ->primaryStage.close() );
   b5.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
              
              primaryStage.close();
            }
        });
          

   b1.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
              
              List.st1();
              delay.play();

            }
        }); 
   b4.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
              Add.st1();
               primaryStage.show();

            }
        });
   b2.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
             selected.st1();
            primaryStage.close();
        
            }
        }); b3.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
              About.s1();
            }
        });
      V.getChildren().addAll(b3,b1,b2,b4,b5);
      b1.setStyle("-fx-font: 46 arial; -fx-base: #DFB951; -fx-background-radius: 10; -fx-text-fill: #FFFFFF");
      b2.setStyle("-fx-font: 46 arial; -fx-base: #DFB951; -fx-background-radius: 10; -fx-text-fill: #FFFFFF");
      b4.setStyle("-fx-font: 46 arial; -fx-base: #DFB951; -fx-background-radius: 10; -fx-text-fill: #FFFFFF");
            b3.setStyle("-fx-font: 46 arial; -fx-base: #DFB951; -fx-background-radius: 10; -fx-text-fill: #FFFFFF");
            b5.setStyle("-fx-font: 46 arial; -fx-base: #DFB951; -fx-background-radius: 10; -fx-text-fill: #FFFFFF");

      root1.getChildren().addAll(V);
      root1.setBackground(B);
       primaryStage.initStyle(StageStyle.UNDECORATED);
            
          Scene scene1 = new Scene(root1, 1380, 730);
         root1.setBorder(new Border(new BorderStroke(Color.DARKORANGE,BorderStrokeStyle.SOLID,CornerRadii.EMPTY,BorderWidths.DEFAULT)));

         V.setAlignment(Pos.CENTER);
        primaryStage.setTitle("");
        primaryStage.setScene(scene1);
      
       primaryStage.show();
              
    }
    
}

