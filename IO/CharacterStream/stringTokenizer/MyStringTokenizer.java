import java.util.*;
import java.io.*;
class MyStringTokenizer 
{
	public static void main(String...ss)throws IOException
	{
		String s="country=india capital=delhi;country=japan capital=tokio;";
	    StringTokenizer st1 = new StringTokenizer(s,";=");
		while(st1.hasMoreTokens())
		{
			System.out.println(st1.nextToken());
		}
	}
}