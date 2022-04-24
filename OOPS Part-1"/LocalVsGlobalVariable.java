package OOPConceptPart1;

public class LocalVsGlobalVariable {
	String name ="Tom";
	int age= 25;
	String c="Rahul";
	
	   

	public static void main(String[] args) {
		int i=15;
		System.out.println(i);
		LocalVsGlobalVariable obj= new LocalVsGlobalVariable();
				
				System.out.println(obj.name);
				System.out.println(obj.age);
				System.out.println(obj.c);
				
		
	}
	
	public void sum()
	{
	int i=10;
	int j=20;
	int s= i+j;
System.out.println(s);
	}
}
