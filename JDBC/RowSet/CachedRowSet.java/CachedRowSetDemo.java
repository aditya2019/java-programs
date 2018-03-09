import java.io.*;
import java.sql.SQLException;
import oracle.jdbc.rowset.OracleCachedRowSet;
class CachedRowSetDemo
{
	private final static String filename="rahul.txt";
	public static void  main(String...s)
	{
		try{
			//writeChachedRowSet();
			OracleCachedRowSet ocrs=readCachedRowSet();
			while(ocrs.next())
			{
				System.out.println("accno = "+ocrs.getInt(1) +" "+"balance = "+ocrs.getInt(2));
			}
			ocrs.close();
		}catch(Exception e){System.out.println(e);}
	}
	public static void writeChachedRowSet()throws Exception
	{
		OracleCachedRowSet crs=new OracleCachedRowSet();
		crs.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		crs.setUsername("system");
		crs.setPassword("mca6");
		crs.setCommand("select*from bank1");
		crs.execute();
		FileOutputStream fou=new FileOutputStream(filename);
		ObjectOutputStream oos=new ObjectOutputStream(fou);
		oos.writeObject(crs);
		oos.close();
		crs.close();
	}
	public static OracleCachedRowSet readCachedRowSet()throws Exception
	{
		FileInputStream fis=new FileInputStream(filename);
		ObjectInputStream in=new ObjectInputStream(fis);
        OrawcleCachedRowSet crs=(OracleCachedRowSet)in.readObject();
fis.close();
in.close();
return crs	;	
	}
}