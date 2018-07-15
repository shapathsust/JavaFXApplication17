package javafxapplication17;
import java.util.Random;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.effect.BlurType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.effect.DropShadow;
import javafx.scene.input.MouseEvent;
public class exam2  {
    
    public static void st1(ObservableList<String>  string) {
        Stage primaryStage=new Stage();
         String[] stt=new String[10];
       stt[0]=string.get(0);
              int[] a=new int[12];
        Button btn = new Button();
        Random ra=new Random();
        a[1]=2;

        btn.setText("");
        btn.setText(stt[0]);
         ImageView im1=new ImageView();
          ImageView im2 =new ImageView();
           ImageView im3 =new ImageView();
            ImageView im4 =new ImageView();
             ImageView im5 =new ImageView();
              ImageView im6 =new ImageView();
               im1.setFitHeight(320);
                    im1.setFitWidth(440);
                     im2.setFitHeight(320);
                    im2.setFitWidth(440);
                     im3.setFitHeight(320);
                    im3.setFitWidth(440);
                     im4.setFitHeight(320);
                    im4.setFitWidth(440);
                     im5.setFitHeight(320);
                    im5.setFitWidth(440);
                     im6.setFitHeight(320);
                    im6.setFitWidth(440);
                           Image img1=new Image("file:add.jpg");
                       
                       DropShadow ds=new DropShadow(70,Color.DARKRED);
                                             DropShadow ds1=new DropShadow(40,Color.YELLOW);
                                             ds.setBlurType(BlurType.GAUSSIAN);
        Image i1=new Image("file:IMAGE/"+string.get(0)+".jpg");
         im2.setImage(i1);
          
        int g=string.size()-1;
        int a1=ra.nextInt(g)+1;
        int a2=ra.nextInt(g)+1;
        int a3=ra.nextInt(g)+1;
         Image i2=new Image("file:IMAGE/"+string.get(3)+".jpg");
        Image i3=new Image("file:IMAGE/"+string.get(2)+".jpg");
        Image i4=new Image("file:IMAGE/"+string.get(1)+".jpg");
          im1.setImage(i2);
          im3.setImage(i3);
         im4.setImage(i4);               
 Image img=new Image("file:add.jpg");
  Text tx=new Text("         Your Score");
  Font f1=Font.font("Serif", FontWeight.EXTRA_BOLD,FontPosture.ITALIC,35);
        tx.setFont(f1);
         StackPane S=new StackPane();
 S.setPrefSize(350, 310);
   Text T4=new Text("0");
   T4.setFont(f1);
  S.getChildren().add(T4);
          Button bt = new Button("next");
 bt.setMaxSize(350, 64);
        bt.setMinSize(350, 64);
                 bt.setStyle("-fx-font: 25 arial; -fx-base: #5FB951; -fx-background-radius: 10; -fx-text-fill: #FFFFFF");

  S.setStyle("-fx-background-color:green");
  String style="  -fx-background-color: #986868; "+
        " -fx - border-color: #D43473;";
 

                    //im6.setFitHeight(240);
        ImageView im =new ImageView();
       im.setImage(img);
       im.setFitHeight(310);
       im.setFitWidth(350);
         HBox H3=new HBox();
         HBox H4=new HBox();
         HBox H5=new HBox();
         HBox H6=new HBox();
      // im.setStyle(style);
      H3.addEventHandler(MouseEvent.MOUSE_ENTERED,new EventHandler<MouseEvent>()
      {

         @Override
         public void handle(MouseEvent e)
         {
             H3.setEffect(ds);
                              H4.setEffect(ds1);
             H5.setEffect(ds1);
             H6.setEffect(ds1);

          }
               
      } );
      
      
        H4.addEventHandler(MouseEvent.MOUSE_ENTERED,new EventHandler<MouseEvent>()
      {

         @Override
         public void handle(MouseEvent e)
         {
             H4.setEffect(ds);
               H3.setEffect(ds1);
             H5.setEffect(ds1);
             H6.setEffect(ds1);
  
          }
               
      } );
     
        H5.addEventHandler(MouseEvent.MOUSE_ENTERED,new EventHandler<MouseEvent>()
      {

         @Override
         public void handle(MouseEvent e)
         {
             H5.setEffect(ds);
                 H4.setEffect(ds1);
             H3.setEffect(ds1);
             H6.setEffect(ds1);

          }
               
      } );
 
        H6.addEventHandler(MouseEvent.MOUSE_ENTERED,new EventHandler<MouseEvent>()
      {

         @Override
         public void handle(MouseEvent e)
         {
             H6.setEffect(ds);
                H4.setEffect(ds1);
             H5.setEffect(ds1);
             H3.setEffect(ds1);
 
          }
               
      } );
      
       
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
               
            }
        });
         VBox V=new VBox();
                  VBox V1=new VBox();

         V.getChildren().add(btn);
                 btn.setMaxSize(895, 64);
                        btn.setMinSize(895, 64);
  
                  //VBox V=new VBox();
      btn.setStyle("-fx-font: 32 arial; -fx-base: #5FB951; -fx-background-radius: 5; -fx-text-fill: #FFFFFF");

        StackPane root = new StackPane();
     //   root.getChildren().add(btn);
         HBox H=new HBox();
                  HBox H1=new HBox();
         HBox H2=new HBox();
                
                    
                      H4.getChildren().add(im2);
                      H5.getChildren().add(im3);
                      H6.getChildren().add(im4);
                   
  H3.getChildren().add(im1);

                  String css="-fx-border-color:blue ; \n"
                          + "-fx-border-insets:3;\n"
                          + "-fx-border-width:1.0";
                  H3.setStyle(css);
                  H4.setStyle(css);
                  H5.setStyle(css);
                  H6.setStyle(css);

         H1.getChildren().addAll(H3,H4);
         H2.getChildren().addAll(H5,H6);
   V.getChildren().addAll(H1,H2);
         
                 V1.getChildren().addAll(im,tx,S,bt);
                    VBox V2=new VBox();
