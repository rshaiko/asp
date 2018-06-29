<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%! String result ="";%>
<% result = "";
		String user = request.getParameter("user");
		String pass = request.getParameter("pass");
		String user2 = request.getParameter("user2");
		String pass2 = request.getParameter("pass2");
		
		if(user.equals(user2)&&pass.equals(pass2))
			result = "Successfull : " + user + " | " + pass;
		else
			result = "Fail !!! ";%>
		
		<h1><%=result%></h1>
</body>
</html>