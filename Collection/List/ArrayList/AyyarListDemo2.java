import java.util.*;
class AyyarListDemo2
{
	public static void main(String...s)
	{
		ArrayList<Integer> al =new ArrayList<Integer>();
		int  x[]={1,2,3,4,5};
		for(int i=0;i<x.length;i++)
		al.add(x[i]);
             Object o[]=al.toArray();
for(int i=0;i<o.length;i++)
{
	Integer z=(Integer)o[i];
	System.out.print(z.intValue()+" ");
}	
	System.out.println(" ");
	for(Integer z:al)
	{
	System.out.print(z+" ");	
	}
	}
}