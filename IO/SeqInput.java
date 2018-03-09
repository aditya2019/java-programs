import java.io.*;
import java.util.*;
class SeqInput
{
	public static void main(String...sa) throws IOException
	{
		//SequenceInputStream sin=new SequenceInputStream(new FileInputStream("chachi.txt"),new FileInputStream("chacha.txt"));
		SequenceInputStream sin=new SequenceInputStream(new MyEnum());
		DataInputStream din=new DataInputStream(sin);
		String s=" ";
		while(s!=null)
		{
			s=din.readLine();
			if(s!=null)
			{
				System.out.println(s);
			}
		}
	din.close();
	}
}
class MyEnum implements Enumeration
{
	InputStream in[];
	int i=0;
	MyEnum()
	{
		try{
		in=new InputStream[]{new FileInputStream("abcd.txt"),new FileInputStream("abc.txt"),new FileInputStream("chacha.txt"),new FileInputStream("chachi.txt")};
		}catch(Exception e)
		{}
	}
	
	public boolean hasMoreElements()
	{
		System.out.println("has more element");
		if(i<in.length)
			return true;
		else
			return false;
		
	}
	public Object nextElement()
	{
		System.out.println("next element");
	    return in[i++];
	}
}