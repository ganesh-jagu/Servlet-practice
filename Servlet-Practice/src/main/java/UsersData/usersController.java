package UsersData;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class usersController
 */
@WebServlet("/usersGet")
public class usersController extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		int uid=Integer.parseInt(req.getParameter("userId"));
		
		usersDao ud=new usersDao();
		
		users u1= ud.getuser(uid);
		
		req.setAttribute("user", u1);
		
		RequestDispatcher rd=req.getRequestDispatcher("showUsers.jsp");
		rd.forward(req, res);
	
	}

}
