import java.io.*;
import java.util.ArrayList;
class ArrayListSerialization
{
	public static void main(String...s)
	{
		ArrayList<String> al=new ArrayList<String>();
		al.add("Hii");
		al.add("Hii hello");
		al.add("Hii hii");
		al.add("Hii jii");
		al.add("Hii hii hii");
		try
		{
			FileOutputStream fos=new FileOutputStream("myFile");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(al);
			oos.close();
			fos.close();
			System.out.println("After deserialization of object ");
			FileInputStream fin=new FileInputStream("myFile");
			ObjectInputStream oin=new ObjectInputStream(fin);
			ArrayList al1=(ArrayList)oin.readObject();
			System.out.println(al1);
			oin.close();
			fin.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}