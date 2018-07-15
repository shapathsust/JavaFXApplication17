package javafxapplication17;
import java.io.File;
import javafx.scene.text.Text;
import javafx.scene.control.TextField;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.geometry.Pos;
import javafx.scene.layout.VBox;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.Background;
import javafx.embed.swing.SwingFXUtils; 
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import javax.imageio.ImageIO;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;
class Add  {
    
    public static void st1(){
        Stage primaryStage=new Stage();
       StackPane root1 =new StackPane();
       VBox V=new VBox(30);
      final FileChooser fc=new FileChooser();
       File f4=new File("add.JPG");
       try{
        FileInputStream fil=new FileInputStream(f4);
     BufferedImage b2=ImageIO.read(f4);
   Image im1 =SwingFXUtils.toFXImage(b2, null);
    ImageView i=new ImageView();
    i.setImage(im1);
      
       i.setFitHeight(700);
      
        BackgroundSize BS=new BackgroundSize(1350,700,true,true,true,false);
        BackgroundImage BI=new BackgroundImage(im1,BackgroundRepeat.REPEAT,BackgroundRepeat.NO_REPEAT,BackgroundPosition.CENTER,BS);
        Background B=new Background(BI);
    
      TextField b1=new TextField();
      b1.setMaxWidth(190);
     b1.setMinWidth(600);
       Text tx=new Text("Enter The Name of The Bird");
        tx.setX(50);
        tx.setY(50);
        Font f1=Font.font("Green", FontWeight.EXTRA_BOLD,FontPosture.ITALIC,50);
        tx.setFont(f1);
      //Button b2=new Button(" Exam ");
      Button b4=new Button(" OK ");
      Button b3=new Button("  Text  ");
      b4.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
      String st=  b1.getText();
      testaddimage.st1(st);
      Entertext.st(st);
      primaryStage.close();
            }
        });
      DropShadow D=new DropShadow();
 ///System.out.println(st);
      D.setColor(Color.CORNFLOWERBLUE);
      V.getChildren().addAll(tx,b1,b4);
      b1.setStyle("-fx-font: 46 arial; -fx-base: #999999; -fx-background-radius: 10; -fx-text-fill: #FFFFFF");
     b3.setStyle("-fx-font: 46 arial; -fx-base: #8343; -fx-background-radius: 10; -fx-text-fill: #FFFFFF");
      b4.setStyle("-fx-font: 46 arial; -fx-base: #8343; -fx-background-radius: 10; -fx-text-fill: #FFFFFF");
      root1.getChildren().addAll(V);
      root1.setBackground(B);
           root1.setBorder(new Border(new BorderStroke(Color.DARKORANGE,BorderStrokeStyle.DASHED,CornerRadii.EMPTY,BorderWidths.DEFAULT)));

          Scene scene1 = new Scene(root1, 1350, 800);
         V.setAlignment(Pos.CENTER);
        primaryStage.setTitle("");
        primaryStage.setScene(scene1);
      
       primaryStage.show();
       }
       catch(IOException e)
       {
           
       }
                
    }
    
}

