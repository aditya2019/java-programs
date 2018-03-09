import java.sql.*;
class SetGetFetchSize
{
	public static void main(String...s)throws Exception
	{
		Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","mca6");
		Statement st=c.createStatement();
		//get fetch size
		System.out.println("default size "+st.getFetchSize());
		//Set fetch size
		st.setFetchSize(100);
		//get fetch size
		System.out.println("statement set size 100  "+st.getFetchSize());
		ResultSet rs=st.executeQuery("select *from bank1");
		//get fetch size
		System.out.println("rs fetch size "+rs.getFetchSize());
		//Set fetch size
		rs.setFetchSize(200);
		//get fetch size
		System.out.println("set rs size 200  "+rs.getFetchSize());
		//Set fetch size
		st.setFetchSize(300);
		//get fetch size
		System.out.println("st size 300 "+rs.getFetchSize());//but size will not be updated to rs because rs is already open
		}
}