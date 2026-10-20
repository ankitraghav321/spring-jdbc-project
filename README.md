# Spring JDBC Project

A Java-based application demonstrating database connectivity and CRUD (Create, Read, Update, Delete) operations using **Spring Framework and Spring JDBC**.

## 🚀 Overview

This project demonstrate how to integrate  Java application with a relational database using Spring JDBC. It uses Spring's `JdbcTemplate` to simplify SQL query execution, database interactions, and exception handling.


## 🛠️ Technologies Used

- **Java** – Core application development
- **Spring Framework** – Dependency injection and application configuration
- **Spring JDBC** – Database access and SQL execution using `JdbcTemplate`
- **JDBC** – Java database connectivity
- **Maven** – Dependency management and build automation
- **Relational Database** – The database configured in the project

## ✨ Features

- Establishes database connectivity using Spring JDBC.
- Performs CRUD operations on database records.
- Executes SQL queries using `JdbcTemplate`.
- Uses Spring dependency injection for managing application components.
- Handles database operations and exceptions.
- Separates application logic from database access logic.

## 📂 Project Structure

```text
spring-jdbc-project/
├── src/
│   └── main/
│       ├── java/
│       │   └── ... 
│       └── resources/
│           └── application.properties
├── pom.xml
└── README.md
```

*Note: The structure above is a general example. Update it to match your actual project.*

## ⚙️ Prerequisites

Before running the application, ensure you have:

- Java Development Kit (JDK)
- Apache Maven
- A supported relational database
- An IDE such as IntelliJ IDEA or Eclipse

## ▶️ Getting Started

### 1. Clone the repository

```bash
git clone https://github.com/ankitraghav321/spring-jdbc-project.git
```

### 2. Open the project

Import the project into your preferred IDE as a Maven project.

### 3. Configure the database

Update your database connection properties in `application.properties` or the configuration file used by your project.

Example:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/your_database
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
```

Replace the example values with your own database configuration. Do not commit actual credentials to GitHub.

### 4. Build the project

```bash
mvn clean install
```

### 5. Run the application

Run the application's main class from your IDE or use the appropriate command for your project.

For a Spring Boot application:

```bash
mvn spring-boot:run
```

## 📚 Key Learnings

- Understanding Spring JDBC and `JdbcTemplate`.
- Configuring database connectivity in Java applications.
- Executing SQL statements through Spring.
- Implementing CRUD operations.
- Applying dependency injection and separation of concerns.
- Managing project dependencies using Maven.

## 🔮 Future Improvements

- Add input validation and improved exception handling.
- Implement a service layer and REST APIs.
- Add unit and integration tests.
- Introduce transaction management.
- Extend the application with Spring Boot features.

## 👨‍💻 Author

**Ankit Raghav**

GitHub: [ankitraghav321](https://github.com/ankitraghav321)
