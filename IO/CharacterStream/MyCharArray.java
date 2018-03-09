import java.io.*;
class MyCharArray
{
	public static void main(String...sss) throws IOException
	{
		
		CharArrayWriter caw=new CharArrayWriter();
		String s="India is a good country";
		char ch[]=s.toCharArray();
		
		for(int l=0;l<ch.length;l++)
		caw.write(ch[l]);
		FileWriter f=new FileWriter("ab.txt");
		caw.writeTo(f);
		caw.close();
		f.close();
		System.out.println(new FileReader("ab.txt").read());
		//System.out.println(caw);
		System.out.println(caw.toString());

		char c[]=caw.toCharArray();
		
		CharArrayReader car=new CharArrayReader(c);
		int j=0;
		while((j=car.read())!=-1)
		{
		System.out.print((char)j);	
			
		}
		
		
		
		
		
		
		
		/* to check whether file is in file*/
		FileReader fr=new FileReader("ab.txt");
		 int i=0;
while((i=fr.read())!=-1)
{
	System.out.print("using method "+i);
}
//fr.close();
	}	
}