import java.util.Collections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
class MyCheckedCollection
{
	public static void main(String...s)
	{
		ArrayList al=new ArrayList();
		al.add("hii");
		al.add("hii1");
		al.add("hii2");
		al.add("hii3");
		al.add(1);
		al.add(2);
		System.out.println(al);
Collection c=Collections.checkedList(al,String.class);
System.out.println(c);
//we can add any type of element in al
al.add(30);
System.out.println(al);
//but we can't add any type of element in c ,except String
c.add(10);
//it will throw class cast Exception
c.add("again");
System.out.println(c);

	}
}
/*List l=Collections.CheckedList(al,String.class);
Map l=Collections.CheckedMap(al,String.class,Integer.class)
Set l=Collections.CheckedSet(al,String.class);*/