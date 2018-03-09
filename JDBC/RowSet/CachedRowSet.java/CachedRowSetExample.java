import com.sun.rowset.CachedRowSetImpl;
import javax.sql.rowset.CachedRowSet;
class CachedRowSetExample
{
	public static void main(String...s)throws Exception
	{
		CachedRowSet crs=new CachedRowSetImpl();
		crs.setUsername("System");
		crs.setPassword("mca6");
		crs.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		crs.setCommand("select *from bank1");
		crs.execute();
		System.out.println("accno \t bal");
		while(crs.next())
		{
			System.out.println(crs.getInt(1)+" "+crs.getInt(2));
		}
	}
	
}