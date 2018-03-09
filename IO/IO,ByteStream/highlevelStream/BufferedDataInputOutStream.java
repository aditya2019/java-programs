import java.io.*;
class BufferedDataInputOutStream
{
	public static void main(String...s)throws IOException
	{
		FileOutputStream fout=new FileOutputStream("abc.txt");
		BufferedOutputStream bout=new BufferedOutputStream(fout);
		DataOutputStream dout=new DataOutputStream(bout);//store encrypted data
		int x=10;
		long y=1231l;
		dout.writeInt(x);
		dout.writeDouble(y);
		dout.close();
		FileInputStream fin= new FileInputStream("abc.txt");
		DataInputStream din=new DataInputStream(fin);
		System.out.println(din.readInt());
		System.out.println(din.readDouble());
	}
}