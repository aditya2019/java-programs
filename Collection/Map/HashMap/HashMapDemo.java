import java.util.*;
class HashMapDemo
{
	public static void main(String...sty)
	{
		HashMap<String,String> hm=new HashMap<>();
		hm.put("1001","aaa");
		hm.put("1002","bbb");
		hm.put("1003","ccc");
		hm.put("1004","ddd");
		hm.put(new String("1001"),"zzz");
		Set s =hm.entrySet(); 
		/*it is method of HashMap class it will go each bucket and collect all 
		entry class object and return collection in form of set*/
		Iterator <Map.Entry> i=s.iterator();
		/*it will return Entry class obj , but entry Class is 
		nested hence can't be used outside but it implements Map.Entry 
		Hence in parent chile reference we will catch , Map.Entry has method getKey,getValue which will 
		give all key and value*/
		while(i.hasNext())
		{
			Map.Entry e=i.next();
			String k=(String)e.getKey();/*These both return obj of Object class so we need to downcast*/
			String v=(String)e.getValue();
			System.out.println(k+" = "+v);
		}
	}
}