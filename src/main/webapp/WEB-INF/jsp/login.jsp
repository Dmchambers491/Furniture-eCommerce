<%@ include file="header.jsp"%>
<!-- Below tags needed to create Spring form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<body>
	<div class="container">
	<br>
		<h1>Login with Username and Password</h1>
		<form:form action="/loginProcess" modelAttribute="login" method="post">
		    <form:label for="uname" path="username"><b>User:</b></form:label><br>
		    <form:input type="text" path="username" placeholder="Enter Username" name="uname" class="stretch" required="required"/><br><br>
		
		    <form:label for="psw" path="password"><b>Password:</b></form:label><br>
		    <form:input type="password" path="password" placeholder="Enter Password" name="psw" class="stretch" required="required"/><br><br>
		
		    <form:button type="submit" id="login" name="login">Login</form:button>
		</form:form>
	</div>
</body>
</html>