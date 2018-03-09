import java.time.LocalDate;
class To_Method
{
	public static void main(String...s)
	{
		LocalDate ld=LocalDate.of(2017,9,5);
		long d= ld.toEpochDay();
		Long z=(d-248)/365;
System.out.println("Days since EpochDay = "+d+"   years =  "+z+" year is = "+ (2017-z));
		}
}