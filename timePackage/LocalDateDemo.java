import java.time.Month;
import java.time.MonthDay;
import java.time.Year;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
class LocalDateDemo
{
	public static void main(String...s)
	{
		MonthDay dec25=MonthDay.of(Month.DECEMBER,25);
		Year y=Year.now();
		for(int i=0;i<=5;i++)
		{
			LocalDate ld=y.plusYears(i).atMonthDay(dec25);
			int yr=ld.getYear();
			String weekDay=ld.getDayOfWeek().getDisplayName(TextStyle.FULL,Locale.getDefault());
			System.out.format("chrismas in %d is on %s,%n",yr,weekDay);
		}
	}
}