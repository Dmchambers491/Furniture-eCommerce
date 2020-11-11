<%@ include file="header.jsp"%>

<body>
	<div class="container">
	<br>
		<h1>Login with Username and Password</h1>
		<form action="loggedin.jsp" method="post">
		    <label for="uname"><b>User:</b></label><br>
		    <input type="text" placeholder="Enter Username" name="uname" class="stretch" required><br><br>
		
		    <label for="psw"><b>Password:</b></label><br>
		    <input type="password" placeholder="Enter Password" name="psw" class="stretch" required><br><br>
		
		    <button type="submit">Login</button>
		</form>
	</div>
</body>
</html>