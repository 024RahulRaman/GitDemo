package OOPConceptPart1;

public class StaticAndNonStaticConcept {
	String name="Tom";
	static int age=25;//

	public static void main(String[] args) {
		sum();
		StaticAndNonStaticConcept.sum();
		System.out.println(age);
		System.out.println(StaticAndNonStaticConcept.age);
		StaticAndNonStaticConcept obj=new StaticAndNonStaticConcept();
		obj.sendmail();
	     System.out.println(obj.name);	
	     obj.sum();
	}
	
	public void sendmail() {
		System.out.println("Send mail method");
	}
	public static void sum() {
		System.out.println("Sum Method");
	}
	
	
	
}
