package brushUpJava;

public class ConstructorDemo {

	
	public ConstructorDemo(){
		
		
		System.out.println("I am in Constructor");
		
		
		
		
	}
	
	public ConstructorDemo (int a, int b) {
		
		int c= a+b;
		
		System.out.println("Addition of two number="+c);
		
		
	}
	
	
	public ConstructorDemo(String Str1, String Str2) {
		
	String Str3=Str1+Str2;
	
	System.out.println(Str3);
		
		
		
	}
	
	
	
	public void method1() {
		
		System.out.println("I am in method");
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
     
		
		ConstructorDemo cd=new ConstructorDemo();
		ConstructorDemo x=new ConstructorDemo(5,10);
		ConstructorDemo z=new ConstructorDemo("Rahul", "Raman");
		
		
		
		
	}

}
