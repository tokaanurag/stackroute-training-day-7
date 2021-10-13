//Write a program to read a plain text file.
package an;


	import java.io.BufferedReader;
	import java.io.FileNotFoundException;
	import java.io.IOException;
	import java.io.InputStreamReader;
	import java.io.FileInputStream;
	import java.io.FileReader;
	 
	public class Fileread {
	 
	    public static void main(String a[]){
	        StringBuilder sb = new StringBuilder();
	        String strLine = "";
	        try {
	             BufferedReader br = new BufferedReader(new FileReader("/home/anurag.choudhary/eclipse-workspace/javap/src/test2.txt"));
	             while (strLine != null)
	             {
	                sb.append(strLine);
	                sb.append(System.lineSeparator());
	                strLine = br.readLine();
	                System.out.println(strLine);
	            }
	             br.close();
	        } catch (FileNotFoundException e) {
	            System.err.println("File not found");
	        } catch (IOException e) {
	            System.err.println("Unable to read the file.");
	        }
	     }
	}



