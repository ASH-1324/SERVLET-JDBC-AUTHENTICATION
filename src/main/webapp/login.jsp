<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Login</title>
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

    input[type="email"],
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

    .forgot-password {
        text-align: center;
        margin-top: 10px;
    }

    .forgot-password a {
        text-decoration: none;
        color: #007bff;
    }

    .forgot-password a:hover {
        text-decoration: underline;
    }
</style>
</head>
<body>

<div class="container">
    <h3>Login</h3>
    <form action="Login" method="post">
    
        <label for="userEmail">Email Address</label>
        <input type="email" id="userEmail" name="userEmail" placeholder="Enter your email" required 
        	pattern="^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$" title="Please enter a valid email address.">


        <label for="userPassword">Password</label>
        <input type="password" id="userPassword" name="userPassword" placeholder="Enter your password" required 
        	minlength="8" title="Password must be at least 8 characters long.">


        <input type="submit" value="Login">

        <div class="forgot-password">
            <p><a href="/forgot-password">Forgot Password?</a></p>
        </div>
    </form>
</div>

</body>
</html>
