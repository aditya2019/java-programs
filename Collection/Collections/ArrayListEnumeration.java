import java.util.Collections;
import java.util.ArrayList;
import java.util.Enumeration;
class ArrayListEnumeration
{
	public static void main(String...s)
	{
		ArrayList<String> al=new ArrayList<String>();
	al.add("A");
	al.add("B");
	al.add("C");
	al.add("D");
	al.add("E");
	al.add("F");
	Enumeration e=Collections.enumeration(al);
	while(e.hasMoreElements())
	{
		System.out.println(e.nextElement());
	}
	}
	
}