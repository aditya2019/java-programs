import java.util.*;
class MyListReplaceAll
{
	public static void main(String...s)
	{ 
	List <String> l=new ArrayList<>();
l.add("unix");	
l.add("perl");
l.add("php");
l.add("java");
l.add("javaScript");
l.add("ruby");
l.add(".net");
l.add("perl");
l.add("c++");
System.out.println(l);
System.out.println(Collections.replaceAll(l,"perl","Rahul"));
System.out.println(l);
	}
}