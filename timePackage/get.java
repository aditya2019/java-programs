import java.time.LocalDate;
import java.time.Month;
class get
{
	public static void main(String...s)
	{
		LocalDate ld=LocalDate.of(2014,6,21);
		int year=ld.getYear();
		System.out.println(year);
		Month month=ld.getMonth();
		int day=ld.getDayOfMonth();
		System.out.print(day);
	}
	
}