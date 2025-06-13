<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>User Form</title>
</head>
<body>
    <h2>${welcome}</h2>
    <form action="display" method="post">
        <!-- Name Field -->
        <label for="name">Name:</label>
        <input type="text" id="name" name="name" required><br><br>

        <!-- Age Field -->
        <label for="age">Age:</label>
        <input type="number" id="age" name="age" required><br><br>

        <!-- Gender Radio Buttons -->
        <label>Gender:</label>
        <input type="radio" id="male" name="gender" value="Male" required>
        <label for="male">Male</label>
        <input type="radio" id="female" name="gender" value="Female">
        <label for="female">Female</label>
        <input type="radio" id="other" name="gender" value="Other">
        <label for="other">Other</label><br><br>

        <!-- Courses Dropdown -->
        <label for="course">Course:</label>
        <select id="course" name="course" required>
            <option value="">--Select--</option>
            <option value=""></option>
            <option value=""></option>
            <option value=""></option>
            <option value=""></option>
        </select><br><br>

        <!-- Display Button -->
        <button type="submit">Display</button>
    </form>
</body>
</html>