Button btn22 = new Button("   Back  ");
Button btn32 = new Button("    Exit   ");
        btn22.setStyle("-fx-font: 25 arial; -fx-base: #DFB951; -fx-background-radius: 100; -fx-text-fill: #FFFFFF");
      btn32.setStyle("-fx-font: 25 arial; -fx-base: #DFB951; -fx-background-radius: 100; -fx-text-fill: #FFFFFF");
     
                  V.setStyle("-fx-background-color:yellow");
                         V1.setStyle("-fx-background-color:yellow");
                                                  V2.setStyle("-fx-background-color:blue");
                                                  
                                                  
                                                  
                                                  

                                                  
                                                  
                                                  
 im1.addEventHandler(MouseEvent.MOUSE_CLICKED,new EventHandler<MouseEvent>() {
           
            @Override
            public void handle(MouseEvent event) {
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
  im2.addEventHandler(MouseEvent.MOUSE_CLICKED,new EventHandler<MouseEvent>() {
            
            @Override
            public void handle(MouseEvent event) {
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
  
   im3.addEventHandler(MouseEvent.MOUSE_CLICKED,new EventHandler<MouseEvent>() {
            
            @Override
            public void handle(MouseEvent event) {
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
  im4.addEventHandler(MouseEvent.MOUSE_CLICKED,new EventHandler<MouseEvent>() {
            
            @Override
            public void handle(MouseEvent event) {
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
                                                  
                                                  
                                                  
                                                  
                                                  
      
  
  
  try{
        bt.setOnAction(new EventHandler<ActionEvent>() {
            
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
                btn.setText(stt[0]);
                   //Image im1=new Image("file:IMAGE/"+string.get(a[0])+".jpg");
               //i3.setImage(im1);
                    int a1=ra.nextInt(4)+1;
                    if(a1==1)
                    {
                        int t=0;
                        int f=string.size();
                       // btn1.setText(string.get(a[0]));
                        Image im11=new Image("file:IMAGE/"+string.get(a[0])+".jpg");
                       im1.setImage(im11);
                        a[1]=1;
                        while(t<3)
                        {
                             int a2=ra.nextInt(f);
                             if(a2!=a[0])
                             {
                                 t++;
                                 if(t==1)
                                 {
                                     Image im12=new Image("file:IMAGE/"+string.get(a2)+".jpg");
                       im2.setImage(im12);
                                 }
                                     if(t==2)
                                     {
                                         Image im13=new Image("file:IMAGE/"+string.get(a2)+".jpg");
                                             im3.setImage(im13);
                                     }
                                     if(t==3)
                                     {
                                         Image im14=new Image("file:IMAGE/"+string.get(a2)+".jpg");
                       im4.setImage(im14);
                                     }
                             }
                           
                        }
                    }
                   
               if(a1==2)
                    {
                        int t=0;
                        int f=string.size();
                        Image im22=new Image("file:IMAGE/"+string.get(a[0])+".jpg");
                       im2.setImage(im22);
                        a[1]=2;
                        while(t<3)
                        {
                             int a2=ra.nextInt(f);
                             if(a2!=a[0])
                             {
                                 t++;
                                 if(t==1)
                                 {
                                      Image im21=new Image("file:IMAGE/"+string.get(a2)+".jpg");
                       im1.setImage(im21);
                                 }
                                     if(t==2)
                                     {
                                          Image im23=new Image("file:IMAGE/"+string.get(a2)+".jpg");
                       im3.setImage(im23);
                                     }
                                     if(t==3)
                                     {
                                          Image im24=new Image("file:IMAGE/"+string.get(a[0])+".jpg");
                       im1.setImage(im24);
                                     }
                             }
                           
                        }
                    }
                   
               if(a1==3)
                    {
                        int t=0;
                        int f=string.size();
                        Image im33=new Image("file:IMAGE/"+string.get(a[0])+".jpg");
                       im3.setImage(im33);
                        a[1]=3;
                        while(t<3)
                        {
                             int a2=ra.nextInt(f);
                             if(a2!=a[0])
                             {
                                 t++;
                                 if(t==1)
                                 {
                                      Image im32=new Image("file:IMAGE/"+string.get(a2)+".jpg");
                                      im2.setImage(im32);
                                 }
                                     if(t==2)
                                     {
                                          Image im31=new Image("file:IMAGE/"+string.get(a2)+".jpg");
                                           im1.setImage(im31);
                                     }
                                     if(t==3)
                                     {
                                          Image im34=new Image("file:IMAGE/"+string.get(a2)+".jpg");
                                          im4.setImage(im34);
                                     }
                             }
                           
                        }
                    }
               if(a1==4)
                    {
                        int t=0;
                        int f=string.size();
                       Image im44=new Image("file:IMAGE/"+string.get(a[0])+".jpg");
                       im4.setImage(im44);
                        a[1]=4;
                        while(t<3)
                        {
                             int a2=ra.nextInt(f);
                             if(a2!=a[0])
                             {
                                 t++;
                                 if(t==1)
                                 {
                                      Image im42=new Image("file:IMAGE/"+string.get(a2)+".jpg");
                       im2.setImage(im42);
                                 }
                                     if(t==2)
                                     {
                                          Image im43=new Image("file:IMAGE/"+string.get(a2)+".jpg");
                                       im3.setImage(im43);
                                     }
                                     if(t==3)
                                     {
                                          Image im41=new Image("file:IMAGE/"+string.get(a2)+".jpg");
                                          im1.setImage(im41);
                                     }
                             }
                           
                        }
                    }
                   
                   
               
               
               
            }
        });
                    }
                    catch(Exception ee)
                    {
                        
                    }
  
  
  
  
  
  
  
  
  
  
  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
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
      V2.getChildren().addAll(btn32,btn22);
H.getChildren().addAll(V,V1,V2);
               Scene scene = new Scene(H, 1370, 750);
        
        primaryStage.setTitle("");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

   
}
