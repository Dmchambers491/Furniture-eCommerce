<%@ include file="header.jsp"%>

<body>
	<div class="container">
	<br>
	<br>
		<h1>All Products</h1>
		<h4>Checkout all the awesome products available now!</h4>
		<br>
		<hr>
		<p>Show
		 <select name="show" id="show">
		    <option value="1">1</option>
		    <option value="2">2</option>
		    <option value="3">3</option>
		    <option value="4">4</option>
		    <option value="5">5</option>
  		</select>
  		Entries
  		<input type="text" name="search" class="searchbar"/>
  		<label for="search" class="searchbar">Search:</label>
		</p>
		<table class="table table-hover">
		  <thead>
		    <tr class="table-success">
		      <th scope="col">Proto Thumb</th>
		      <th scope="col">Product Name</th>
		      <th scope="col">Category</th>
		      <th scope="col">Condition</th>
		      <th scope="col">Price</th>
		      <th scope="col"></th>
		    </tr>
		  </thead>
		  <tbody>
		  </tbody>
		</table>
		<hr>
	</div>
</body>
</html>