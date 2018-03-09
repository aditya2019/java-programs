import java.util.*;
class MyListRotate
{
	public static void main(String...s)
	{
		List<String> l=new ArrayList<>();
		l.add("java");
		l.add("c");
		l.add("c++");
		l.add("unix");
		l.add("perl");
		l.add("php");
		l.add("javascript");
		l.add("ruby");
		l.add(".net");
		System.out.println(l);
		System.out.println(Collections.rotate(l,5));
		System.out.println(l);
	}
}