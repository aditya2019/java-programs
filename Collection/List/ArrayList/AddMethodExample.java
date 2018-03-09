import java.util.*;
class AddMethodExample
{
	public static void main(String...s)
	{
		ArrayList<String> al=new ArrayList<>();
		al.add("A");
		al.add("b");
		al.add("c");
		al.add("d");
		al.add("e");
		al.add("f");
			System.out.println(al);
			al.add(0,"Hii");
				System.out.println(al);
	}
}