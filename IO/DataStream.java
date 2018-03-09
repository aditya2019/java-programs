import java.io.*;
class DataStream
{
	public static void main(String...s)throws IOException
	{
		FileOutputStream fout=new FileOutputStream("caror.txt");
		DataOutputStream dout=new DataOutputStream(fout);
		dout.writeInt(20);
		dout.writeLong(90l);
		dout.writeBoolean(true);
		FileInputStream fin=new FileInputStream("caror.txt");
		DataInputStream din=new DataInputStream(fin);
		System.out.println(din.readInt());
		System.out.println(din.readLong());
		System.out.println(din.readBoolean());
	}
}