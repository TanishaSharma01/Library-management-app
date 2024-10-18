<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Wrong Credentials</title>
</head>
<style>
	h3{
	  margin-top: 120px;
	  text-align: center;
	  color: #FF0000;
	}
	form{
	  text-align: center;
	}
</style>
<body>
<div>
    <h3>Wrong credentials entered</h3>
	<form method="post" action="login.jsp">
		<input type="submit" class="btn btn-outline-success" value="Go Back to Login Page">
	</form>
</div>
</body>
</html>