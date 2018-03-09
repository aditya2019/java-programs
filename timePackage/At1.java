import java.time.LocalDate;
import java.time.Year;
class At1
{
	public static void main(String...s)
	{
		LocalDate ld=Year.of(2014).atMonth(6).atDay(22);
		System.out.println(ld);
	}
}