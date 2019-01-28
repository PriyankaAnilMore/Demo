package assignment1;

public class Y {
public static void main(String[] args) {
	X xx=new X();
	System.out.println(xx.a);// output 50
	X xx1=new X();
	xx1.m1(60);// 
	System.out.println(xx1.a);//60
	X xxx=new X();
	xxx.m2();
	System.out.println(xxx.a);//77
	X xx2=new X();
	xx2.m1(60);
	xx2.m2();
	System.out.println(xx2.a);//77
	System.out.println(xx.a);//50
	System.out.println(xx1.a);//60
	System.out.println(xxx.a);//77
	System.out.println(xx2.a);//77
	
	
	
}
}
