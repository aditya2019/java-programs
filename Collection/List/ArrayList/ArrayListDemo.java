 import java.util.*;
 class ArrayListDemo
 {
	 public static void main(String...s)
	 {
	ArrayList<String> al=new ArrayList<String>();
      //ArrayList al=new ArrayList();
		System.out.println(al +"  "+al.size());
		al.add("A");
		al.add("B");
		al.add("C");
		al.add("D");
		al.add("E");
		//al.add(new Integer(10));
			System.out.println(al +"  "+al.size());
			al.remove(0);
	 System.out.println(al +"  "+al.size());
	 }
 }