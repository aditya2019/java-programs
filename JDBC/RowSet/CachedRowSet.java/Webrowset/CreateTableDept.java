import java.sql.*;
class CreateTableDept
{
	public static void main(String...s){
		try{
			Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","mca6");
            Statement st=c.createStatement();
			st.executeUpdate("create table dept(dept_id varchar2(10),Dept_name varchar2(20))");

			
		}catch(Exception e){System.out.println(e);}
	}
}