import java.io.*;
class ExternalExample1
{
	public static void main(String...sss)
	{
		Car1 car=new Car1("Farari",2019);
		Car1 newcar=null;
		try
		{
		FileOutputStream fout=new FileOutputStream("temp.doc");
		ObjectOutputStream oos=new ObjectOutputStream(fout);
		oos.writeObject(car);
		oos.flush();
		}catch(Exception e)
		{
			System.out.println(e);
		}
		try
		{
			FileInputStream fin=new FileInputStream("temp.doc");
			ObjectInputStream ois=new ObjectInputStream(fin);
			newcar=(Car1)ois.readObject();
		}catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println(car);
		System.out.println(newcar);
	}
}