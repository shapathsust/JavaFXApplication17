
package javafxapplication17;
import java.io.*;
public class directory {
    public static void st1()
    {
      String dir="test";
     // String mndir="dir1/dir2";
      boolean suc=(new File(dir)).mkdir();
      if(suc)
      {
          System.out.println("Directory: "+ dir + "created");
      }
      
    }
    
}
