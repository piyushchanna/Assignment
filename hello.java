import java.io.*;

public class hello {
   public static void main(String args[]) throws IOException
   {
      FileInputStream in = null;
      FileOutputStream out = null;

      try {
         in = new FileInputStream("C:/Users/Administrator/workspace/java_1/src/piyush.txt");
         out = new FileOutputStream("C:/Users/Administrator/workspace/java_1/src/output.txt");
         
         int c;
         while ((c = in.read()) != -1) {
            out.write(c);
         }
      }finally {
         if (in != null) {
            in.close();
         }
         if (out != null) {
            out.close();
         }
      }
   }
}