# Employee Tracker 🧑‍💼

A full-stack Employee Management application built with **Spring Boot**, **Hibernate**, **Spring Data JPA**, **MySQL**, and **Maven**.

This application allows users to perform basic CRUD (Create, Read, Update, Delete) operations on employee records.

---

## 🚀 Features

- ✅ Add new employees
- 🔍 View a list of all employees
- ✏️ Update employee details
- 🗑️ Delete an employee
- 🌐 RESTful API with JSON responses

---

## 🛠 Tech Stack

| Layer             | Technology               |
|------------------|--------------------------|
| Backend          | Spring Boot              |
| ORM              | Hibernate, Spring Data JPA |
| Database         | MySQL                    |
| Build Tool       | Maven                    |
| API Style        | RESTful APIs             |

---

## ⚙️ Configuration

Update your `application.properties` with your local database settings:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/employee_db
spring.datasource.username=root
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
server.port=8080
---

