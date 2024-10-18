<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script
	src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="resources/login.css">

<title>Login</title>
</head>
<body>
	<!-- to prevent access before login and to prevent going back after logout-->
	<%
	response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate");
	response.setHeader("Pragma", "no-cache");
	response.setHeader("Expires", "0");
	%>
	
<div id="login" >
	<div class = "container " id="child">
						<form action="Login" method="post">
							<div>
								<h3>Login</h3>
								<hr>
							</div>

							<div class="form-group row justify-content-center">
								<label for="username" class="col-sm-2 col-form-label" style="margin-left:300px" >Username:</label>
								<div class="col-sm-6">
									<input type="text" name="uname" id="uname"
									class="form-control col-6" minlength="5" maxlength="50"
									pattern="[A-Za-z0-9]{5,}"
									title="No Spaces and Special Characters Allowed, 5-50 characters only" required>
								</div>
							</div>

							<div class="form-group row justify-content-center">
								<label for="password" class="col-sm-2 col-form-label" style="margin-left:300px">Password:</label>
								<div class="col-sm-6">
									<input type="password" name="pass" id="pass"
									class="form-control col-6" minlength="5" maxlength="50"
									pattern="[A-Za-z0-9]{5,}"
									title="No Spaces and Special Characters Allowed, Min 5 characters only" required>
								</div>
							</div>

							<hr>

							<div class="form-group col-12 mt-4 text-center">
								<input type="submit" class="btn btn-outline-success "
									value="Login">
							</div>


						</form>
					</div>
				</div>



</body>
</html>