import java.util.*;
class MyEmptyList 
{
	public static void main(String...s)
	{
		List<String> l=Collections.<String>emptyList();
		//l.add("list");
		System.out.println(l);
		
			Map<String,String> m=Collections.<String,String>emptyMap();
				
		System.out.println(m);
	
			Set<String> ss=Collections.<String>emptySet();
			
		System.out.println(ss);
	}
}