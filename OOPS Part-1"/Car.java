package OOPConceptPart1;

public class Car {
 int model; int wheel;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car a=new Car();
		Car b=new Car();
		Car c=new Car();
		
		a.model=2015;
		a.wheel=4;
		
		b.model=2017;
		b.wheel=4;
		
		c.model=2015;
		c.wheel=4;
		System.out.println("Before assigning the reference");
		
		System.out.println(a.model);
		System.out.println(a.wheel);
		System.out.println(b.model);
		System.out.println(b.wheel);
		System.out.println(c.model);
		System.out.println(c.wheel);
		
		System.out.println("AFTER SHIFTING THE REFERENCES ");
	   
		a=b;
		b=c;
		c=a;
		
		a.model=2015;
				System.out.println(a.model);
		c.model=2020;
		System.out.println(a.model);
	    System.out.println(c.model);
	}

}
