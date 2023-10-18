 <!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">

<title>Green Media</title>

<style>
body {
	margin: 0;
	font-family: Arial, Helvetica, sans-serif;
	
}

.topnav {
	overflow: hidden;
	background-color: #333;
	
}

.topnav a {
	float: left;
	color: #f2f2f2;
	text-align: center;
	padding: 16px 18px;
	text-decoration: none;
	font-size: 17px;
}

.topnav a:hover {
	background-color: #ddd;
	color: black;
}

.topnav a.active {
	background-color: #04AA6D;
	color: white;
}

.search {
	float: right;
	color: blue;
	margin: top -15px;
}
</style>
</head>

<body>
<nav>
			<div class="topnav" align="center">
				<a class="active" href="Home.jsp">Home</a> 
				<a href="#news">News</a>
				<a href="#contact">Contact</a> 
				<a href="#about">About</a>
			</div>

			<div align="center">
			<h4>Name:${name}</h4>
            <h4>Type:${type}</h4>
            <h4>Price:${price}</h4>
            <h4>Brand:${brand}</h4>
           <h4>Quantity:${quantity}</h4>
           <h4>Total:<span style="color:DarkGreen;">${Total}</h4>
				
			</div>
				
			
</nav>			
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" 
integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
 crossorigin="anonymous"></script>			
</body>
</html>