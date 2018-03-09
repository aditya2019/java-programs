import javax.sql.rowset.*;
import java.sql.*;
public class ResultDemo
{
	public static void main(String...s)
	{
		String s1="oracle.jdbc.driver.OracleDriver";
		String s2="system";
		String s3="mca6";
		try{
		Class.forName(s1);
		//create factory obj for rowset
		RowSetFactory rsf=RowSetProvider.newFactory();
		//create jdbc rowset from factory
		JdbcRowSet jrs=rsf.createJdbcRowSet();
        //set connection properties
		jrs.setType(ResultSet.TYPE_SCROLL_SENSITIVE);
		jrs.setConcurrency(ResultSet.CONCUR_UPDATABLE);
		jrs.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		jrs.setUsername(s2);
		jrs.setPassword(s3);
		//set sql query to execute
		jrs.setCommand("select * from bank1");
		jrs.execute();
		System.out.println("name\t balance");
		//iterating the resultset
		while(jrs.next())
		{
			System.out.println(jrs.getInt("accno")+"\t"+jrs.getInt("bal"));
		}
		
		}catch(Exception e){System.out.println(e);}
		}
}