package UsersData;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class usersDao {
	public users getuser(int uid)
	{
		users u=new users();

		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jstl","root","root");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from users where uid=" +uid);
		
		if(rs.next())
		{
			u.setUid(rs.getInt(1));
			u.setUname(rs.getString(2));
			u.setCourse(rs.getString(3));
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return u;
	}
	
}
