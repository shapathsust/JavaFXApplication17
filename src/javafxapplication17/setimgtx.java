
package javafxapplication17;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import java.io.IOException;
 import java.io.File;
 import java.io.BufferedReader;
import javafx.scene.text.Text;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.paint.Color;
import javafx.geometry.Pos;
import javafx.scene.layout.VBox;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import java.io.File;
 import java.io.*;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.layout.HBox;
import javafx.stage.Modality;
public class setimgtx
{
    
    public static void st1( ObservableList<String>  string)
    {
       
        Stage stage=new Stage();
                VBox Va=new VBox();
                 Button b2=new Button(" Exit ");
      Button b1=new Button("Back");
            Button b3=new Button("     Exam     ");
            Button b4=new Button("            ");
                        Button b7=new Button("           ");


            Button b5=new Button("Next");
                        Button b50=new Button("Chose From Picture");
            Button b51=new Button("Chose From Name");
      b50.setStyle("-fx-font: 26 arial;  -fx-base: #399999; -fx-background-radius: 100; -fx-text-fill: #FFFFFF");
      b51.setStyle("-fx-font: 26 arial;  -fx-base: #399999; -fx-background-radius: 100; -fx-text-fill: #FFFFFF");
Stage stage10=new Stage();
            stage10.initModality(Modality.APPLICATION_MODAL);

                      b50.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
              stage10.close();
              stage.close();
              dislay.st1(string);
            }
        });
                          b51.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
              stage10.close();
              stage.close();
              exam2.st1(string);
            }
        });
                       

                      VBox Va10=new VBox(10);
                                    Va10.setStyle("-fx-font: 26 arial; -fx-base: #399999; -fx-background-radius: 10; -fx-text-fill: #FFFFF");

                      Va10.getChildren().addAll(b50,b51);
                      Va10.setAlignment(Pos.CENTER);
                                      Scene scene10 = new Scene(Va10,400,200);
                                      stage10.setScene(scene10);
                                      


            Button b6=new Button("Prev");
        TextArea T1=new TextArea();
        T1.setPrefSize(600, 630);
      TextField t=new TextField();
      TextField t1=new TextField();
      b1.setStyle("-fx-font: 46 arial;  -fx-base: #399999; -fx-background-radius: 100; -fx-text-fill: #FFFFFF");
      b2.setStyle("-fx-font: 46 arial; -fx-base: #399999; -fx-background-radius: 100; -fx-text-fill: #FFFFFF");
       b3.setStyle("-fx-font: 46 arial; -fx-base: #399999; -fx-background-radius: 100; -fx-text-fill: #FFFFFF");
              b4.setStyle("-fx-font: 46 arial; -fx-base: #399999; -fx-background-radius: 100; -fx-text-fill: #FFFFFF");
       b5.setStyle("-fx-font: 46 arial; -fx-base: #399999; -fx-background-radius: 100; -fx-text-fill: #FFFFFF");
              b6.setStyle("-fx-font: 46 arial; -fx-base: #399999; -fx-background-radius: 100; -fx-text-fill: #FFFFFF");
       b7.setStyle("-fx-font: 46 arial; -fx-base: #399999; -fx-background-radius: 100; -fx-text-fill: #FFFFFF");
       b4.setStyle("-fx-font: 46 arial; -fx-base: #399999; -fx-background-radius: 100; -fx-text-fill: #FFFFFF");
              T1.setStyle("-fx-font: 18 arial; -fx-base: #399999; -fx-background-radius: 1; -fx-text-fill: #111111");

       ImageView i=new ImageView();
        b2.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
              
              stage.close();
             
                
            }
        });
        b3.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
              
                stage10.show();
               
       
             
                
            }
        });
         b1.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
             
                F1.st1();
                stage.close();
             
                
            }
        });
       int[] a=new int[12];
       Image im=new Image("file:IMAGE/"+string.get(0)+".jpg");
        String  f3=string.get(a[0]);
                                File file=new File("TEXT/"+f3+".txt");
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
                                                T1.setText(con.toString());
                           
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
                
       i.setImage(im);
        i.setFitHeight(650);
                    i.setFitWidth(800);
           t.setPrefSize(70, 90);
           t.setVisible(false);
           b7.setVisible(false);
           b4.setVisible(false);
            b5.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                if(a[0]<string.size()-1)
                {
                    a[0]++;
                    
                }
                else
                {
                    a[0]=0;
                    
                }
                
                 String  f3=string.get(a[0]);
                                File file=new File("TEXT/"+f3+".txt");
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
                                                T1.setText(con.toString());
                          
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
                
                
                Image im1=new Image("file:IMAGE/"+string.get(a[0])+".jpg");
               i.setImage(im1);
            }
        });
            b6.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                if(a[0]>0)
                {
                    a[0]--;
                    
                }
                else
                {
                    a[0]=string.size()-1;
                    
                }
                
                
                String  f3=string.get(a[0]);
                                File file=new File("TEXT/"+f3+".txt");
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
                                                T1.setText(con.toString());
                          
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
                
   
                
                
                Image im1=new Image("file:IMAGE/"+string.get(a[0])+".jpg");
               i.setImage(im1);
            }
        });
           HBox Ha=new HBox();
           HBox H1=new HBox();
           H1.getChildren().addAll(b3,b4,b6,b5,b7,b1,b2);
          Va.getChildren().add(H1);
          Va.setStyle("-fx-font: 46 arial; -fx-base: #399999; -fx-background-radius: 5; -fx-text-fill: #10FFFFF");
          Va.getChildren().add(Ha);
        
        Ha.getChildren().addAll(T1,i);
         Scene scene1 = new Scene(Va, 1370, 750);
        stage.setScene(scene1);
        stage.show();


    }
}
