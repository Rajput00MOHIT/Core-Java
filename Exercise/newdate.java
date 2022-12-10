package in.co.Exercise;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class newdate {
  @SuppressWarnings("deprecation")
public static void main(String[] args) throws ParseException {
	Date d = new Date();
	SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy");
	Date d1= s.parse("25/07/2002");
	System.out.println(d);
	System.out.println(d1);
	System.out.println(d.getDate()  - d1.getDay()); 
	System.out.println(d.getMonth()- d1.getMonth());
	System.out.println(d.getYear()- d1.getYear());
		
	
}
}
