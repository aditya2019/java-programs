import java.time.LocalDate;
import java.time.LocalDateTime;
class FromMethod
{
	public static void main(String...s)
	{
		LocalDateTime ldt=LocalDateTime.of(2015,12,30,18,18);
		System.out.println(ldt);
		LocalDate ld=LocalDate.from(ldt);
System.out.println(ld);
		}
}