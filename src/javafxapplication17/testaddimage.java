package javafxapplication17;
import javafx.scene.text.Text;
import java.io.IOException;
import java.awt.image.BufferedImage;
import javafx.embed.swing.SwingFXUtils; 
import javafx.scene.text.Font;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.event.Event;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.image.ImageView;
import javafx.scene.image.Image;
import javafx.stage.FileChooser;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import static javafx.application.Application.launch;
import javafx.geometry.Pos;
import javafx.animation.PauseTransition;
import javax.imageio.ImageIO;
import java.io.FileInputStream;
public class testaddimage {
    public static void st1(String st)
    {
      // List<File> images=new ArrayList<>(50);
        Stage stage=new Stage();
     int pos=0;
    FileChooser fc=new FileChooser();
    FileChooser.ExtensionFilter extJPG=new FileChooser.ExtensionFilter("JPG files (*.JPG)", ("*.JPG"));
    FileChooser.ExtensionFilter extjpg=new FileChooser.ExtensionFilter("jpg files (*.jpg)", ("*.jpg"));
    fc.getExtensionFilters().addAll(extJPG,extjpg);
    File file=new FileChooser().showOpenDialog(stage);
     try{ 
        BufferedImage bl=ImageIO.read(file);
    Image im =SwingFXUtils.toFXImage(bl, null);
    //ImageView i=new ImageView();
    //i.setImage(im);
          // StackPane root =new StackPane();
        //    root.getChildren().addAll(i);
      //  Scene scene = new Scene(root, 1350, 700);
  //  File f1=new File("test1");
   st=st+".jpg"; 
  File f2=new File("IMAGE/"+st);
  //f1.mkdir();
ImageIO.write(bl, "jpg", f2);
//f1.showSaveDialog(stage);
   //stage.setScene(scene);
   //System.out.println(f2);
  // stage.show();
   /* File f4=new File("save.JPG");
    FileInputStream fil=new FileInputStream(f4);
     BufferedImage b2=ImageIO.read(f4);
   Image im1 =SwingFXUtils.toFXImage(b2, null);
    ImageView i=new ImageView();
    i.setImage(im1);
           StackPane root =new StackPane();
            root.getChildren().addAll(i);
        Scene scene = new Scene(root, 1350, 700);
        stage.setScene(scene);
         stage.show();*/
     }
     catch(IOException ex)
     {
         
     }
     
    }
      
    
}
