//Write a program to check whether a given string starts with the contents of another string.
package an;

public class ex4 {
	 
	
	 public static void main(String[] args)
	    {
	        String str1 = "my name is anurag";
	        String str2 = "anurag is my name.";

	        
	        String startStr = "my";

	      
	        boolean s1 = str1.startsWith(startStr);
	        boolean s2 = str2.startsWith(startStr);

	        
	        System.out.println( str1 + " starts with " + startStr + "     " +s1);
	        System.out.println(str2 + " starts with " +	    startStr + "     " + s2);
	    }
	}