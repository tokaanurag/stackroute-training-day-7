//Write a program to get the contents of a given string as a byte array.
package an;

public class ex5 {
	
		  public static void main(String[] args)
		    {
		        String str = "my name is anurag";

		        // Copy 
		        byte[] byte_arr = str.getBytes();

		       
		        String n = new String(byte_arr);

		       
		        System.out.println("new byte string" +
		            n + "\n");
		    }
		}


