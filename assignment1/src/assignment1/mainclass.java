package assignment1;

public class mainclass {
public static void main(String[] args) {
	exam1 obj=new exam1(); //object creation for access other class values
	obj.operation1(); // it will access operation1 method
	obj.display(); // it will display operation 1
	obj.operation2(); // it will access operation2
	obj.display(); //it will display operation 2
}
}
// main class will access exam1 class and it will take values from exam1 class.