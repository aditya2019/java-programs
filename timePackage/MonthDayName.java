import java.time.Month;
import java.time.MonthDay;
class MonthDayName
{
	public static void main(String...s)
	{
		MonthDay md1=MonthDay.of(Month.DECEMBER,25);
		MonthDay md2=MonthDay.of(Month.FEBRUARY,29);
		if(md2.isValidYear(2012))
		{
			System.out.println(" it's a leap year ");
	}
	System.out.println(md1.getDayOfMonth());
	}
}