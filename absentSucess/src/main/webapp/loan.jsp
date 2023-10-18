<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<title>X-Workz Bank</title>
<style>
 body {
            font-family: Arial, sans-serif;
            align-items: center;
        }
 .container {
            max-width: 400px;
            margin: 0 auto;
            padding: 20px;
            border: 1px solid #ccc;
            border-radius: 5px;
        }
        .form-group {
            margin-bottom: 15px;
        }
        label {
            font-weight: bold;
            display: block;
        }
        input[type="text"],
        input[type="enum"],
        select {
            width: 25%;
            padding: 10px;
            border: 1px solid #ccc;
            border-radius: 3px;
            background-color: light blue;
        }
        .checkbox-group {
            display: flex;
            align-items: center;
        }
        input[type="checkbox"] {
            margin-right: 5px;
        }
        button {
            background-color: #007bff;
            color: #fff;
            border: none;
            padding: 10px 20px;
            border-radius: 3px;
            cursor: pointer;
        }
        button:hover {
            background-color: #0056b3;
        }
</style>
</head>

<body>
<h1 align="center">X-Workz Bank</h1>
<form action="loan" method="post">
            <div class="form-group">
                <label for="name">Name:</label>
                <input type="text" id="name" name="name">
            </div>
            <div class="form-group">
                <label for="Amount">Amount:</label>
                <input type="enum" min="10000"  max="99999999999" id="amount" name="amount">
            </div>
            <div class="form-group">
                <label for="Working">Working:</label>
                <input type="text" id="working" name="working">
            </div>
             <div class="form-group">
                <label for="Interest">Interest:</label>
                <input type="enum" min="3"  max="99" id="interest" name="interest">
            </div>
            <div class="form-group">
                <label for="Shurity">Shurity:</label>
                <input type="text" id="shurity" name="shurity">
            </div>
             <div class="form-group">
                <label for="Company">Company:</label>
                <input type="text" id="company" name="company">
            </div>
             <div class="form-group">
                <label for="LoanTenure">Loan Tenure:</label>
                <input type="enum" min="1"  max="99" id="loanTenure" name="loanTenure">
            </div>
              <div class="form-group">
                <label for="LoanType">Loan Type:</label>
               
                <select name="loanType" id="loanType">
                  <option value="volvo">Home loan</option>
                    <option value="saab">Gold Loan</option>
                   <option value="mercedes">Land loan</option>
  					<option value="audi">Car loan</option>
                </select>
            </div>
              <div class="checkbox-group">
                <input type="checkbox" id="terms" name="terms" required>
                <label for="terms">I accept the <a href="#">Terms and Conditions</a></label>
               
            </div>
            <button type="submit">Submit</button>
            
             
                
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" 
integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
 crossorigin="anonymous"></script>
</body>
</html>