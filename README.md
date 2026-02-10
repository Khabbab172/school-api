# 🎓 School API — Spring Boot REST Application

A production-style **RESTful School Management API** built using **Spring Boot**, **Spring Data JPA**, and **MySQL**.
This project demonstrates clean backend architecture, transactional updates, and REST API design following industry practices.

---

## 🚀 Overview

The School API manages student data and exposes REST endpoints for performing CRUD operations. The application showcases:

* Layered architecture (Controller → Service → Repository)
* Database interaction using Hibernate (JPA)
* Transaction management using `@Transactional`
* Validation and business rule enforcement
* Clean and maintainable backend structure

This project is designed as a **backend foundation** for larger school or student management systems.

---

## 🛠 Tech Stack

| Technology        | Purpose                   |
| ----------------- | ------------------------- |
| Java 17           | Core programming language |
| Spring Boot       | Application framework     |
| Spring Data JPA   | ORM & database access     |
| Hibernate         | Persistence provider      |
| MySQL             | Relational database       |
| Maven             | Build tool                |
| REST API          | Communication layer       |
| Docker (Optional) | Database containerization |

---

## 🧱 Architecture

```
Controller Layer
    ↓
Service Layer (Business Logic + Transactions)
    ↓
Repository Layer (JPA / Database)
    ↓
MySQL Database
```

### Key Design Decisions

* Business logic isolated in Service layer
* Repository handles only data access
* Transactional updates ensure data consistency
* Email uniqueness enforced at service level

---

## 📁 Project Structure

```
src/main/java/com/example/demo
│
├── student
│   ├── Student.java
│   ├── StudentController.java
│   ├── StudentService.java
│   └── StudentRepository.java
│
└── DemoApplication.java
```

---

## ⚙️ Setup & Installation

### 1️⃣ Clone Repository

```bash
git clone <repo-url>
cd school-api
```

---

### 2️⃣ Create Database

```sql
CREATE DATABASE school;
```

---

### 3️⃣ Configure Application

`application.properties`

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/school
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

### 4️⃣ Run Application

```bash
mvn spring-boot:run
```

Server starts at:

```
http://localhost:8080
```

---

## 📡 API Endpoints

### Get All Students

```
GET /api/v1/student
```

---

### Create Student

```
POST /api/v1/student
```

```json
{
  "name": "John",
  "email": "john@example.com",
  "age": 20
}
```

---

### Update Student

```
PUT /api/v1/student/{studentId}
```

Example:

```bash
curl -X PUT "http://localhost:8080/api/v1/student/1?name=Khabbab&email=khabbab@example.com"
```

---

### Delete Student

```
DELETE /api/v1/student/{studentId}
```

---

## 🧠 Learning Highlights

* Hibernate entity lifecycle
* Dirty checking with `@Transactional`
* Custom repository queries
* REST API best practices
* Debugging JPA & Hibernate issues

---

## 📌 Future Enhancements

* DTO pattern implementation
* Input validation (`@Valid`)
* Global exception handling
* Swagger/OpenAPI documentation
* Authentication & Authorization (JWT)
* Pagination & filtering

---

## 👨‍💻 Author

**Khabbab Ahmed**
Backend Developer