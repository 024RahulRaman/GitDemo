package brushUpJava;

import java.text.SimpleDateFormat;
import java.util.Date;

public class dateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//If you want to print current date and current time

	
	    Date d=new Date();
	    
	    System.out.println(d.toString());
	    
	    
	    SimpleDateFormat sdf=new SimpleDateFormat("h:MM:YYYY");
	                  System.out.println(sdf.format(d));
	
	    
	                  SimpleDateFormat st=new SimpleDateFormat("h:MM:YYYY HH:MM:SS");
	                                System.out.println(st.format(d));
	
	}}