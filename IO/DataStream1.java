import java.io.*;
class DataStream1
{
	public static void main(String...sa) throws IOException
	{
		DataInputStream din=new DataInputStream(System.in);
        FileOutputStream fout=new FileOutputStream("DataStream1.txt");
    	DataOutputStream dout=new DataOutputStream(fout);
		String s=" ";
        while(!(s.equals("stop")))
		{
			s=din.readLine();
			System.out.println(s);
			//dout.writeBytes(s);
			//dout.writeChars(s) ;
			dout.writeUTF(s);
			dout.flush();
	
		}			
			din.close();
			dout.close();	
		
	}
	
}