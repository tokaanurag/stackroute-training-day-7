package an;

import java.util.Scanner;

public class DecreaseIncrease {
	
public static void main(String[] args)
{
	Scanner in =new Scanner(System.in);
	System.out.print("enter first number");;
	double x=in.nextDouble();
	System.out.print("enter second number");;
	double y=in.nextDouble();
	System.out.print("enter third number");;
	double z=in.nextDouble();
	if(x<y&&y<z)
	{
		 System.out.println("Increasing order");
	}
	else if(x>y&&y>z)
	{
		 System.out.println("decreasing order");
	}
	else
    {
        System.out.println("Neither increasing or decreasing order");
    }
}
}
