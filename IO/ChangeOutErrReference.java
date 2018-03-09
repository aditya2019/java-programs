import java.io.*;
class ChangeOutErrReference
{
	public static void main(String...sa) throws IOException
	{
		FileOutputStream fout= new FileOutputStream("abcde.txt");
		PrintStream ps=new PrintStream(fout);
		System.out.println("it will displayed on monitor (consol)");
		System.setOut(ps);
		System.out.println("it will be shown in file abcde file using out , since reference in out has been changed by setout method");
		FileOutputStream fout1=new FileOutputStream("abcdef.txt");
		PrintStream ps1=new PrintStream(fout1);
		System.err.println("err static final reference variable of System class will show op on consol");
		System.setErr(ps1);
		System.err.println("it will show op in  abcdef file");
		
	}
	
}