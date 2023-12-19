package StudentDAO;
import java.sql.*;
import Studentobjectmodel.student;

public class StudDAO {
	
	public student getstud(int sid)
	{
		student st=new student();
		try {
			String Url="jdbc:mysql://localhost:3306/Student"; //this is the mysql url and jdbc_db is the database name in mysql
			String Uname="root";  // this is mysql username
			String password="Scorpio@143"; //this is the password which i have created
			String query1=("Select * from student where sid="+sid);
			Class.forName("com.mysql.cj.jdbc.Driver");  // default address to load and register the driver
			Connection con=DriverManager.getConnection(Url,Uname,password);
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery(query1);
			if(rs.next())
			{
				st.setSid(rs.getInt("sid"));
				st.setSname(rs.getString("sname"));
				st.setGender(rs.getString("gender"));
			}
			}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		return st;
	}

}
