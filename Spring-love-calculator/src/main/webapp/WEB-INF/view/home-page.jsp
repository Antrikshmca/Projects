<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Homepage</title>
</head>
<body>

	<h1 align="center">Love Calculator</h1>
	<hr/>
	<form:form action="process-homepage" method="get" modelAttribute="userInfo">
	<div align="center">
		<p>
			<label for="yr">Your Name :</label> 
			<form:input  id="yr" path="userName"/>
		</p>

		<p>
			<label for="cr">Crush Name :</label>
			 <form:input  id="cr" path="crushName"/>
		</p>

		<input type="submit" value="Calculate">
	</div>
	</form:form>

</body>
</html>