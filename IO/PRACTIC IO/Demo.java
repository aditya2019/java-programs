import java.io.*;
class Demo
{
public static void main(String...ss)throws IOException
{
		FileOutputStream fout1= new FileOutputStream("abc.txt");
	//FileOutputStream fout= new FileOutputStream(new File("abc1.txt"),true);
FileOutputStream fout= new FileOutputStream(new File("d:\\n8\\abc1.txt"));
FileInputStream fin=new FileInputStream("abc.txt");
	String s="Although many useful tasks can be carried out with simple batch files containing just a few lines, the full power that is available can only be realized with the more advanced methods of branching, iterating, and looping. These methods are among the tools used by programmers to create very sophisticated scripts. However, the concepts are actually quite easy to grasp.and are accessible to those with no background in programming. Just a few extra lines in a batch file using these tools can add a very significant increase in versatility and power. ";
    byte b[]=s.getBytes();
	//fout.write(b);
	for(int i=0;i<b.length;i++)
	{
		fout.write(b[i]);
		fout1.write(b[i]);
	}
	int bb;
	while((bb=fin.read())!=-1)
	{
	//System.out.print(bb);
	System.out.print((char)bb);
		}
	fin.close();
	}
	
}