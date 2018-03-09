import java.io.*;
class MyFileWriter
{
	public static void main(String...sa) throws IOException
	{
		FileWriter fw=new FileWriter("abcd.txt");
		//FileWriter fw=new FileWriter("abcd.txt" ,true);
		//FileWriter fw=new FileWriter(new File("d:\\n8\\abcd.txt"));
		String s=" India is best country ";
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			fw.write(ch[i]);
		}
		fw.close();
	}	
}