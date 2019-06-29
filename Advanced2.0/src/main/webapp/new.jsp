<html>
<body>

<%
	String nam=application.getInitParameter("image");
	String name = request.getParameter("name");
	String pass = request.getParameter("password" );
	if(name.equals("BRAYAN")&&pass.equals("ABRAHAM"))
	{
		out.println("LOGGED IN " + nam);
	}
	else
	{
		out.println("INVALID");
	}
	%>
</body>
</html>