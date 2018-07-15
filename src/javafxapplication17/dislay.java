package javafxapplication17;
import java.util.Random;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.ParallelTransition;
import javafx.animation.PathTransition;
import javafx.animation.PauseTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.image.ImageView;
import javafx.scene.Node;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.text.Text;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.util.Duration;
import javafx.scene.shape.HLineTo;
import javafx.scene.shape.Path;
import javafx.scene.shape.CubicCurveTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Shape;
import javafx.scene.control.CheckBox;
public class dislay {
    public static void st1(ObservableList<String>  string) {
      
        ImageView im =new ImageView();
        Random rand=new Random();
         Image im3=new Image("file:IMAGE/"+string.get(0)+".jpg");
       Image img1=new Image("file:add.jpg");
       String[] stt=new String[10];
       stt[0]=string.get(0);
              int[] a=new int[12];
a[1]=2;
        //ImageView i=new ImageView();
       im.setImage(img1);
       im.setFitHeight(310);
       im.setFitWidth(350);
           

        Stage primaryStage=new Stage();
        Button btn = new Button("next");
      Path path = new Path();
            TextArea TA=new TextArea();

                  Group gr=new Group();
                  Text T11=new Text();
                                    Text T12=new Text("X! WORNG ANSWAR!!!");

            T11.setStyle("-fx-font: 15 arial; -fx-base: #955666; -fx-background-radius: 10; -fx-text-fill: #F6888866");
Font f122=Font.font("Serif", FontWeight.EXTRA_BOLD,FontPosture.ITALIC,50);
        T11.setFont(f122);
        T12.setFont(f122);
            TA.setStyle("-fx-font: 20 arial; -fx-base: #5884; -fx-background-radius: 10; -fx-text-fill: #FFFFFF");
TA.setPrefSize(10, 3);
       Random ra=new Random();
     
                Button btn5 = new Button("next");
        Button btn1 = new Button();
        Button btn2 = new Button();
        Button btn3 = new Button();
        Button btn4 = new Button();
        btn2.setText(string.get(0));
        int g=string.size()-1;
        int a1=ra.nextInt(g)+1;
        int a2=ra.nextInt(g)+1;
        int a3=ra.nextInt(g)+1;
        //int a4=ra.nextInt(g);
        btn1.setText(string.get(3));
                btn3.setText(string.get(2));
        btn4.setText(string.get(1));

        btn1.setMinSize(800, 64);
                btn3.setMinSize(800, 64);
        btn2.setMinSize(800, 64);
        btn4.setMinSize(800, 64);
        btn3.setMinSize(800, 64);
        btn1.setMaxSize(800, 64);
        btn2.setMaxSize(800, 64);
        btn3.setMaxSize(800, 64);
        btn4.setMaxSize(800, 64);
        btn.setMaxSize(350, 64);
        btn.setMinSize(350, 64);

Button btn22 = new Button("      Back     ");
Button btn32 = new Button("       Exit      ");
         btn.setStyle("-fx-font: 25 arial; -fx-base: #5FB951; -fx-background-radius: 10; -fx-text-fill: #FFFFFF");

         btn22.setStyle("-fx-font: 25 arial; -fx-base: #DFB951; -fx-background-radius: 100; -fx-text-fill: #FFFFFF");
      btn32.setStyle("-fx-font: 25 arial; -fx-base: #DFB951; -fx-background-radius: 100; -fx-text-fill: #FFFFFF");
      btn1.setStyle("-fx-font: 32 arial; -fx-base: #5FB951; -fx-background-radius: 10; -fx-text-fill: #FFFFFF");
      btn2.setStyle("-fx-font: 32 arial; -fx-base: #5FB951; -fx-background-radius: 10; -fx-text-fill: #FFFFFF");
      btn3.setStyle("-fx-font: 32 arial; -fx-base: #5FB951; -fx-background-radius: 10; -fx-text-fill: #FFFFFF");
      btn4.setStyle("-fx-font: 32 arial; -fx-base: #5FB951; -fx-background-radius: 10; -fx-text-fill: #FFFFFF");
          HBox H=new HBox();
                    VBox V5=new VBox();
          HBox H4=new HBox();
          HBox H6=new HBox();
          HBox H7=new HBox();

                    VBox V2=new VBox();
                     HBox H2=new HBox();

          VBox V=new VBox();
          Text T1=new Text("");
                    Text T3=new Text("Nnme Of The Birds");
          Text T4=new Text("0");

         // File F=new File()
          ImageView i3=new ImageView();
          i3.setImage(im3);
                    i3.setFitHeight(480);
                    i3.setFitWidth(800);
                    try{
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                im.setImage(img1);
                 if(a[0]<string.size()-1)
                {
                    a[0]++;
                    
                }
                else
                {
                    F1.st1();
                    primaryStage.close();
                }
              
                   Image im1=new Image("file:IMAGE/"+string.get(a[0])+".jpg");
               i3.setImage(im1);
                    int a1=ra.nextInt(4)+1;
                    if(a1==1)
                    {
                        int t=0;
                        int f=string.size();
                        btn1.setText(string.get(a[0]));
                        a[1]=1;
                        while(t<3)
                        {
                             int a2=ra.nextInt(f);
                             if(a2!=a[0])
                             {
                                 t++;
                                 if(t==1)
                                     btn2.setText(string.get(a2));
                                     if(t==2)
                                     btn3.setText(string.get(a2));
                                     if(t==3)
                                     btn4.setText(string.get(a2));
                             }
                           
                        }
                    }
                   
               if(a1==2)
                    {
                        int t=0;
                        int f=string.size();
                        btn2.setText(string.get(a[0]));
                        a[1]=2;
                        while(t<3)
                        {
                             int a2=ra.nextInt(f);
                             if(a2!=a[0])
                             {
                                 t++;
                                 if(t==1)
                                     btn1.setText(string.get(a2));
                                     if(t==2)
                                     btn3.setText(string.get(a2));
                                     if(t==3)
                                     btn4.setText(string.get(a2));
                             }
                           
                        }
                    }
                   
               if(a1==3)
                    {
                        int t=0;
                        int f=string.size();
                        btn3.setText(string.get(a[0]));
                        a[1]=3;
                        while(t<3)
                        {
                             int a2=ra.nextInt(f);
                             if(a2!=a[0])
                             {
                                 t++;
                                 if(t==1)
                                     btn2.setText(string.get(a2));
                                     if(t==2)
                                     btn1.setText(string.get(a2));
                                     if(t==3)
                                     btn4.setText(string.get(a2));
                             }
                           
                        }
                    }
               if(a1==4)
                    {
                        int t=0;
                        int f=string.size();
                        btn4.setText(string.get(a[0]));
                        a[1]=4;
                        while(t<3)
                        {
                             int a2=ra.nextInt(f);
                             if(a2!=a[0])
                             {
                                 t++;
                                 if(t==1)
                                     btn2.setText(string.get(a2));
                                     if(t==2)
                                     btn3.setText(string.get(a2));
                                     if(t==3)
                                     btn1.setText(string.get(a2));
                             }
                           
                        }
                    }
                   
                   
               
               
               
            }
        });
                    }
                    catch(Exception ee)
                    {
                        
                    }
               Image img=new Image("file:save.JPG");
               // i3.setImage(img);
 StackPane S=new StackPane();
  StackPane S1=new StackPane();
 StackPane S2=new StackPane();
  StackPane SA=new StackPane();
  StackPane SB=new StackPane();
  StackPane SC=new StackPane();
  StackPane SD=new StackPane();
  SD.setPrefSize(333, 168);
    S.setPrefSize(350, 310);
  S.getChildren().add(T4);
    SA.setPrefSize(333, 168);
  SC.setPrefSize(333, 168);
  SB.setPrefSize(333, 168);
   
   btn1.setOnAction(new EventHandler<ActionEvent>() {
           
            @Override
            public void handle(ActionEvent event) {
                if(a[1]==1)
                {
                    Image img22=new Image("file:Rig.gif");
                    im.setImage(img22);
                    a[2]=a[2]+3;
                   String sr=Integer.toString(a[2]);
                    T4.setText(sr);
                    
                }
                else
                {
                    Image img22=new Image("file:wor.gif");
                    im.setImage(img22);
                    a[2]=a[2]-1;
                     String sr=Integer.toString(a[2]);
                    T4.setText(sr);
                }
          
            }
        });
  btn2.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
            if(a[1]==2)
                {
                    Image img22=new Image("file:Rig.gif");
                    im.setImage(img22);
                    a[2]=a[2]+3;
                   String sr=Integer.toString(a[2]);
                    T4.setText(sr);
                }
                else
                {
                    Image img22=new Image("file:wor.gif");
                    im.setImage(img22);
                    a[2]=a[2]-1;
                     String sr=Integer.toString(a[2]);
                    T4.setText(sr);
                    
                }
               
            }
        });
  
  btn3.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
            if(a[1]==3)
                {
                    Image img22=new Image("file:Rig.gif");
                    im.setImage(img22);
                    a[2]=a[2]+3;
                   String sr=Integer.toString(a[2]);
                    T4.setText(sr);
                }
                else
                {
                    Image img22=new Image("file:wor.gif");
                    im.setImage(img22);
                    a[2]=a[2]-1;
                     String sr=Integer.toString(a[2]);
                    T4.setText(sr);
                }
               
            }
        });
  btn4.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
            if(a[1]==4)
                {
                    Image img22=new Image("file:Rig.gif");
                    im.setImage(img22);
                    a[2]=a[2]+3;
                   String sr=Integer.toString(a[2]);
                    T4.setText(sr);
                }
                else
                {
                    Image img22=new Image("file:wor.gif");
                    im.setImage(img22);
                    a[2]=a[2]-1;
                     String sr=Integer.toString(a[2]);
                    T4.setText(sr);
                }
               
            }
        });
  btn22.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
              
             F1.st1();
             primaryStage.close();
             
                
            }
        });
  btn32.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
              
              primaryStage.close();
             
                
            }
        });


    H.setBorder(new Border(new BorderStroke(Color.AQUAMARINE,BorderStrokeStyle.SOLID,CornerRadii.EMPTY,BorderWidths.FULL)));
                 V.setBorder(new Border(new BorderStroke(Color.BISQUE,BorderStrokeStyle.SOLID,CornerRadii.EMPTY,BorderWidths.FULL)));

        Text tx=new Text("         Your Score");
                Text tx1=new Text("   Chose The Name of The Birds Which Showing in The Image From Given Option Below ");

        Font f1=Font.font("Serif", FontWeight.EXTRA_BOLD,FontPosture.ITALIC,35);
        tx.setFont(f1);
        tx1.setFont(f1);
                T3.setFont(f1);
        T4.setFont(f1);
S.setStyle("-fx-background-color:green");
 tx.setX(50);
        tx.setY(50);

        VBox show = new VBox();
     
        show.getChildren().addAll(im,tx,S,btn);
            
        SA.getChildren().add(btn1);
        SB.getChildren().add(btn2);
        SC.getChildren().add(btn3);
        SD.getChildren().add(btn4);
          
           V.getChildren().addAll(i3,btn1,btn2,btn3,btn4);
                H.getChildren().addAll(V,show,V2);

      V2.getChildren().addAll(btn32,btn22);
       
               Scene scene = new Scene(H, 1330, 750);

        primaryStage.setTitle("");
        primaryStage.setScene(scene);
       // List.st1();
       primaryStage.show();
    }

  
    
}
