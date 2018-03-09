import java.io.*;
class InputStreamReaderExample
{
	public static void main(String...s)throws IOException
	{
		FileInputStream fin=new FileInputStream("abc.txt");	
		//FileInputStream fin=new FileInputStream(new File("C:\\Users\\Rahul\\Desktop\\java\\IO\\IO,ByteStream\\FileInput,OutputStream\\files\\abcd.txt"));
         //FileInputStream fin=new FileInputStream("C:\\Users\\Rahul\\Desktop\\java\\IO\\IO,ByteStream\\FileInput,OutputStream\\files\\abcd.txt");
	
	//...................converting into string....

	byte b[]=new byte[fin.available()];
	System.out.println(" "+fin.available());
	fin.read(b);
	String st=new String(b);
	System.out.print(st);
	//fin.reset();
	//......................direct print.........

		 int i=0;
		 while((i=fin.read())!=-1)
		 {
			 System.out.print((char)i);
		 }			 
	
	}
}
