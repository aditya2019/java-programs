import java.io.*;
class EmeptyDir
{
	public static void main(String...s)
	{
		File f=new File("D:\\project file");
		
if(f.isDirectory())
{
	String d[]=f.list();

		if(d.length>0)
		{
			System.out.print("The "+f.getPath()+" is emepty");
		}
	}
}}