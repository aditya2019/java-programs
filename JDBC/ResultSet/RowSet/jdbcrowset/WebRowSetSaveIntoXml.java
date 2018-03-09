import javax.sql.rowset.*;
import com.sun.rowset.WebRowSetImpl;
class WebRowSetSaveIntoXml
{
	public static void main(String...s)
	{
		try{
		WebRowSet wrs=new WebRowSetImpl();
		wrs.setUrl("jdbc:oracle:thin:@localhost");
		wrs.setUsername("system");
		wrs.setPassword("mca6");
		wrs.setCommand("select name ,id from awtable");
		wrs.execute();
		while(wrs.next())
		{
			System.out.print(wrs.getString(1)+"  ");
			System.out.println(wrs.getString(2));
		}
		java.io.FileWriter fr=new java.io.FileWriter("databaseWeb.xml");
		wrs.writeXml(fr);
		}catch(Exception e){System.out.println(e);}
	}
}
