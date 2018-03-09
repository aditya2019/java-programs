import java.util.Collections;
import java.util.Vector;
import java.util.Enumeration;
import java.util.List;
public class MyEnumerationToList

	public static void main(String...ss)
	{
		Vector<String> v=new Vector<>();
		v.add("a");
		v.add("b");
		v.add("c");
		v.add("d");
		v.add("e");
		//from enumeration to List ele add
		Enumeration<String> enm=v.elements();
		List<String> l=Collections.list(enm);
		System.out.println(l);
	}
}