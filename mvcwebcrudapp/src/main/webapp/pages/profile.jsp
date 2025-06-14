<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Profile Page</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f5f5f5;
            margin: 15rem 30rem;
            padding: 0;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }
        .welcome-message {
            color: #2c3e50;
            font-size: 30px;
            margin-bottom: 20px;
        }
        .welcome-name {
			color: #2c3e50;
			font-size: 18px;
		    margin-bottom: 15px;
		}
    </style>
</head>
<body>
    <h1 class="welcome-message">Welcome to Your Profile!</h1>
	<h4 class="welcome-name">Children name is ${childname}</h4>
</body>
</html>