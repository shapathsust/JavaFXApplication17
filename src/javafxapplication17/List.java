 package javafxapplication17;
import java.io.IOException;
 import java.io.BufferedReader;
import javafx.scene.text.Text;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.layout.VBox;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import java.io.File;
 import java.io.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Orientation;
import javafx.scene.control.ListView;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
 import javafx.scene.layout.BorderStroke;
 import javafx.scene.layout.Border;
import javafx.stage.StageStyle;
public class List {
    
    public static void st1()
    {
         //VBox imag =new VBox();
        StackPane S=new StackPane();
                StackPane S1=new StackPane();            
                StackPane S2=new StackPane();
                Stage stage1=new Stage();
                 Stage stage3=new Stage();
                String[] string=new String[200];
                Text tx1=new Text();
                String name="";
        tx1.setX(50);
        tx1.setY(50);
        Font f77=Font.font("Serif", FontWeight.EXTRA_BOLD,FontPosture.ITALIC,50);
        tx1.setFont(f77);
     
S1.setPrefSize(1250, 700);
       S.setPrefSize(600,500);
        File folder=new File("IMAGE");
        File[] L=folder.listFiles();
         Image im1=new Image("file:IMAGE/"+L[0].getName());
          TextArea T1=new TextArea("file:TEXT/"+L[0].getName());
                    ImageView i3=new ImageView();
                     ImageView i77=new ImageView(); 
                     i77.setImage(im1);
                    i77.setFitHeight(700);
                    i77.setFitWidth(1150);
                    i3.setImage(im1);
                    i3.setFitHeight(500);
                    i3.setFitWidth(600);
               S.getChildren().add(i3);
               S1.getChildren().add(i77);
        Stage stage=new Stage();
        ListView<Text> list =new ListView<Text>();
        ListView<Pane>li=new ListView<Pane>();
        li.setOrientation(Orientation.HORIZONTAL);
         Button b2=new Button(" Exit ");
      Button b1=new Button("Back");
            Button b3=new Button("      Open      ");
            Button b4=new Button("");
            Button b5=new Button("    About    ");
      TextField t=new TextField();
      TextField t1=new TextField();
    String se=L[0].getName();
      b1.setStyle("-fx-font: 46 arial; -fx-background-radius: 100; -fx-text-fill: #FFFFFF");
      b2.setStyle("-fx-font: 46 arial;-fx-background-radius: 100; -fx-text-fill: #FFFFFF");
       b3.setStyle("-fx-font: 46 arial;-fx-background-radius: 100; -fx-text-fill: #FFFFFF");
              b4.setStyle("-fx-font: 46 arial;-fx-background-radius: 100; -fx-text-fill: #FFFFFF");
       b5.setStyle("-fx-font: 46 arial;-fx-background-radius: 100; -fx-text-fill: #FFFFFF");
              t.setStyle("-fx-font: 46 arial;-fx-background-radius: 5; -fx-text-fill: #F");
     t.setPrefSize(70, 90);
           t.setVisible(false);
           b5.setVisible(false);
            b4.setVisible(false);
   S.setBorder(new Border(new BorderStroke(Color.DARKORANGE,BorderStrokeStyle.SOLID,CornerRadii.EMPTY,BorderWidths.FULL)));
        HBox H=new HBox(10);
        HBox H1=new HBox(4);
        VBox V=new VBox();
        TextArea T10=new TextArea();
              T10.setStyle("-fx-font: 26 arial; -fx-base: #F99999; -fx-background-radius: 10; -fx-text-fill: #FFFFF");

        StackPane pan=new StackPane();
                    H.setStyle("-fx-font:  arial; -fx-base: #444444; -fx-background-radius: 10; -fx-text-fill: #FFFFFF");
      V.getChildren().add(H1);
    
              V.getChildren().add(S);
             V.getChildren().add(li);
        H1.getChildren().addAll(b5,t,b3,b4,b1,b2);
       H.getChildren().add(list);
        H.getChildren().add(V);
           String ss="";

        for( int i=0;i<L.length;i++)
        {
                String f1=L[i].getName(),f,f3;
               f=f1.replaceFirst(".jpg","");
                               string[i]=f;

               ss=f;
              Text T=new Text();
               T.setFill(Color.DARKSLATEBLUE);
                 T.setX(50);
          // f3=f+".txt";
                  
       Font f2=Font.font( "Serif",FontWeight.EXTRA_BOLD,FontPosture.REGULAR,30);

        T.setFont(f2);
                T.setText(f);
                 list.getItems().add(T);
                  Image im10=new Image("file:IMAGE/"+f+".jpg");
                              ImageView i4=new ImageView();
                               ImageView i78=new ImageView(); 
                     i78.setImage(im10);
                    i78.setFitHeight(700);
                    i78.setFitWidth(850);
                     i4.setImage(im10);
                   i4.setFitHeight(500);
                   i4.setFitWidth(600);
      T.addEventHandler(MouseEvent.MOUSE_ENTERED,new EventHandler<MouseEvent>()
      {

         @Override
         public void handle(MouseEvent e)
         {
                        i77.setImage(im10);
                   S.getChildren().remove(0);
                  S.getChildren().add(i4);
                 S1.getChildren().remove(0);
                 S1.getChildren().add(i78);
                t.setText(f);
                
                 
          }
               
      } );
      Pane P1=new Pane();
        Pane P4=new Pane();
        P1.setPrefSize(130, 145);
       ImageView i8=new ImageView();
        i8.setImage(im10);
         
                    //i8.setImage(im10);
                    i8.setFitHeight(130);
                    i8.setFitWidth(145);
                   //S.getChildren().add(i3);
                    
                  P1.getChildren().add(i8);
                  li.getItems().add(P1);
 P1.addEventHandler(MouseEvent.MOUSE_ENTERED,new EventHandler<MouseEvent>()
      {

         @Override
         public void handle(MouseEvent e)
         {
                    i77.setImage(im10);
                   S.getChildren().remove(0);
                  S.getChildren().add(i4);
                 S1.getChildren().remove(0);
                 S1.getChildren().add(i78);
                t.setText(f);


          }
               
      } );
          
   
       }
         S2.getChildren().add(i77);
         Scene scene4 = new Scene(S2, 1200, 750);
        stage3.setScene(scene4);
         b3.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
             
                stage3.show();
             
                
            }
        });
         
           b1.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
             
                F1.st1();
                stage.close();
             
                
            }
        });
         b2.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
              
              stage.close();
             
                
            }
        });
       
           H.setBorder(new Border(new BorderStroke(Color.BLACK,BorderStrokeStyle.SOLID,CornerRadii.EMPTY,BorderWidths.FULL)));
                           stage.initStyle(StageStyle.UNDECORATED);

        Scene sc=new Scene(H,1360,720);
             StackPane root = new StackPane();
        HBox H5=new HBox();
        
        Scene scene1 = new Scene(T10, 1300, 710);
       

        stage1.setScene(scene1);
        
        list.addEventHandler(MouseEvent.MOUSE_CLICKED,new EventHandler<MouseEvent>()
      {

         @Override
         public void handle(MouseEvent e)
         {
             if(list.getSelectionModel().getSelectedIndex()>-1)
                     {
                 
           
          String  f3=list.getSelectionModel().getSelectedItem().getText();
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
                                                T10.setText(con.toString());
                           
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
                
                                

             stage1.show();
             }
          }
               
      } );
        
          li.addEventHandler(MouseEvent.MOUSE_CLICKED,new EventHandler<MouseEvent>()
      {

         @Override
         public void handle(MouseEvent e)
         {
             if(li.getSelectionModel().getSelectedIndex()>-1)
                     {
                 
          
          String  f3=string[li.getSelectionModel().getSelectedIndex()];
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
                                                  T10.setText(con.toString());
                                              
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
                
                                

             stage1.show();
             }
          }
               
      } );
          
        stage.setScene(sc);
        stage.show();
    }
    
}    
 
              
       


