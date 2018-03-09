import java.time.LocalDate;
import java.time.Month;
class MethodDemo
{
	public static void main(String...s)
	{
		LocalDate ld=LocalDate.of(2016,Month.SEPTEMBER,12);
		System.out.println(ld);
		Month m=Month.from(ld);
		System.out.println(m);
		Month m2=m.plus(3);
		Month m3=Month.of(2);
		System.out.println(m2+"\n"+m3);
	Month mm=ld.getMonth();
	System.out.println(mm);
	int monthInt=m.getValue();
	System.out.println(monthInt);
	}
}