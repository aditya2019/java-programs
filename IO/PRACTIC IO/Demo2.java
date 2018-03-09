import java.io.*;
class Demo2
{
	public static void main(String...ss) throws IOException
	{
		/*BufferedOutputStream bout=new BufferedOutputStream(new FileOutputStream("abc123.txt"));
		String s="Although many useful tasks can be carried out with simple";
		byte b[]=s.getBytes();
		for(int i=0;i<b.length;i++){
		bout.write(b[i]);
		}*/
		BufferedInputStream bin=new BufferedInputStream(new FileInputStream("abc11.txt"));
		int j=0;
		while((j=bin.read())!=-1)
		{
			System.out.print((char)j);
		}
		
	}
	
}