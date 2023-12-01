import java.io.*;

public class ThrowsException {
   public static void show() throws IOException { // without throws IOException Generate Error
      throw new IOException("throws example!");
   }

   public static void main(String... args) {
      try {
         show();
      } catch (IOException e) {
         System.out.println(e);
      }
   }
}