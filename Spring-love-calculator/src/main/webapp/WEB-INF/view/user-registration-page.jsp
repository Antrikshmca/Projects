<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1 align=center>Please register here</h1>
	<form:form action="registreation-sucess" method="GET" modelAttribute="userReg">

		<div align="center">
			<label>User:</label>
			<form:input path="name" />
			<br /> <label>User Name :</label>
			<form:input path="userName" />
			<br> <label>Password:</label>
			<form:input path="password" />
			<br /> <label>Country:</label>
			<form:select path="countryName">
				<form:option value="Ind" label="India"></form:option>
				<form:option value="jap" label="Japan"></form:option>
				<form:option value="Nep" label="Nepal"></form:option>
				<form:option value="Sri" label="Sri_Lanka"></form:option>
			</form:select>
			<br /> <label>Hobbies:</label> Cricket:
			<form:checkbox path="hobbies" value="Cricket" />
			Reading:
			<form:checkbox path="hobbies" value="Reading" />
			Dancing:
			<form:checkbox path="hobbies" value="Dancing" />
			Programming:
			<form:checkbox path="hobbies" value="Programming" />
			Travelling:
			<form:checkbox path="hobbies" value="Travelling" />
			<br /> <label>Gender:</label> Male
			<form:radiobutton path="gender" value="Male" />
			Female
			<form:radiobutton path="gender" value="Female" />
			<br /> <input type="submit" value="register" />
		</div>
	</form:form>
</body>
</html>