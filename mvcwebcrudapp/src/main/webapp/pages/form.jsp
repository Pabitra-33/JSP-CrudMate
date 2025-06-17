<!DOCTYPE html>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %> <!-- JSTL Dependency-->
<html>
<head>
    <title>Hello JSP</title>
</head>
<body>
	
	<h1>Student Registration</h1> 
	<h1>${msg}</h1>	
	<form:form modelAttribute="student" action="submit" method="post">
	    <table border="1" cellpadding="8" cellspacing="0">
	        <tr>
	            <td>ID:</td>
	            <td><form:input path="sid"/></td>
	        </tr>
	        <tr>
	            <td>Name:</td>
	            <td><form:input path="name"/></td>
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
	            <td><form:input path="email"/></td>
	        </tr>
	        <tr>
	            <td>Course:</td>
	            <td>
	                <form:select path="courses">
	                    <form:options items="${courses}" />
	                </form:select>
	            </td>
	        </tr>
	        <tr>
	            <td> Timings:</td>
	            <td>
	                <form:checkboxes items="${timings}" path="timings"/>
	            </td>
	        </tr>
	        <tr>
	            <td colspan="2" align="center">
	                <input type="submit" value="Register"/>
	            </td>
	        </tr>
	    </table>
	</form:form>
		
</body>
</html>