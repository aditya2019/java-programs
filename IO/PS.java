import java.io.*;
class PS
{
	public static void main(String...s) throws IOException
	{
	FileOutputStream fout=new FileOutputStream("chachi.txt");
    PrintStream ps=new PrintStream(fout);
	FileOutputStream fout1=new FileOutputStream("chacha.txt");
	PrintStream ps1=new PrintStream(fout1);
	System.out.println("before .... show on montor");
	PrintStream ps4=System.out;
	System.setOut(ps);
	System.out.println("into chachi420...,,,,,...reference of chachi.txt");
    System.out.println("into chachi840...,,,,,...reference of chachi.txt");	
	System.err.println("into montor");
	System.setErr(ps1);
	//System.out=ps4; // show error , value of final cant't be changed
	System.setOut(ps1);
	System.err.println("chacha240");
	System.out.println("into chacha...,,,,,...reference of chacha.txt");
	System.setOut(ps4);
	System.out.println("After change monitoe op");
	}
}