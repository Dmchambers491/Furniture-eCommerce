<%@ include file="header.jsp"%>

<body>
	<div class="container">
	<br>
	<br>
		<h1>Register Customer</h1>
		<h3>Please fill in your information below:</h3>
		<br>
		<form action="login.jsp" method="post">
			<h2>Basic Info:</h2>
			<label for="name">Name:</label><br>
			<input type="text" id="name" name="name" placeholder="Enter Name" class="stretch" required/>
			<label for="email">Email:</label><br>
			<input type="email" id="email" name="email" placeholder="Enter Email" class="stretch"/>
			<label for="phone">Phone:</label><br>
			<input type="text" id="phone" name="phone" placeholder="Enter Phone Number" class="stretch"/>
			<label for="username">User:</label><br>
			<input type="text" id="username" name="username" placeholder="Username" class="stretch" required/>
			<label for="password">Password:</label><br>
			<input type="password" id="password" name="password" placeholder="Password" class="stretch" required/>
			<br>
			<br>
			<h2>Billing Address:</h2>
			<label for="street">Street Name:</label><br>
			<input type="text" id="street" name="street" placeholder="Enter Street Address" class="stretch" required/>
			<label for="apartment">Apartment Number:</label><br>
			<input type="number" id="apartment" name="apartment" placeholder="Enter Apartment Number" class="stretch"/>
			<label for="city">City:</label><br>
			<input type="text" id="city" name="city" placeholder="Enter City" class="stretch" required/>
			<label for="state">State:</label><br>
			<input type="text" id="state" name="state" placeholder="Enter State" class="stretch" required/>
			<br>
			<br>
			<button type="submit">Register</button>
		</form>
	</div>
</body>
</html>