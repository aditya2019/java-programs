import java.time.LocalDate;
import java.time.Month;
class Of_Method
{
	public static void main(String...s)
	{
		LocalDate ld1=LocalDate.of(2017,9,5);
		LocalDate ld2=LocalDate.of(2017,Month.SEPTEMBER,5);
		LocalDate ld3=LocalDate.ofEpochDay(2016);
		LocalDate ld4=LocalDate.ofYearDay(2016,39);
		System.out.println(ld1+"\n"+ld2+"\n"+ld3+"\n"+ld4);
	}
}