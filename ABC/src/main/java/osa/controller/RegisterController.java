package osa.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import osa.service.UserDetailsService;


public class RegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String name=request.getParameter("email");
		String pass=request.getParameter("pass");
		
		UserDetailsService udd =new UserDetailsService();
		if(udd.checkIfUserAlreadyExists(name))
		{
			System.out.println("ALREADY EXISTS");
		}
		else
		{
			udd.registerUser(name,pass);
			System.out.println("NEW USER CREATED");
		}
		
	}

}
