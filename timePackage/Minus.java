import java.time.LocalDate;
class Minus
{
	public static void main(String...s)
	{
		LocalDate ld1 =LocalDate.of(2014,6,21);
		LocalDate ld2= ld1.minusMonths(5);
		LocalDate ld3=ld1.minusWeeks(4);
		System.out.println(ld1+"\n "+ld2+"\n "+ld3);
	}
}