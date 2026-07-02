package UsersData;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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
		st.close();
		con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return u;
	}
	
	// Inserting the users
	public users setuser(users u2) {
		try {
			String uname=u2.getUname();
			String ucource=u2.getCourse();
			String query="insert into users (uname,course) values (?,?)";
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jstl","root","root");
			PreparedStatement ps=con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
			ps.setString(1,uname);
			ps.setString(2, ucource);
			
			int rows=ps.executeUpdate();
			
			if(rows>0)
			{
				ResultSet rs=ps.getGeneratedKeys();
				if(rs.next())
				{
					int id=rs.getInt(1);
					System.out.println("Your ID is"+id);
					u2.setUid(id);
				}
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return u2;
	}
}
