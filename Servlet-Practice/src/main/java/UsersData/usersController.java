package UsersData;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns={"/usersGet", "/userPost"})
public class usersController extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		// get the user data
		int uid=Integer.parseInt(req.getParameter("userId"));
		
		usersDao ud=new usersDao();
		
		users u1= ud.getuser(uid);
		
		req.setAttribute("user", u1);
		
		RequestDispatcher rd=req.getRequestDispatcher("showUsers.jsp");
		rd.forward(req, res);
	}
	// Post user data
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		
		String uname=req.getParameter("uname");
		String course=req.getParameter("course");
		users u2 = new users();
		u2.setUname(uname);
		u2.setCourse(course);
		
		usersDao ud2=new usersDao();
		users u3=ud2.setuser(u2);
		
		req.setAttribute("uid", u3);
		RequestDispatcher rd2=req.getRequestDispatcher("showUsers.jsp");
		rd2.forward(req, res);
	}

}
