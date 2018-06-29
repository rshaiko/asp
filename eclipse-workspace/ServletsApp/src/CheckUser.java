

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CheckUser
 */
@WebServlet("/CheckUser")
public class CheckUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
response.setContentType("text/html");
		
		String result = "";
		String user = request.getParameter("user");
		String pass = request.getParameter("pass");
		String user2 = request.getParameter("user2");
		String pass2 = request.getParameter("pass2");
		
		if(user.equals(user2)&&pass.equals(pass2))
			result = "Successfull : " + user + " | " + pass;
		else
			result = "Fail !!! ";
		
		PrintWriter pw = response.getWriter();
		pw.write(result);
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
