<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>Furniture Store</title>

<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" 
	integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk"
	crossorigin="anonymous">

<style>
	.stretch {
		width: 100%;
	}
	
	.navicon {
		color: rgba(255,255,255,.5);
		margin-right: 20px;
	}
	
	.searchbar {
		float: right;
	}
	
	.checkout {
		margin-left: 250px;
	}
</style>
</head>
<body>
	<div class="container">
		<header>
			<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
				<button class="navbar-toggler" type="button" data-toggle="collapse"
					data-target="#navbarNav" aria-controls="navbarNav"
					aria-expanded="false" aria-label="Toggle navigation">
					<span class="navbar-toggler-icon"></span>
				</button>
				<h5 class="nav-item"><a class="navicon" href="index.jsp">Furniture Hub</a></h5>
				<div class="collapse navbar-collapse" id="navbarNav">
					<ul class="navbar-nav">
						<li class="nav-item"><a class="nav-link" href="index">Home</a></li>
						<li class="nav-item"><a class="nav-link" href="products.jsp">Products</a></li>
						<li class="nav-item"><a class="nav-link" href="about.jsp">About Us</a></li>
						<li class="nav-item"><a class="nav-link" href="contact.jsp">Contact Us</a></li>
					</ul>
				</div>
				<div class="collapse navbar-collapse" id="navbarNav">
					<ul class="navbar-nav">
						<li class="nav-item"><a class="nav-link" href="admin.jsp">Admin</a></li>
						<li class="nav-item"><a class="nav-link" href="login">Login</a></li>
						<li class="nav-item"><a class="nav-link" href="register.jsp">Register</a></li>
					</ul>
				</div>
			</nav>
		</header>
	</div>