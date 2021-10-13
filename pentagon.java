//Write a method to display the first 50 pentagonal numbers
package an;
import java.util.Scanner;


public class pentagon {
	
	public static void main(String[] args) {
   		int count = 1;
   		Scanner input = new Scanner(System.in);
   		System.out.print("Enter an integer: ");
   		long n = input.nextInt();
		for(int i = 1; i <= n; i++)
		{
			System.out.printf("%9d",getpentagon(i));
			
			if(count % 10 == 0) System.out.println();
			count++;
		}
    }
  public static int getpentagon(int i) {
		return (i * (3 * i - 1))/2;
	}

}
