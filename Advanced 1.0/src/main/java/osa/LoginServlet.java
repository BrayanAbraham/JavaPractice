package osa;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class LoginServlet extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String name=request.getParameter("name");
		String pass=request.getParameter("password");
		out.println("<html><body>");
		if(name.equals("BRAYAN")&&pass.equals("ABRAHAM"))
			response.sendRedirect("login2");
		else
			response.sendRedirect("www.facebook.com");
		out.println("<?body></html>");
	}

}
