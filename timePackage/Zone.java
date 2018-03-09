import java.util.*;
import java.time.ZoneId;
class Zone
{
	public static void main(String...s)
	{
	Set<String> z=ZoneId.getAvailableZoneIds();
TreeSet<String> ts=new TreeSet<>(z);
	for(String zz:ts)
System.out.println(zz);	
	}
}