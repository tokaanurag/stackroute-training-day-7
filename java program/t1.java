//byte -> short -> char -> int -> long -> float -> double  windering type
//double -> float -> long -> int -> char -> short -> byte  narrowing 
/*public class  t1 
{  
public static void main(String[] args)  
{  
int x = 250;  
//automatically converts the integer type into long type  
long y = x;  
//automatically converts the long type into float type  
float z = y;  
System.out.println("Before conversion, int value "+x);  
System.out.println("After conversion, long value "+y);  
System.out.println("After conversion, float value "+z);  
}  
} 

*/
public class t1
{  
public static void main(String args[])  
{  
double d = 196.66;  
//converting double data type into long data type  
long l = (long)d;  
//converting long data type into int data type  
int i = (int)l;  
System.out.println("int "+d);  
//fractional part lost  
System.out.println("long type: "+l);  
//fractional part lost  
System.out.println("int "+i);  
}  
}   
