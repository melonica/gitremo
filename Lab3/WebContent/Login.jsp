<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	String error = (String)request.getAttribute("ErrorMessage");
if(error != null)
{
	out.print("<div style='color: red'>"+error+"<div>");
}
%>
<form action="checklogin.do" method="post"> 
	<label> Username </label>
	<input type="text" name="username"><br>
	<label> Password </label>
	<input type="password" name="password"><br>
	<input type="submit" value="Login">
</form>
</body>
</html>