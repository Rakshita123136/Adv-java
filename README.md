### 🚀 **Advanced Java Project - README** 🌟  
📚 **A comprehensive Advanced Java project** covering **Servlets, JSP, JDBC, and more**. This repository contains Java programs that demonstrate core concepts of **dynamic web development** using **Java EE technologies**.  

---

## 🌟 **Features**

### ✅ **Core Java EE Concepts**
- **Servlets:**  
   - Handling HTTP requests and responses.  
   - Session management using cookies and URL rewriting.  
   - Data transfer between servlets.  
- **JSP (JavaServer Pages):**  
   - Dynamic HTML generation.  
   - Integration with servlets.  
   - Expression Language (EL) and JSTL usage.  
- **JDBC (Java Database Connectivity):**  
   - Database connection and CRUD operations.  
   - Data persistence with MySQL.  

### 🔥 **Project Highlights**
- **MVC Architecture:**  
   - Separation of concerns with **Model-View-Controller** structure.  
- **Database Integration:**  
   - MySQL database with JDBC.  
   - Performing CRUD operations.  
- **Form Handling:**  
   - Handling form data with servlets and JSP.  
- **Session Management:**  
   - Managing user sessions securely.  

---

## 🛠️ **Tech Stack**
- **Programming Language:** Java  
- **Backend:** Servlets, JSP, JDBC  
- **Database:** MySQL  
- **IDE:** Eclipse/IntelliJ  
- **Web Server:** Apache Tomcat  

---

## 📚 **Project Structure**
```css
📂 advjava/src  
 ┣ 📂 cookies                 → Servlet for managing cookies.  
 ┃ ┣ Servlet1.java            → First servlet handling POST requests.  
 ┃ ┗ Servlet2.java            → Second servlet displaying cookie data.  
 ┣ 📂 database                → JDBC connection and CRUD operations.  
 ┃ ┣ DBConnection.java        → Database connection class.  
 ┃ ┣ InsertDataServlet.java   → Servlet for inserting data.  
 ┃ ┗ DisplayDataServlet.java  → Servlet for displaying data.  
 ┣ 📂 jsp                     → JSP files for dynamic content rendering.  
 ┃ ┣ login.jsp                → JSP for login form.  
 ┃ ┣ register.jsp             → JSP for user registration.  
 ┃ ┗ dashboard.jsp            → User dashboard with dynamic content.  
 ┣ 📂 web-inf                  → Web configuration files.  
 ┃ ┗ web.xml                  → Servlet mapping and configuration.  
 ┗ index.html                  → Landing page with form.  
```

---

## 🚀 **Getting Started**

### 🔥 **Prerequisites**
- Install **JDK 17+**  
- Install **Eclipse/IntelliJ**  
- Install **Apache Tomcat 10+**  
- Install **MySQL Server**  

### ✅ **Setup Instructions**

1. **Clone the repository:**
```bash
git clone https://github.com/Rakshita123136/Adv-java.git
cd Adv-java
```

2. **Import the project into Eclipse/IntelliJ:**
- Open your IDE → `File` → `Import` → `Existing Maven/Java Project`.  
- Select the `advjava/src` folder.  
- Click **Finish**.  

3. **Configure Tomcat Server:**
- Go to **Server** tab → `Add new server`.  
- Select **Apache Tomcat**.  
- Set the **Tomcat installation directory**.  
- Click **Finish**.  

4. **Configure MySQL Database:**
- Start MySQL Server.  
- Create a new database:  
```sql
CREATE DATABASE advjava;
USE advjava;
```
- Import sample data if provided.  

5. **Deploy the Project:**
- Run the project on **Tomcat Server**.  
- Access the app at:  
```
http://localhost:8080/advjava
```

---

## 🔥 **Database Configuration**

### ✅ **Database Schema**
```sql
CREATE DATABASE advjava;

USE advjava;

CREATE TABLE users (
    id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50) NOT NULL,
    email VARCHAR(100) NOT NULL,
    password VARCHAR(255) NOT NULL
);
```

### ✅ **Sample Data**
```sql
INSERT INTO users (username, email, password) VALUES  
('John Doe', 'john.doe@gmail.com', 'password123'),  
('Jane Smith', 'jane.smith@gmail.com', 'securepass');  
```

---

## ⚙️ **Dependencies**
Make sure you have the following dependencies in your `pom.xml` or classpath:  
```xml
<dependencies>
    <dependency>
        <groupId>javax.servlet</groupId>
        <artifactId>javax.servlet-api</artifactId>
        <version>4.0.1</version>
        <scope>provided</scope>
    </dependency>
    <dependency>
        <groupId>mysql</groupId>
        <artifactId>mysql-connector-java</artifactId>
        <version>8.0.29</version>
    </dependency>
</dependencies>
```

---

## 🚀 **Troubleshooting**

✅ **Common Issues:**  
- 🔥 *Tomcat server not starting:*  
   → Verify the server port (default: `8080`).  
- ⚠️ *Database connection errors:*  
   → Ensure MySQL server is running and the connection details are correct.  
- ❗ *404 error on servlet:*  
   → Check servlet mappings in `web.xml`.  

---

## 🌟 **Author**
👩‍💻 **[Jyotika Uppar](https://github.com/Rakshita123136)**  
📧 [jayauppar2@gmail.com](mailto:jayauppar2@gmail.com)  
🔗 [LinkedIn](https://www.linkedin.com/in/your-profile)  
🐦 [Twitter](https://twitter.com/rakshh__)

---

## ⭐ **Show Your Support**
✅ If you like this project, consider **starring the repository**.  
🔥 **[Star the Project](https://github.com/Rakshita123136/Adv-java)**  
✨ Feel free to **fork and contribute**!  

---

## 🛠️ **License**
This project is licensed under the **MIT License**.  

---

✅ **Enjoy exploring Advanced Java concepts! 🚀**  
🔥 **Happy Coding! 💻**
