<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Read write</title>
</head>
<body>
<%String name = request.getParameter("name");
String clas = request.getParameter("class");
String roll = request.getParameter("roll");
String email = request.getParameter("email");%>
<p> Hello <%=name %> of class <%=clas %><br/>
Email : <%=email %><br/>
Roll : <%=roll %>
</p>
</body>
</html>