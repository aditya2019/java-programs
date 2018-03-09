import java.util.*;
class ArrayListDemo3
{
	public static void main(String...s)
	{
		ArrayList<ArrayList> al=new ArrayList<ArrayList>();
		ArrayList<String> all=new ArrayList<String>();
		System.out.println(all.size());
		all.add("A");
		all.add("B");
		all.add("C");
		all.add("D");
		all.add("E");
		all.add("F");
		all.add("G");
		al.add(all);
		al.add(al);
		System.out.println(all.size()+"  "+al.size());
		System.out.println(all);
		System.out.println(al);
	}
}