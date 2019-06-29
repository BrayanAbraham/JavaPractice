package osa;


import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import static osa.OfyService.ofy;
import osa.UserDetails;


public class Datastore_demoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("email");
		String pass= request.getParameter("pass");
		
		UserDetails user = new UserDetails(name, pass);
		ofy().save().entity(user).now();
		ofy().clear();
		
		UserDetails ud=ofy().load().type(UserDetails.class).id("BRAYAN").now();
		System.out.println(ud.name);
		System.out.println(ud.pass);
		ofy().clear();
		
		List<UserDetails> li = ofy().load().type(UserDetails.class).list();
		Iterator<UserDetails> itr = li.iterator();
		while(itr.hasNext())
		{
			UserDetails u=itr.next();
			System.out.println(u.name);
			System.out.println(u.pass);
		}
		
		ofy().delete().entity(user);
		ofy().delete().entities(user,ud);
		
		ofy().delete().type(UserDetails.class).id("BINDU");
		ofy().delete().type(UserDetails.class).ids("GABRIEL", "JASON");
		
		response.getWriter().println("CHECK DATASTORE");
	}

}
