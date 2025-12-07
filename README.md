# Employee Management Backend (Spring Boot + MySQL)

This is a simple **Spring Boot Backend Project** that performs **CRUD operations** (Create, Read, Update, Delete) on employee data.  
It uses **Spring Boot**, **JDBC**, and **MySQL Workbench** as the database, and all APIs were tested using **Postman**.

---

## Features

- Add new employees (POST)
- Get all employees (GET)
- Get employee by ID (GET)
- Update existing employee (PUT)
- Delete employee by ID (DELETE)
- Connected to MySQL database using JDBC
- Tested using Postman
- Simple backend project for learning CRUD operations

---

## 🛠️ Tech Stack

- **Java**
- **Spring Boot**
- **Spring Web**
- **JDBC**
- **MySQL Workbench**
- **Postman**

---

## 📁 Project Structure
src/main/java/com/example/backendproject
│── Controller
│── Service
│── Repository
│── Model
│── BackendProjectApplication.java


---

##  Setup Instructions (Run This Backend Locally)

### 1. Clone the Repository
```bash
git clone https://github.com/Sweety2324/backend-project.git
```
2. Open in any IDE
* IntelliJ IDEA
* Eclipse
* VS Code (with Java extensions)

3. Configure MySQL Database
   
**Create a database:**
CREATE DATABASE employee_db;

**Update your application.properties:**
spring.datasource.url=jdbc:mysql://localhost:3306/employee_db
spring.datasource.username=YOUR_USERNAME
spring.datasource.password=YOUR_PASSWORD
spring.jpa.hibernate.ddl-auto=update


4. Run the Project
**Run the Spring Boot application:**
* Using IDE: click Run
* Or using command:
   mvn spring-boot:run

⭐ Author
Sweety Mandal
This is my first Spring Boot backend project — built while learning CRUD operations using YouTube & documentation.
