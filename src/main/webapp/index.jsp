<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Welcome</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f9f9f9;
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            flex-direction: column;
            text-align: center;
        }

        h2 {
            color: #333;
            font-size: 36px;
            margin-bottom: 20px;
        }

        a {
            display: inline-block;
            padding: 10px 20px;
            margin: 10px;
            font-size: 16px;
            text-decoration: none;
            background-color: #4CAF50;
            color: white;
            border-radius: 5px;
            transition: background-color 0.3s ease;
        }

        a:hover {
            background-color: #45a049;
        }

        a:active {
            background-color: #388e3c;
        }

        /* Responsive Styles */
        @media (max-width: 600px) {
            h2 {
                font-size: 28px;
            }

            a {
                font-size: 14px;
                padding: 8px 16px;
            }
        }
    </style>
</head>
<body>

    <h2>Welcome to NEXTIN!</h2>

    <div>
        <a href="login.jsp">Login</a>
        <br>
        <a href="signup.jsp">Sign Up</a>
    </div>

</body>
</html>
