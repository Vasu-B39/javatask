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
	margin: flex;
	font-family: Arial, Helvetica, sans-serif;
	background: green;
	
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
<style>
        body {
            font-family: Arial, Helvetica, sans-serif;
            background-color: white; 
        }

        .container {
            max-width: 400px;
            margin: flex;
            padding: 20px;
            background: #48A645;
            text-align: center;
            border-radius: 5px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }

        .container h2 {
            margin-bottom: 20px;
        }
        
         .container label {
            display: block;
            text-align: left;
            margin: 10px 0;
        }

        .container input[type="text"],
        .container input[type="password"] 
        .container input[type="type"]
        .container input[type="number"]{
            width: 100%;
            padding: 10px;
            margin: 6px 0;
            border: 1px solid black;
            border-radius: 3px;
        }
        .container input[type="description"]{
        border: 1px solid black;
          padding-top: 70px;
          padding-right: 30px;
          padding-bottom: 70px;
           padding-left: 80px;
  }

        .container input[type="submit"] {
            background: #333;
            color: #fff;
            border: none;
            padding: 10px 20px;
            border-radius: 5px;
            cursor: pointer;
        }
        
        .container input[type="submit"]:hover {
            background: #555;
        }
        .button-link:hover {
            background-color: #0056b3; 
            border-color: #0056b3;
             background: #333;
            color: #fff;
            padding: 10px 20px;
            border-radius: 5px;
            cursor: pointer;
    </style>
    <script type="text/javascript">
    	function validateStringInput(input value){
    		return.inputValue.trim().length>3;
    	}
    	
    	function validateTypeSelectInput(input value){
    		return.inputValue !=="-select-";
    	}
    	
    	function validateQuantityNumberInput(input value){
    		return.inputValue => 0;
    	}
    	
    	function validatePriceInputValue(input value){
    		
    	}
    	
    </script>
</head>

<body>
<nav>
			<div class="topnav" align="center">
				<a class="active" href="Home.jsp">Home</a> 
	-*			<a href="#news">News</a>
				<a href="#contact">Contact</a> 
				<a href="#about">About</a>
			</div>
		<div class="container">
			<form action="cart" method="post" class="design">
   			 <div>
    			    <span style="color:red;">${error}</span>
  			  </div>
    
        <label for="name">Name</label>
        <input type="text" id="name" placeholder="Name" name="name" >
    
        <label for="type">Type</label>
        <select type="type" id="type" name="type">
            <option value="">Select</option>
            <option value="Grocery">Shirt</option>
            <option value="Snacks">Shoes</option>
            <option value="Snacks">Bags</option>
            <option value="Electronic">Electronic</option>
        </select>
    
        <label for="price">Price</label>
        <input type="text" id="price" placeholder="Price" name="price" >
    
        <label for="brand">Brand</label>
        <input type="text" id="brand" placeholder="Brand" name="brand" >
    
        <label for="quantity">Quantity</label>
        <input type="number"  id="quantity" placeholder="Quantity" name="quantity" min="1" max="50">
    
        <label for="description">Description</label>
        <input type="description" id="description"  name="description" min="3" max"50">
   		<br></br>
        <input type="submit" value="Submit">
     </div>
</form>
</nav>			
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" 
integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
 crossorigin="anonymous"></script>			
</body>

</html>