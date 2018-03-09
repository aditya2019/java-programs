import java.io.*;
class KeyboardBufferDataInputStream
{
	public static void main(String...sfd)throws IOException
	{
		DataInputStream din=new DataInputStream(System.in);
		FileOutputStream fout=new FileOutputStream("fileKeyboardData.txt");
		//DataOutputStream dout=new DataOutputStream(fout);
		PrintStream pw=new PrintStream(fout);
		//System.setOut(pw);
		String s="";
		while(!s.equals("stop"))
		{
			s=din.readLine();
			//dout.writeBytes(s);
			pw.println(s);//it will only put data in fout stream when it become full
			//System.out.println(s);
			//System.out.println(s);
			//dout.writeChar(s);
			//dout.writeUTF(s);
			//dout.flush();
			
		}
		din.close();
		//dout.close();
		pw.close();
	}
}