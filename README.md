# JSP-CrudMate👨‍💻👩‍💻

_A friendly project demonstrating CRUD with JSP and Spring MVC_
<br><br>

## 📝 Overview

**JSP-CrudMate** is a simple and well-structured demo web application built using **Spring Boot**, **Spring MVC**, **JSP**, and **PostgreSQL**. It focuses on implementing **CRUD (Create, Read, Update, Delete)** operations in a clean and educational manner for beginners and intermediate Java developers.

This project serves as a practical guide for understanding the full workflow of a server-rendered web application using Java technologies.
<br>


## ⚙️ Technologies Used

- **Java 17+**
- **Spring Boot**
- **Spring MVC**
- **JSP (JavaServer Pages)**
- **JDBC/Hibernate**
- **PostgreSQL**
- **HTML5/CSS3**

<br>

## 🚀 Features

- 🔹 Create a new record (User/Product/Entity)
- 🔹 Retrieve and list all records
- 🔹 Update existing entries
- 🔹 Delete unwanted entries
- 🔹 Server-side rendering with JSP
- 🔹 PostgreSQL as the backend relational database
- 🔹 Organized project structure with MVC design pattern

<br>

## 📁 Project Structure



```
JSP-CrudMate/
│
├── src/
│ ├── main/
│ │ ├── java/com/example/crudmate/
│ │ │ ├── controller/
│ │ │ ├── model/
│ │ │ ├── repository/
│ │ │ └── service/
│ │ └── resources/
│ │ └── application.properties
│ └── webapp/WEB-INF/
│ └── views/ (JSP files)
│
├── pom.xml
└── README.md
```
<br>

## 🛠️ How to Run


1. **Clone the Repository**

   ```
   git clone https://github.com/yourusername/JSP-CrudMate.git
   cd JSP-CrudMate
   ```

2. **Configure Database**

-  Set your PostgreSQL DB credentials in application.properties.

   ```
   spring.datasource.url=jdbc:postgresql://localhost:5432/yourdbname
   spring.datasource.username=yourusername
   spring.datasource.password=yourpassword
   ```


3. **Run the App**

- Use your IDE (IntelliJ, Eclipse, etc.) or run:

  ```
  ./mvnw spring-boot:run
  ```

4. **Access in Browser**

   ```
   http://localhost:8080/
   ```


## ✨ Use Cases

- Educational use for Java web development.

- Reference app for MVC and JSP integration.

- Starter template for full-stack Spring Boot + JSP apps.


