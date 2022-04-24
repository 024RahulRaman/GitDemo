package OOPConceptPart1;

public class FunctionsinJava {

	public static void main(String[] args) {
	
		FunctionsinJava obj=new FunctionsinJava();
		
		obj.test();
		
		int l = obj.pqr();
		System.out.println(l);
		
		String S1=obj.qa();
		System.out.println(S1);
		
		int div = obj.division(30,10);
		System.out.println(div);

	}

	public void test() {
		System.out.println("test method");

	}
	public int pqr()
	{
		System.out.println("pqr method");
		int a=10;int b=20;
		int c=a+b;
		return c;
	}
	public String qa()
	{
		
	
	System.out.println("qa");
	String S="Selenium";
	return S;

	}

	public int division(int x, int y) 
	{
		System.out.println("divison method");
		int d=x/y;
		return d;
	}
}

