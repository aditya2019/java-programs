import java.io.*;
class Demo1
{
	public static void main(String...ss) throws IOException
	{
		 ByteArrayOutputStream bout=new ByteArrayOutputStream();
       
         String s="Although many useful tasks can be carried out with simple"	;	  
	     byte b[]=s.getBytes();
		
		 bout.write(b);
		 bout.writeTo(new FileOutputStream("abc11.txt") );
		 System.out.println(bout.toString());
	
	byte z[]=bout.toByteArray();
	ByteArrayInputStream bin=new ByteArrayInputStream(z);
	int i=0;
	while((i=bin.read())!=-1)
	{
	System.out.print((char)i);	
	}
	}
}