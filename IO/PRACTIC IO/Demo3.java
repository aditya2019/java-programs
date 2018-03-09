import java.io.*;
class Demo3
{
	public static void main(String...ss) throws IOException
	{
		DataOutputStream dout=new DataOutputStream(new FileOutputStream("dataOp.txt"));
		//String s="The Prepared Statement is a slightly more powerful version of a Statement, and should always be at least";
      
		double d=65;
        boolean b=true;		
	 
	 // dout.writeBytes(s);
	  dout.writeInt(10);
	  dout.writeBoolean(b);
	  dout.writeDouble(d);
	  DataInputStream din=new DataInputStream(new FileInputStream("dataOp.txt"));
       //System.out.println(din.readLine());
	int a=din.readInt();
		 System.out.println(a);
	 System.out.println( din.readBoolean());
	 System.out.println(din.readDouble());  
	
	}
}