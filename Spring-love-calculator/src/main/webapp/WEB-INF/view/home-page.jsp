<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Homepage</title>
<style type="text/css">
.error {
	color: red;
	position: fixed;
	text-align: left;
	margin-left: 30px;
}
</style>

<script type="text/javascript">
	function validateUserName() {
		var userName = document.getElementById("yr").value;
		if (userName.length < 1) {
			alert("Your name should have at least one characters")
			return false;
		} else {
			return true;
		}

	}
</script>
</head>
<body>

	<h1 align="center">Love Calculator</h1>
	<hr />
	<form:form action="process-homepage" method="get"
		modelAttribute="userInfo"
		onsubmit="return validateUserName()">
		<div align="center">
			<p>
				<label for="yr">Your Name :</label>
				<form:input id="yr" path="userName" />
				<form:errors path="userName" cssClass="error"></form:errors>
			</p>

			<p>
				<label for="cr">Crush Name :</label>
				<form:input id="cr" path="crushName" />
				<form:errors path="crushName" cssClass="error"></form:errors>
			</p>
			<p>
			<form:checkbox path="termAndCondition" id="check"/>
			<label>I am agree that this is for validate</label>
			<form:errors path="termAndCondition" cssClass="error"></form:errors>
			</p>

			<input type="submit" value="Calculate">
		</div>
	</form:form>

</body>
</html>