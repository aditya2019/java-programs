import java.util.*;
class MyListFrequency
{
	public static void main(String...s)
	{
		List<String> l=new ArrayList<>();
		l.add("one");
		l.add("two");
		l.add("three");
		l.add("one");
		l.add("four");
		l.add("one");
		l.add("one");
		l.add("four");
		l.add("five");
		l.add("six");
		l.add("seven");
		l.add("one");
		l.add("one");
		l.add("seven");
		l.add("one");
		l.add("one");
		l.add("one");
		int c1=Collections.frequency(l,"one");
		int c2=Collections.frequency(l,"three");
		int c3=Collections.frequency(l,"four");
		int c4=Collections.frequency(l,"seven");
	System.out.println(c1+" \n"+c2+"\n"+c3+"\n"+c4);
	}
	
}