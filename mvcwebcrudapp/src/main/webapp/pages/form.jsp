<!DOCTYPE html>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %> <!-- JSTL Dependency-->
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Student Registration</title>
    <style>
        body {
            margin: 0;
            height: 100vh;
            font-family: 'Segoe UI', sans-serif;
            background: linear-gradient(135deg, #f8f9fa, #e0eafc);
            display: flex;
            justify-content: center;
            align-items: center;
        }

        .form-container {
            background-color: #ffffff;
            padding: 30px 40px;
            border-radius: 10px;
            box-shadow: 0 10px 30px rgba(0, 0, 0, 0.15);
            width: 500px;
        }

        .form-container h1 {
            text-align: center;
            color: #2c3e50;
            margin-bottom: 10px;
        }

        .form-container h3 {
            text-align: center;
            color: green;
            margin-top: 0;
        }

        table {
            width: 100%;
            border-collapse: collapse;
        }

        table td {
            padding: 10px;
            vertical-align: top;
        }

        table td:first-child {
            font-weight: bold;
            color: #333;
            width: 40%;
        }

        input[type="text"],
        input[type="email"],
        select {
            width: 100%;
            padding: 8px;
            border: 1px solid #ccc;
            border-radius: 5px;
            outline: none;
        }

        input[type="radio"],
        input[type="checkbox"] {
            margin-right: 5px;
        }

        input[type="submit"] {
            background-color: #007bff;
            color: white;
            border: none;
            padding: 10px 20px;
            border-radius: 5px;
            cursor: pointer;
            font-weight: bold;
        }

        input[type="submit"]:hover {
            background-color: #0056b3;
        }

        td[colspan="2"] {
            text-align: center;
        }
    </style>
</head>
<body>

<div class="form-container">
    <h1>Student Registration Form</h1>
    <h3>${msg}</h3>

    <form:form modelAttribute="bindstudent" action="submit" method="post">
        <table>
            <tr>
                <td>ID:</td>
                <td><form:input path="sid" placeholder="Enter Student ID"/></td>
            </tr>
            <tr>
                <td>Name:</td>
                <td><form:input path="name" placeholder="Enter Full Name"/></td>
            </tr>
            <tr>
                <td>Gender:</td>
                <td>
                    <form:radiobutton path="gender" value="Male"/> Male
                    <form:radiobutton path="gender" value="Female"/> Female
                </td>
            </tr>
            <tr>
                <td>Email:</td>
                <td><form:input path="email" placeholder="Enter Email Address"/></td>
            </tr>
            <tr>
                <td>Course:</td>
                <td>
                    <form:select path="courses">
                        <form:options items="${courseslist}" />
                    </form:select>
                </td>
            </tr>
            <tr>
                <td>Timings:</td>
                <td><form:checkboxes items="${timingslist}" path="timings"/></td>
            </tr>
            <tr>
                <td colspan="2">
                    <input type="submit" value="Register"/>
                </td>
            </tr>
        </table>
    </form:form>
</div>

</body>
</html>