package javafxapplication17;
import java.io.File;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
    public class selected {
        public static void dis(String tit,String msg)
        {
            Stage stage=new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setTitle(tit);
          //  stage.setMaxWidth(950);
            Label l1=new Label();
                          l1.setStyle("-fx-font: 32 arial; -fx-base: #F99999; -fx-background-radius: 10; -fx-text-fill: #E99FFF");

            l1.setText(msg);
                    Button btn5 = new Button("  Ok  ");
                      btn5.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
              stage.close();
            }
        });
                            btn5.setStyle("-fx-font: 30 arial; -fx-base: #7FB951; -fx-background-radius: 10; -fx-text-fill: #12FFFFF");

                      VBox Va=new VBox(10);
                                    Va.setStyle("-fx-font: 26 arial; -fx-base: #399999; -fx-background-radius: 10; -fx-text-fill: #FFFFF");

                      Va.getChildren().addAll(l1,btn5);
                      Va.setAlignment(Pos.CENTER);
                                      Scene scene1 = new Scene(Va,400,200);
                                      stage.setScene(scene1);
                                      stage.show();
                                      stage.showAndWait();


        }
        public static void st1() {
            Stage primaryStage=new Stage();
            try {
                 File folder=new File("IMAGE");
        File[] L=folder.listFiles();
        for( int i=0;i<L.length;i++)
        {
                String f1=L[i].getName(),f,f3;
               f=f1.replaceFirst(".jpg","");
              Text T=new Text();
               T.setFill(Color.DARKSLATEBLUE);
                 T.setX(50);
          // f3=f+".txt";
        }
                
                HBox  root = new HBox();
                                VBox  V = new VBox(30);
                                V.setAlignment(Pos.CENTER);
                                
                ListView<String> listView = new ListView<String>();
                ListView<String> listView1 = new ListView<String>();
                listView.setPrefWidth(547);
                                listView1.setPrefWidth(547);

              ObservableList<String> list = FXCollections.observableArrayList();
                            ObservableList<String> list1 = FXCollections.observableArrayList();
                                
 Button  btn1 = new Button("Select");
        Button btn2 = new Button(" Back ");
        Button btn3 = new Button("  Exit  ");
        Button btn4 = new Button();
        V.getChildren().addAll(btn1,btn2,btn3);
        btn3.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
              primaryStage.close();
            }
        });
 btn1.setOnAction(new EventHandler<ActionEvent>() {
           // List<String> st=new ArryList<String>();
            int i=0;
            @Override
            public void handle(ActionEvent event) {
             if(list1.size()==0)
             {
                 selected.dis("Warning","Plese Select Some Name");
             }
             else
             {
               
               setimgtx.st1(list1);
                 primaryStage.close();
             }
              
             
                
            }
        });
          btn2.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
             
                F1.st1();
                primaryStage.close();
             
                
            }
        });
            
                Scene scene = new Scene(root,1200,700);




listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
      listView.setStyle("-fx-font: 20 arial; -fx-base: #5FB951; -fx-background-radius: 10; -fx-text-fill: #FFFFFF");
      listView1.setStyle("-fx-font: 20 arial; -fx-base: #AFB951; -fx-background-radius: 10; -fx-text-fill: #FFFFFF");
      btn1.setStyle("-fx-font: 25 arial; -fx-base: #1FB951; -fx-background-radius: 10; -fx-text-fill: #FFFFFF");
      btn2.setStyle("-fx-font: 25 arial; -fx-base: #1FB951; -fx-background-radius: 10; -fx-text-fill: #FFFFFF");
      btn3.setStyle("-fx-font: 25 arial; -fx-base: #1FB951; -fx-background-radius: 10; -fx-text-fill: #FFFFFF");
      root.setStyle("-fx-font: 25 arial; -fx-base: #9FB951; -fx-background-radius: 10; -fx-text-fill: #FFFFFF");


                listView.setItems(list);
                listView1.setItems(list1);

                 for( int i=0;i<L.length;i++)
        {
                String f1=L[i].getName(),f,f3;
               f=f1.replaceFirst(".jpg","");
            list.add(f);
        }
                listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);


                listView.setOnMouseClicked(new EventHandler<Event>() {
                int i=0;

                    @Override
                    public void handle(Event event) {
                        ObservableList<String> selectedItems =  listView.getSelectionModel().getSelectedItems();

                        for(String s : selectedItems){
                          list1.add(s);
                          
                        }

                    }

                });
                
               
primaryStage.setTitle("Select");
                root.getChildren().add(listView);
                root.getChildren().add(listView1);
                root.getChildren().add(V);

                primaryStage.setScene(scene);
                primaryStage.show();
            } catch(Exception e) {
                e.printStackTrace();
            }
        }
    }