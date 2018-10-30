package copyPaste;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
 
public class CopyPaste {
   public static void main(String[] args) {
      FileInputStream ins = null;
      FileOutputStream outs = null;
      try {
         File copyFrom =new File("originFileToCopy.txt");
         File copyTo =new File("destinyFileToCopy.txt");
         ins = new FileInputStream(copyFrom);
         outs = new FileOutputStream(copyTo);
         byte[] buffer = new byte[1024];
         int length;
         
         while ((length = ins.read(buffer)) > 0) {
            outs.write(buffer, 0, length);
         } 
         ins.close();
         outs.close();
         System.out.println("File copied successfully!!");
      } catch(IOException ioe) {
         ioe.printStackTrace();
      } 
   }
}