package osa;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SendMailServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
	throws IOException {
resp.setContentType("text/plain");
resp.getWriter().println("Hello, world");
}
	
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
	throws IOException {
		
		String toaddress = req.getParameter("emailID");
	
		SendMail mail = new SendMail();
		mail.send(toaddress , "send Test mail from gae" , "this is the mail body");

resp.getWriter().println("mail sent successfully to "+toaddress);
}

}
