class Ex4{
void view() {
System.out.println("This is a parent class method");
}
}
class Child extends Ex4 {
void view() {
System.out.println("This is a child class method");
}


public static void main(String args[]) {
Ex4 obj = new Ex4(); //Parent class
obj.view();
Ex4 obj2 = new Child(); //Child class
obj2.view();
}
}