package javafxapplication17;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.image.ImageView;
import javafx.scene.image.Image;
import static javafx.application.Application.launch;
import javafx.geometry.Pos;
import javafx.animation.PauseTransition;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;
import javafx.stage.StageStyle;
public class ProjectFinal extends Application {
    
    @Override
    public void start(Stage primaryStage) {
       
       StackPane root =new StackPane();
       ImageView im =new ImageView();
       Image img=new Image("file:My Animation.gif");
       im.setImage(img);
       im.setFitHeight(700);
       im.setFitWidth(1350);
       root.setAlignment(Pos.CENTER);
      
        root.getChildren().addAll(im);
        Scene scene = new Scene(root, 1370, 720);
        primaryStage.setTitle("");
       PauseTransition delay=new PauseTransition(Duration.seconds(6.253));
          PauseTransition delay1=new PauseTransition(Duration.seconds(6.2));
       primaryStage.initStyle(StageStyle.UNDECORATED);

            primaryStage.setScene(scene);
           delay.setOnFinished(event ->primaryStage.close() );
           delay1.setOnFinished(event ->F1.st1() );
         root.setBorder(new Border(new BorderStroke(Color.BLUE,BorderStrokeStyle.SOLID,CornerRadii.EMPTY,BorderWidths.FULL)));

 primaryStage.show();
       delay.play();
        delay1.play();
       // primaryStage.setOpacity(7999999878L);
          //  ForAddImageAndClass fit=new ForAddImageAndClass();
            //directory.st1();
        // fit.st1();
      //Entertext.st();
   //listofbirds.st1();
         //List Li=new List();
// List.st1();
         //dislay.st1();
        // Add.st1();
         //ForAddImageAndClass.st1();
        //primaryStage.close();
       // FA5.st1();
     // F1.st1();
       //selected.st1();
      // setimgtx.st1();
         //exam2.st1();
         //uni.st1();
        // dislay.st1();
        //primaryStage.setScene(scene1);
      // primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}

