import java.io.*;
class List
{
	public static void main(String...ssss){
		File f=new File("D:\\Java program");
		String s[]=f.list();
		for(String p:s)
		System.out.println(p);
	} 
}