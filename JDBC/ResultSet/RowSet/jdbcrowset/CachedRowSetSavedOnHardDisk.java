import java.sql.*;
import java.io.*;
import javax.sql.rowset.*;
import javax.sql.*;
//import javax.sql.rowset.RowSetProvider
//import com.sun.rowset.CachedRowSetImpl;
import oracle.jdbc.rowset.OracleCachedRowSet;
 class CachedRowSetSavedOnHardDisk
{
	
	public static void main(String...s)
	{OracleCachedRowSet ocrs=null;
		try{
			// ocrs=writeCachedRowSet();
			 ocrs=readCachedRowSet();
			while(ocrs.next())
			{
				System.out.print(ocrs.getString(1)+" ");
	System.out.println(ocrs.getString(2));

			}
	}catch(Exception e){System.out.println(e);}
	
	}
	public static OracleCachedRowSet writeCachedRowSet()
	{OracleCachedRowSet crs=null;
		try{
			crs=new OracleCachedRowSet();
			crs.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
			crs.setUsername("system");
			crs.setPassword("mca6");
			crs.setCommand("select name,id from awtable");
			crs.execute();
			
			FileOutputStream fout=new FileOutputStream("cachedRowsetData.txt");
		    ObjectOutputStream oout=new ObjectOutputStream(fout);
			oout.writeObject(crs);
			oout.close();
			oout.close();
			
		}catch(Exception e){System.out.println(e);}
	return crs;
	}
	public static OracleCachedRowSet readCachedRowSet()
	{
		OracleCachedRowSet crs=null;
		try{
			FileInputStream fin=new FileInputStream("cachedRowsetData.txt");
			ObjectInputStream ois=new ObjectInputStream(fin);
			crs=(OracleCachedRowSet)ois.readObject();
             fin.close();
             ois.close();
		  
                		
		}catch(Exception e){System.out.println(e);}
	 return crs;
	}
	
}