import java.sql.*;
class CreateTableEmp1
{
	public static void main(String...s){
		try{
			Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","mca6");
            Statement st=c.createStatement();
			st.executeUpdate("create table emp(empid varchar2(10),name varchar2(20),age number(3),dept_id varchar2(10))");

			
		}catch(Exception e){System.out.println(e);}
	}
}