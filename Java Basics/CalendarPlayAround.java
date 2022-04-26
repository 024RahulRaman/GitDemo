package brushUpJava;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarPlayAround {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
         Calendar cd=Calendar.getInstance();	
	      
         SimpleDateFormat sdf=new SimpleDateFormat();
         System.out.println(sdf.format(cd.getTime()));
         
         System.out.println(cd.get(Calendar.DAY_OF_MONTH));
         System.out.println(cd.get(Calendar.AM_PM));
         System.out.println(cd.get(Calendar.MINUTE));
         System.out.println(cd.get(Calendar.DAY_OF_WEEK_IN_MONTH));
         System.out.println(cd.get(Calendar.MONTH));
	
	}

}
