import java.time.Month;
import java.time.YearMonth;
class YearMonthDemo
{
	public static void main(String...s)
	{
	YearMonth ym=YearMonth.of(2017,Month.SEPTEMBER);
	int monthSize=ym.lengthOfMonth();
	int YearSize=ym.lengthOfYear();
	System.out.println(monthSize +"  "+ YearSize);
}}