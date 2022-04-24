package OOPConceptPart2;

public class TestCar {

	public static void main(String[] args) {
		BMW obj=new BMW();
		obj.start();
		obj.stop();
		obj.refuel();
		obj.theftSaftey();
		obj.engine();
		obj.crashTest();
		
		System.out.println("********************");
		
		//Now we will create parent class object
		
		Car c= new Car();
		c.start();
		c.stop();
		c.refuel();
		c.engine();
		c.crashTest();
		
		System.out.println("*********************");
		
		Car c1= new BMW();
		c1.start();
		c1.stop();
		c1.refuel();
		c1.crashTest();
		c1.engine();
		

	}

}
