
import java.io.File;
public class Ex6 
 {
 File file = new File("d.txt"); //local path
 
 if(file.createNewFile("d.txt")) {
  System.out.println("File is created");
 } else {
  System.out.println("File is already exist");
 }
 
 // write content
 FileWriter writer = new FileWriter(file);
 Writer.write();
 Write.close();
}