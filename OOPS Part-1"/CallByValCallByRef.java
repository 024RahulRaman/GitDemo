package OOPConceptPart1;

public class CallByValCallByRef {
	int p; int q;

	public static void main(String[] args) {
	
		CallByValCallByRef obj= new CallByValCallByRef();
		int x=10;
		int y=20;
		obj.testSum(x,y);
		
		
		obj.p=50;
		obj.q=100;
		obj.swap(obj);
		System.out.println(obj.p);
		System.out.println(obj.q);
		
		
		
		
		
	}

public int testSum(int a , int b) {
	a=30; b=40;
	
	int c=a+b;
	return c;
}
	
	
	public void swap(CallByValCallByRef t) {
		int temp1;
		temp1 = t.p;
		t.p=t.q;
		t.q=temp1;
	}
	
	
	
	
	
	
	
	
	
	
}
