<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
   // Create cookies for first and last names.      
   Cookie INP1 = new Cookie("INP1", request.getParameter("name"));
   Cookie INP2 = new Cookie("INP2", request.getParameter("email"));
   
   
   // Add both the cookies in the response header.
   response.addCookie(INP1);
   response.addCookie(INP2);
   
   Cookie cookie = null;
         Cookie[] cookies = null;
         
         // Get an array of Cookies associated with the this domain
         cookies = request.getCookies();
         
         if( cookies != null ) {
            out.println("<h2> Found Cookies Name and Value</h2>");
            
            for (int i = 0; i < cookies.length; i++) {
               cookie = cookies[i];
               out.print("Name : " + cookie.getName( ) + ",  ");
               out.print("Value: " + cookie.getValue( )+" <br/>");
            }
         } else {
            out.println("<h2>No cookies founds</h2>");
         }
%>

<html>
   <head>
      <title>Setting Cookies</title>
   </head>

   <form name="f1" ACTION="cookie2.jsp">
   <input type="submit" value ="cookie"/>
   <form>
   
   </body>
</html>