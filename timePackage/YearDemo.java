import java.time.Year;
class YearDemo
{
	public static void main(String...s)
	{
		Year y1=Year.of(2016);
		Year y2=y1.minusYears(1);
		Year y3=y1.plusYears(1);
		Year y4=Year.now();
		System.out.println(y1+" "+y2+" "+y3+" "+y4);
		if(y1.isLeap())
		{
			System.out.println(y1+" is leap year");
		}else
		{
			System.out.println(y1+" is't leap year");
		}
	}
}