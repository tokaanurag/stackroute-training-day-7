package an;
import java.util.Scanner;

public class Checknum {
	public static void main(String[] args)
	{
		Scanner n =new Scanner(System.in);
		System.out.print("input a number:");
		int c=n.nextInt();
		if(c>0)
		{
            System.out.println("Number is positive");
        }
        else if (c< 0)
        {
            System.out.println("Number is negative");
        }
        else
        {
            System.out.println("Number is zero");
        }
	}

}
