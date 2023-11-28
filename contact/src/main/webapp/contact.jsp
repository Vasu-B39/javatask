<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Provide Contact Informations</title>
<style type="text/css">
	body{
	background-color: white;
	    border-style: solid;
	 	border-width: 5px;
	 	
	}

	body.container{
	 	
	}
	div {
		align: centere;
	margin-top: 20px;
	margin-bottom: 20px;
	margin-right: 250px;
	margin-left: 80px;
	}
</style>
</head>
<body>
<form action="contact" method="post" function=return validationFunction()>
<h2>Provide Contact Informations</h2>
	<div>
   	  <label for="name">Name:</label>
		<input type="text" name="name" id="name"/>
   </div>
   <div>
   		<label for="email">Email:</label>
   		<input type="email" name="email" id="email"/>
   </div>
   <div>
   		<label for="mobile">Mobile No:</label>
   		<input type="number" name="mobile" id="mobile"/>
   </div>
   <div>
   		<label for="cmt">Comment:</label>
   		<textarea id="cmt" name="cmt" rows="4" cols="50">Enter text here</textarea>
   </div>
   <div>
   		<button>Submit</button>
   </div>
</form>
</body>
<script type="text/javascript">
	function validationFunction(){
		var mobile = document.getElementById("mobile").value;
		if(mobile)
	}

</script>
</html>