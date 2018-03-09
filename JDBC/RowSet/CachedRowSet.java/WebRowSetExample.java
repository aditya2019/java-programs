import javax.sql.rowset.WebRowSet;
import com.sun.rowset.WebRowSetImpl;
class WebRowSetExample
{
	public static void main(String...s)
	{
		try{
			WebRowSet wrs=new WebRowSetImpl();
			wrs.setUsername("system");
			wrs.setPassword("mca6");
            wrs.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
            wrs.setCommand("select *from bank1");
            wrs.execute();
			while(wrs.next())
			{
				System.out.println(wrs.getInt(1)+"  "+wrs.getInt(2));
			}
  java.io.FileWriter fw=new java.io.FileWriter("C:\\Users\\Rahul\\Desktop\\J2EE\\JDBC\\RowSet\\\\bank1.xml");
wrs.writeXml(fw);
			
		}catch(Exception e){System.out.println(e);}
	}
}