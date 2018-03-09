import java.time.LocalDate;
import java.time.Month;
class WithMonth
{
public static void main(String...s)
{
LocalDate ld1=LocalDate.of(2016,Month.SEPTEMBER,4);
System.out.println(ld1);
LocalDate ld2=ld1.withYear(2018);
System.out.println(ld2);
LocalDate ld3=ld1.withYear(2018).withMonth(7);
System.out.println(ld3);
}	
}