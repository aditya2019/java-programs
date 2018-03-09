import java.io.*;
class PrintStreamOutErrIn
{
	public static void main(String...s)throws IOException
	{
		FileOutputStream fout=new FileOutputStream("cde.txt");
		System.out.println("hello");
		PrintStream pw=new PrintStream(fout);
		PrintStream ps2=System.out;
		System.setOut(pw);
		System.out.println("hello");
		
		System.setOut(ps2);
		System.out.println("hello");
		
		FileOutputStream fout1=new FileOutputStream("cde1.txt");
		System.err.println("hello1");
		PrintStream pw1=new PrintStream(fout1);
		System.setErr(pw1);
		System.err.println("hello1");
		
	}
}