package osa;

import java.io.IOException;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class CronJob extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private static String fromAddress="brayanabraham@gmail.com";
   	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
   		send("abc@gmail.com","cron run","code running");
   		System.out.println("code running");
   		
	}
   	public void send(String toAddress, String subject, String msgBody)
   	      throws IOException {

   	    Properties props = new Properties();
   	    Session session = Session.getDefaultInstance(props, null);

   	    try {
   	    	Message msg = new MimeMessage(session);
   		      msg.setFrom(new InternetAddress(fromAddress));
   		      InternetAddress to = new InternetAddress(toAddress);
   		      msg.addRecipient(Message.RecipientType.TO, to);
   		      msg.setSubject(subject);
   		      msg.setText(msgBody);
   		      Transport.send(msg);

   	    } catch (AddressException addressException) {
   	    // log.log(Level.SEVERE, "Address Exception , mail could not be sent", addressException);
   	    } catch (MessagingException messageException) {
   	     // log.log(Level.SEVERE, "Messaging Exception , mail could not be sent", messageException);
   	    }
   	  }

}
