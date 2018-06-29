<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome page</title>
</head>
<body>
	<h1>Hi IPD12!</h1>
	<a href="one"> This is one</a>
	<br />
	<a href="two"> This is two</a>
	<br />
	<a href="TestServlet"> This is IPD</a>
	
	<form action="test.jsp" method="post">
		USERNAME:<input type="text" name="username" /> PASSWORD:<input
			type="text" name="password" />

		<button type="submit">Submit to test</button>

	</form>
	<br />
	<br />
	<form action="one" method="post">
		USERNAME:<input type="text" name="username" /> PASSWORD:<input
			type="text" name="password" />

		<button type="submit">Submit to servlet</button>

	</form>
	
	<br />
	<br />
	<form action="std" method="get">
		NAME:<input type="text" name="name" /> 
		ID:<input
			type="text" name="id" />

		<button type="submit">Submit to servlet</button>

	</form>
	
	<%-- 	<% out.println("Hi"); %> --%>
	<%-- 	<%!int val=50; String dd = "Hello"; %><%!String dd2 = "Hello";  %> --%>

	<%-- 	<%="Value of the variable = " + val + dd %> --%>
	<%-- 	<%= 4/2  %> --%>
</body>
</html>