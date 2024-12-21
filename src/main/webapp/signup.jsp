<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Sign Up</title>
<!-- Responsive Meta Tag -->
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<!-- Add Basic CSS Styling -->
<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f4f4f4;
        margin: 0;
        padding: 0;
        display: flex;
        justify-content: center;
        align-items: center;
        height: 100vh;
    }

    .container {
        background-color: white;
        padding: 30px;
        border-radius: 8px;
        box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
        width: 100%;
        max-width: 400px;
    }

    h3 {
        text-align: center;
        color: #333;
    }

    label {
        font-weight: bold;
        display: block;
        margin-top: 10px;
    }

    input[type="text"],
    input[type="email"],
    input[type="tel"],
    input[type="password"] {
        width: 100%;
        padding: 10px;
        margin: 5px 0 15px;
        border: 1px solid #ccc;
        border-radius: 4px;
    }

    input[type="submit"] {
        width: 100%;
        padding: 10px;
        background-color: #4CAF50;
        color: white;
        border: none;
        border-radius: 4px;
        cursor: pointer;
        font-size: 16px;
    }

    input[type="submit"]:hover {
        background-color: #45a049;
    }
</style>
</head>
<body>

<div class="container">
    <h3>Sign Up</h3>
    <form action="SignUp" method="post">
    
        <label for="userName">Full Name</label>
        <input type="text" id="userName" name="userName" placeholder="Enter your full name" required>


        <label for="userEmail">Email Address</label>
        <input type="email" id="userEmail" name="userEmail" placeholder="Enter your email"
        	required pattern="^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$" 
        	title="Please enter a valid email address.">


        <label for="userPhoneNumber">Phone Number</label>
        <input type="tel" id="userPhoneNumber" name="userPhoneNumber" placeholder="Enter your phone number" 
        	required pattern="^\+?[1-9]\d{1,14}$" 
        	title="Please enter a valid phone number with optional country code (e.g., +1234567890).">


        <label for="userPassword">Password</label>
        <input type="password" id="userPassword" name="userPassword" 
        	placeholder="Enter your password" required minlength="8" 
        	title="Password must be at least 8 characters long.">

        <input type="submit" value="Sign Up">
    </form>
</div>

</body>
</html>
