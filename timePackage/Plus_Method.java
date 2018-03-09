import java.time.LocalDate;
class Plus_Method
{
	public static void main(String...s)
	{
		LocalDate ld=LocalDate.of(2017,9,5);
		LocalDate ld1=ld.plusYears(5);
		LocalDate ld2=ld.plusMonths(2);
		LocalDate ld3=ld.plusDays(5);
		LocalDate ld4=ld.plusWeeks(4);
		System.out.print(ld+" \n"+ld1+"\n "+ld2+" \n"+ld3+" \n"+ld4);
	}
}