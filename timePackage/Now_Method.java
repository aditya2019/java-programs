import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
class Now_Method
{
	public static void main(String...s)
	{
		LocalDate ld=LocalDate.now();
		LocalTime lt=LocalTime.now();
		LocalDateTime ldt=LocalDateTime.now();
		ZonedDateTime zdt=ZonedDateTime.now();
		System.out.println(ld+"\n"+lt+"\n"+ldt+"\n"+zdt);
	}
}