
package javafxapplication17;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Shapath
 */
public class About{
    
    
    public static void s1() {
       Stage primaryStage=new Stage();
       TextArea T10=new TextArea();
              T10.setStyle("-fx-font: 26 arial; -fx-base: #F99999; -fx-background-radius: 10; -fx-text-fill: #FFFFF");
        
        
          String  f3="About";
                                File file=new File(f3+".txt");
               // t.setText(f3);                            
                                StringBuilder con=new StringBuilder();


             try{
                       
              BufferedReader input=new BufferedReader(new FileReader(file));

                   try
                   {
                       String line=null;
                       while((line=input.readLine())!=null)
                       {
                           con.append(line);
                           con.append(System.getProperty("line.separator"));
                                                  T10.setText(con.toString());
                                                //tx1.setText(con.toString());
                                                  // pan.getChildren().add(tx1);
                       }
                       
                   }
                   finally
                   {
                       input.close();
                   }
                   }
                   catch(IOException eb)
                           {
                          eb.printStackTrace();
                           }
                             //if(con.to)
                        Scene scene = new Scene(T10, 1350, 700);

        primaryStage.setTitle("About");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

   
    
}
