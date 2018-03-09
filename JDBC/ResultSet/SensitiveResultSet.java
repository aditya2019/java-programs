import java.sql.*;
class SensitiveResultSet
{
public static void main(String...s)
{
	Statement st=null;
	Statement st1=null;
	//ResultSet rs=null;
	try{
		Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","mca6");
		DatabaseMetaData dbmd=c.getMetaData();
		boolean b1=dbmd.supportsResultSetType(ResultSet.TYPE_SCROLL_SENSITIVE);
		boolean b2=dbmd.supportsResultSetType(ResultSet.CONCUR_UPDATABLE);
		System.out.println("is rs sensitive? "+b1+"is rs updatable? "+b2);
		st=c.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE,ResultSet.HOLD_CURSORS_OVER_COMMIT);
		st1=c.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
        st.setFetchSize(1);
        MyThread1 t1=new MyThread1(st,st1);
        t1.start();		
	
	}catch(Exception e){e.printStackTrace();}
}
}
class MyThread1 extends Thread
{
	Statement st;
	Statement st1;
	ResultSet rs;
	MyThread1(Statement st,Statement st1)
	{this.st=st;
	this.st1=st1;}
	public void run()
	{
		try{
			rs=st.executeQuery("select accno,bal from bank1");
			while(rs.next()){
				System.out.print(rs.getInt("accno")+" ");
				System.out.println(rs.getInt(2));
			}
			MyThread2 t2=new MyThread2(st1);
			t2.start();
			try{
				t2.join();
			}catch(Exception i){System.out.println(i);}
         rs.beforeFirst();
         System.out.println("after changes in database");
        while(rs.next())
		{
      System.out.print(rs.getInt(1)+" ");
	   System.out.println(rs.getInt(2));
		}	
	}catch(Exception e){e.printStackTrace();}
	}
}
class MyThread2 extends Thread 
{
	Statement st1;
	MyThread2(Statement st1)
	{
		this.st1=st1;
	}
	public void run()
	{
		try{
			st1.execute("update bank1 set bal=bal+500");
			st1.execute("commit");
			st1.close();
		System.out.println("record updated");
		Thread.sleep(1000);
		}catch(Exception e){e.printStackTrace();}
	}
}