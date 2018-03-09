import java.util.ArrayList;
import java.util.Collections;
class ArryListBinarySearch
{
	public static void main(String...s)
	{
		ArrayList<String> al=new ArrayList<String>();
		al.add("1");
		al.add("2");
		al.add("5");
        al.add("7");
        al.add("4");
        al.add("2");
		System.out.println(al);
Collections.sort(al);
System.out.println(al);
int i=Collections.binarySearch(al,"4");	
System.out.println("index nu of 2 in arrayList "+i);	
	}
	
}