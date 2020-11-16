<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Furniture Store</title>

<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" 
	integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk"
	crossorigin="anonymous">
	
<style>
	.searchbar {
		float: right;
	}
</style>
</head>
<body>
	<div class="container">
		<div class="jumbotron jumbotron-fluid">
			<div class="container">
				<h1 class="display-4">Cart</h1>
				<p class="lead">All the selected products in your shopping cart</p>
			</div>
		</div>
		<div>
			<button type="button" class="btn btn-danger">Clear Cart</button>
			<button type="button" class="btn btn-success searchbar">Check out</button>
		</div>
		<br>
		<table class="table table-hover">
		  <thead>
		    <tr>
		      <th scope="col">Product</th>
		      <th scope="col">Unit price</th>
		      <th scope="col">Quantity</th>
		      <th scope="col">Price</th>
		      <th scope="col">Action</th>
		    </tr>
		  </thead>
		  <tbody>
		  
		  </tbody>
		</table>
		<hr>
		<h6>Grand Total</h6>
		<br>
		<button type="button" class="btn btn-light">Continue Shopping</button>
	</div>
</body>
</html>