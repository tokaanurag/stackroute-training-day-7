
public class Ex3
{
public int add(int a, int b)
{
 return(a+b);
}
public int add(int a, int b, int c)
{
return(a+b+c);
}
public  double add(double a ,double b)
{
return (a+b);
}
public static void main(String args[])
{
Ex3 ob =new Ex3();
ob.add(15,20);
ob.add(15, 20,25);
System.out.println(ob.add(15,20));
}
}
