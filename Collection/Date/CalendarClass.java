import java.util.Date;
import java.util.Calendar;
import java.util.Locale;
import java.text.DateFormat;
class CalendarClass
{
	public static void main(String...s)
	{
		Calendar c=Calendar.getInstance();
	
		//Locale l=new Locale("fr","FR");
		Locale l=new Locale("en","US");
	   Date d=c.getTime();
	  
	DateFormat df=DateFormat.getDateInstance(0,l);
	String s2=df.format(d);
	//System.out.print(s2);
	//System.out.print(d.getDay());
	//System.out.print(d.getDay());
	
	//System.out.println(c.get(Calendar.MINUTE));
	//System.out.println(c.get(Calendar.HOUR_OF_DAY));
	//System.out.println(c.get(Calendar.MONTH));
		System.out.println("today day  "+c.get(Calendar.DAY_OF_MONTH));
	//System.out.println(c.get(Calendar.DAY_OF_WEEK));
	
	}	
}