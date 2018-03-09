import java.util.Collections;
import java.util.ArrayList;
class MaxArrayList
{
	public static void main(String...s)
	{
		ArrayList<Integer>al=new ArrayList<Integer>();
		al.add(new Integer(3));
		al.add(new Integer(1));
		al.add(new Integer(5));
		al.add(new Integer(4));
		al.add(new Integer(9));
		Object obj1=Collections.min(al);
		System.out.println("Min = "+obj1);
		Object obj2=Collections.max(al);
		System.out.println("Max = "+obj2);
	}
}