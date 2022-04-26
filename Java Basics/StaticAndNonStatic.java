package brushUpJava;

public class StaticAndNonStatic {
	
	
	String name;
	String address;
	String city;
	
	
	StaticAndNonStatic(String name,String address, String city)
	
	{
	
		this.name=name;
		this.address=address;
		this.city=city;
	}
	
	public void getaddress() {
		
		System.out.println(address);
	}
	
	
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

          
		StaticAndNonStatic obj= new StaticAndNonStatic("Rahul","Marathalli","Bangalore");
		StaticAndNonStatic obj1= new StaticAndNonStatic("Sam","jaynagar","Bangalore");         
		
		
		obj.getaddress();
		obj1.getaddress();
		          
	
	
	
	
	}

	
	
	
	
	
	
	
	
}
