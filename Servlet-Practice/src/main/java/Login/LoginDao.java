package Login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDao {
	public boolean check(String uname, String password) {
	try {
		System.out.println("we get the Request"+uname+"-"+password);
		String query="select * from login where user=? and pass=?";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jstl","root","root");
		PreparedStatement ps=con.prepareStatement(query);
		ps.setString(1,uname);
		ps.setString(2,password);
		
		ResultSet rs=ps.executeQuery();
		
		if(rs.next())
		{
			return true;
		}
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	return false;
	
	}

}
