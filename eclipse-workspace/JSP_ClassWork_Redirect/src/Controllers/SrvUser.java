package Controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.User;



@WebServlet("/SrvUser")
public class SrvUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		boolean result = false;
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		User user = new User();
		user.username=username;
		user.password=password;
		if(username.equals("user")&&password.equals("pass"))
			result = true;
		
 		request.setAttribute("loginResult", result);
		RequestDispatcher rd = request.getRequestDispatcher("student.jsp");
		rd.include(request, response);
	}

}
