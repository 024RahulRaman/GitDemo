package OOPConceptPart1;

public class MethodOverloading {

	public static void main(String[] args) {

		
		MethodOverloading obj= new MethodOverloading();
		obj.sum();
		obj.sum(20);
		obj.sum(10,20);
	
		
		
			}
	public static void main(int P) {
		 
	}
	
	public static void main(float m, float n) {
		
	
		
	}
	
	public void sum() {
		System.out.println("Sum Zero Param");
		
	}
	public void sum(int i)
	{
		System.out.println("Sum 1 param");
	}
	
	public void sum(int j, int k)
	{
		System.out.println("Sum 2 Param");
		System.out.println(j+k);
	}
}


