import java.io.*;
class FileOutputStreamWriteAppentModes
{
	public static void main(String...s12)throws IOException
	{
		//FileOutputStream fout=new FileOutputStream("abc.txt");//write mode
		//FileOutputStream fout=new FileOutputStream("abc.txt",true);//append mode
		//FileOutputStream fout=new FileOutputStream(new File("C:\\Users\\Rahul\\Desktop\\java\\IO\\IO,ByteStream\\FileInput,OutputStream\\files\\abcd.txt"));
         FileOutputStream fout=new FileOutputStream(new File("C:\\Users\\Rahul\\Desktop\\java\\IO\\IO,ByteStream\\FileInput,OutputStream\\files\\abcd.txt"),true);

		String s="india is a great country";
	byte b[]=s.getBytes();
	for(int i=0;i<b.length;i++)
		fout.write(b[i]);
	fout.close();
	
	}
}