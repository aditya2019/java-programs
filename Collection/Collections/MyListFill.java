import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
class MyListFill
{
	public static void main(String...s)
	{
		List<String>al=new ArrayList<>();
		al.add("hii");
		al.add("hello");
		al.add("yupps");
		al.add("hii there !!!");
		System.out.println(al);
		Collections.fill(al," Rahul ");
		System.out.println(al);
	}
}