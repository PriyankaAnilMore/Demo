package assignment1;

public class AA1 {
void display1(){
	System.out.println("This is a class -1");
	
}
}
class BB{
	void display2(){
		System.out.println("This is a class -2");
	}
}
class CC{
	void display3(){
		System.out.println("This is a class-3");
		
		
	}
}
class maiclass{
	public static void main(String[] args) {
		AA1 obj1=new AA1();
		BB obj2=new BB();
		CC obj3=new CC();
		
		obj1.display1();
		obj2.display2();
		obj3.display3();
	}
	
}