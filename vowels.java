package an;
import java.util.Scanner;

public class vowels {
	public static void main (String args[]) {

	int count =0;
	System.out.println("enter a string");
	Scanner sc=new Scanner(System.in);
	String sent=sc.nextLine();
	
	for(int i=0;i<sent.length();i++)
	{
		char ch=sent.charAt(i);
		if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'||ch == ' '){
		            count ++;
	}
}
	System.out.println("Number of vowels in the given sentence is "+count);
}
}
