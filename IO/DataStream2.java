import java.io.*;
class DataStream2
{
	public static void main(String...sa) throws IOException
	{
		DataInputStream din=new DataInputStream(System.in);
        FileOutputStream fout=new FileOutputStream("DataStream1.txt");
    	PrintStream dout=new PrintStream(fout);
		String s=" ";
        while(!(s.equals("stop")))
		{
			s=din.readLine();
			System.out.println(s);
			dout.println(s);
			//dout.flush(); not needed but we can since printf take all data of buffer
	
		}			
			din.close();
			dout.close();	
		
	}
	
}