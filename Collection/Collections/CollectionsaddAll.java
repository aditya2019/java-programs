import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
class CollectionsaddAll
{
	public static void main(String...s)
	{
		ArrayList<String> al=new ArrayList<String>();
		al.add("java");
		al.add("php");
		al.add("mysql");
		al.add("c");
		al.add("c++");
		al.add("swift");
		System.out.println(al);
		Collections.addAll(al,".net","cSharp");
		System.out.println("After adding "+al);
		String str[]={"A","B","Python"};
		Collections.addAll(al,str);
		System.out.println("variable length "+al);
	}
	
}