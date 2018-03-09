import java.io.*;
class ByteArrayInputOutputStream
{
	public static void main(String...sdfs)throws IOException
	{
		ByteArrayOutputStream bin=new ByteArrayOutputStream();
		String s="india is a great country";
		byte b[]=s.getBytes();
		bin.write(b);
		bin.writeTo(new FileOutputStream("rabri.txt"));//takes output stream 
		bin.writeTo(new FileOutputStream("rabri1.txt"));
		bin.writeTo(new FileOutputStream("rabri2.txt"));
		System.out.println(bin.toString());
		byte bb[]=bin.toByteArray();
		ByteArrayInputStream bain=new ByteArrayInputStream(bb);
	int i=0;
	while((i=bain.read())!=-1)
	{
	    System.out.print((char)i);
	}
	}
	
}