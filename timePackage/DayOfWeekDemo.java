import java.time.DayOfWeek;
import java.time.LocalDate;
class DayOfWeekDemo
{
	public static void main(String...s)
	{
		LocalDate ld=LocalDate.of(2016,9,19);
		DayOfWeek dow=DayOfWeek.from(ld);
		System.out.println(ld +"  "+dow);
		int intval=dow.getValue();
		System.out.println(intval);
		DayOfWeek dowFromInteger=DayOfWeek.of(7);
		System.out.println(dowFromInteger);
		DayOfWeek dowAdded=dowFromInteger.plus(1);
	    System.out.println(dowAdded);
	  DayOfWeek dowSubtracted=dowFromInteger.minus(1);
	    System.out.println(dowSubtracted);
	}
}