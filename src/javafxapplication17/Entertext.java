package javafxapplication17;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.scene.control.TextArea;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.layout.GridPane;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.Writer;
import java.io.IOException;
import java.io.OutputStreamWriter;
import javafx.stage.Stage;
public class Entertext {
    
    public static void st(String st1) {
        
        Stage primaryStage=new Stage();
        GridPane root = new GridPane();
         root.setPadding (new Insets(0,0,0,240));
        Text tx=new Text("  About This Bird");
        tx.setX(50);
        tx.setY(50);
        Font f1=Font.font("Serif", FontWeight.EXTRA_BOLD,FontPosture.ITALIC,50);
        tx.setFont(f1);
        TextArea T=new TextArea();
        // root.add(tx, 0, 1);
              root.setStyle("-fx-font:  arial; -fx-base: #DFB951; -fx-background-radius: 10; -fx-text-fill: #FFFFFF");
         Button b1=new Button("          OK         ");
                  //Button b2=new Button("RETURN");
      b1.setStyle("-fx-font: 50 arial; -fx-base: #5884; -fx-background-radius: 10; -fx-text-fill: #FFFFFFF");
            T.setStyle("-fx-font: 50 arial; -fx-base: #5884; -fx-background-radius: 10; -fx-text-fill: #FFFFFF");

         root.add(b1,0,2);
        // root.add(b2, 1, 2);
         root.add(T, 0, 1);
        root.getChildren().addAll(tx);
         T.setScaleX(2);
        T.setMinSize(0, 540);
       String st;
       b1.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                try{
                       // T.setText(st);
   String st=  T.getText();
   File f1=new File("TEXT/"+st1+".txt");
/* Writer output=new BufferedWriter(new FileWriter(f1));
   output.write(st);
   output.close();*/
   
         Writer out = new BufferedWriter(new OutputStreamWriter(
    new FileOutputStream(f1), "UTF-8"));
   out.append(st).append("\r\n");
		//out.append("?? UTF-8").append("\r\n");
		//out.append("??????? UTF-8").append("\r\n");
		
		out.flush();
		out.close();
   
   primaryStage.close();
   F1.st1();
            }
            catch(IOException e)
                    {
                        
                    }}
        });
 ///System.out.println(st);
        //T.setAlignment(Pos.CENTER);
        Scene scene = new Scene(root, 962, 690);
        
        primaryStage.setTitle("");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
}
