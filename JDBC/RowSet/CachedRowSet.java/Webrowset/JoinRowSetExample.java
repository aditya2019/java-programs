import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.JoinRowSet;
import com.sun.rowset.CachedRowSetImpl;
import com.sun.rowset.JoinRowSetImpl;
class JoinRowSetExample
{
	public static void main(String...s)throws Exception
	{
		CachedRowSet employee=new CachedRowSetImpl();
		employee.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		employee.setUsername("system");
		employee.setPassword("mca6");
		employee.setCommand("select naem,dept_id from emp");
		employee.execute();
		CachedRowSet deptment=new CachedRowSetImpl();
         deptment.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		deptment.setUsername("system");
		deptment.setPassword("mca6");
		 deptment.setCommand("select dept_id, dept_name from dept");
		 deptment.execute();
		 JoinRowSet jrs=new JoinRowSetImpl();
		  jrs.addRowSet(deptment,1);
		 jrs.addRowSet(employee,2);
		
		 while(jrs.next())
		 {
			 System.out.print("emp is "+jrs.getString(1)+"   ");
			 System.out.println("department is "+jrs.getString(3));
		 }
		}
}