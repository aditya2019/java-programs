import java.time.LocalDate;
import java.time.LocalDateTime;
class AllMethod
{
	public static void main(String...s)
	{
	LocalDate ld=LocalDate.of(2014,6,21);
	LocalDateTime ldt=ld.atStartOfDay();
	LocalDateTime ldt1=ld.atTime(16,21);
	System.out.print(ld+" \n"+ldt+" \n"+ldt1);
	}
}