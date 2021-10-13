import java.io.File; 
import java.io.Filewriter;

import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; 


public class f2 {
  public static void main(String[] args) {
    try {
      FileWriter myWrite = new FileWriter("filename.txt");

      
      myWrite.write("files new write");
      myWrite.close();

System.out.println("succeses");

     
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}