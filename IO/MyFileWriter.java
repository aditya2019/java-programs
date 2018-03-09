import java.io.*;
class 				
{
	public static void main(String...sa)throws IOException
	{
//FileOutputStream fout=new FileOutputStream("lalu.txt");		
	 //write mode
	// FileOutputStream fout=new FileOutputStream("lalu.txt",true);
	 //append mode
     FileOutputStream fout=new FileOutputStream("d:\\n8\\lalu2.txt");
     //FileOutputStream fout=new FileOutputStream(new File("d:\\IO\\lalu2.txt"), true);
	 String s="hello If the physs multiple CPU cores at its disposal, however, then a CPU";
byte ch[]=s.getBytes();
//fout.write(ch);
for(int i=0;i<ch.length;i++)
{
	fout.write(ch[i]);
}
fout.close();
	}
}