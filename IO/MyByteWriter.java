import java.io.*;
class MyByteWriter
{
	public static void main(String...s)throws IOException
	{
    ByteArrayOutputStream b=new ByteArrayOutputStream();
    String d="India is a good country which is our respect , we can sacrifies on which"	;
	byte ch[]=d.getBytes();
	//b.write(ch);
	for(int i=0;i<ch.length;i++)
	{
		b.write(ch[i]);
	}
	b.writeTo(new FileOutputStream("respect.txt"));
	System.out.println(b.toString());
	byte bt[]=b.toByteArray();
	ByteArrayInputStream br=new ByteArrayInputStream(bt);
	int j=0;
	
	while((j=br.read())!=-1)
	{
		System.out.print((char)j);
	}
	
	
	}
}