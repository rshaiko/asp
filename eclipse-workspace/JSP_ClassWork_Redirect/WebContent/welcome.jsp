<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome user</title>
</head>
<body>
	<h1>Please enter login information</h1>
	<form action="one" method="post">
		<table>
			<tr>
				<td>Username</td>
				<td><input type="text" name="username" /></td>
				<td>Password</td>
				<td><input type="password" name="password" /></td>

			</tr>
		</table>
		<button type="submit">Login</button>
	</form>
</body>
</html>