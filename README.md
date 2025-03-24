### 🚀 **Advanced Java Repository - README** 🌟  
📚 **Welcome to the Advanced Java repository** showcasing **Java EE technologies** such as **Servlets, JSP, JDBC, Swing**, and more. This repository contains multiple projects covering **dynamic web development, GUI applications, database connectivity, and session management**.  

---

## 🌟 **Features**

### ✅ **Java EE Concepts**
- **Servlets:**  
   - Handling HTTP requests and responses.  
   - Session management using cookies and URL rewriting.  
   - Data transfer between servlets.  
- **JSP (JavaServer Pages):**  
   - Dynamic HTML generation with Java logic.  
   - Integration with servlets.  
   - Expression Language (EL) and JSTL usage.  
- **JDBC (Java Database Connectivity):**  
   - Connecting Java applications to MySQL.  
   - CRUD operations (Create, Read, Update, Delete).  
- **Swing GUI Applications:**  
   - Graphical user interfaces with **Java Swing**.  
   - Event handling and UI components.  
   - Database integration with Swing forms.  

---

## 🛠️ **Tech Stack**
- **Programming Language:** Java  
- **Backend:** Servlets, JSP, JDBC  
- **Frontend:** Swing GUI  
- **Database:** MySQL  
- **IDE:** Eclipse / IntelliJ  
- **Web Server:** Apache Tomcat  
- **Version Control:** GitHub  

---

## 📚 **Repository Structure**
```
📂 Adv-java  
 ┣ 📂 advjava                      → Source code folder  
 ┃ ┣ 📂 src                        → Main source code  
 ┃ ┃ ┣ 📂 cookies                  → Servlet projects with cookies handling  
 ┃ ┃ ┣ 📂 database                 → JDBC connectivity and CRUD operations  
 ┃ ┃ ┣ 📂 jsp                      → JSP files for dynamic content rendering  
 ┃ ┃ ┣ 📂 servlet                  → Servlet-based projects  
 ┃ ┃ ┣ 📂 session_management       → Projects with session handling  
 ┃ ┃ ┣ 📂 swing                    → Java Swing GUI applications  
 ┃ ┃ ┣ 📂 web-inf                  → Web configuration files  
 ┃ ┗ 📂 index.html                 → Landing page  
 ┣ 📂 WebContent                   → Web pages and JSPs  
 ┣ 📂 lib                          → External libraries (JDBC drivers, etc.)  
 ┣ 📄 web.xml                      → Servlet configuration file  
 ┣ 📄 README.md                    → Project documentation  
 ┗ 📄 pom.xml                      → Maven dependencies  
```

---

## 🚀 **Getting Started**

### 🔥 **Prerequisites**
- Install **JDK 17+**  
- Install **Eclipse**  
- Install **Apache Tomcat 10+**  
- Install **MySQL Server**  
- Clone the repository:  
```bash
git clone https://github.com/Rakshita123136/Adv-java.git  
cd Adv-java  
```

### ✅ **Import into IDE**
1. Open your IDE.  
2. Go to `File` → `Import` → `Existing Maven/Java Project`.  
3. Select the `Adv-java` folder.  
4. Click **Finish**.  

---

## 🔥 **Database Setup**

### ✅ **MySQL Configuration**
1. Start the MySQL server.  
2. Create a new database:  
```sql
CREATE DATABASE advjava;  
USE advjava;  
```

### ✅ **Create Tables**
```sql
CREATE TABLE users (  
    id INT AUTO_INCREMENT PRIMARY KEY,  
    username VARCHAR(50) NOT NULL,  
    email VARCHAR(100) NOT NULL,  
    password VARCHAR(255) NOT NULL  
);  
```

### ✅ **Insert Sample Data**
```sql
INSERT INTO users (username, email, password) VALUES  
('Alice', 'alice@gmail.com', 'pass123'),  
('Bob', 'bob@gmail.com', 'securepass');  
```

---

## ▶️ **Run the Project**

### ✅ **Tomcat Configuration**
1. Go to **Server** tab → `Add new server`.  
2. Select **Apache Tomcat**.  
3. Set the **Tomcat installation directory**.  
4. Click **Finish**.  

### ✅ **Deploy the Project**
- Right-click on the project → `Run As` → `Run on Server`.  
- Open the app in your browser:  
```
http://localhost:8080/Adv-java  
```

---

## ⚙️ **Key Projects in the Repository**

### 📂 **1. Servlet Projects**
- **Cookies Handling:**  
   - Uses cookies to store and retrieve session data.  
   - Demonstrates client-side session management.  
- **Session Management:**  
   - Maintains user sessions across multiple requests.  
   - Uses `HttpSession` for storing user-specific data.  

### 📂 **2. JSP Projects**
- **Dynamic Pages:**  
   - JSP for rendering dynamic HTML content.  
   - Data retrieval and display using JSP.  
- **JSP + Servlet Integration:**  
   - Combines JSP and servlets for MVC architecture.  
   - Uses JSP for presentation and servlets for logic.  

### 📂 **3. JDBC Projects**
- **Database Connectivity:**  
   - Connects Java apps with MySQL.  
   - Performs CRUD operations.  
- **CRUD Operations:**  
   - `Create`, `Read`, `Update`, and `Delete` data using JDBC.  
   - Handles SQL exceptions.  

### 📂 **4. Swing GUI Projects**
- **User Registration Form:**  
   - Swing-based GUI for user registration.  
   - Data persistence using JDBC.  
   - Includes event handling.  
- **Login Application:**  
   - GUI-based login form with username and password validation.  
   - Integration with MySQL database.  
- **Product Management System:**  
   - Swing application with CRUD functionality.  
   - Database integration for managing products.  

---

## 🔥 **Dependencies**
Make sure you have the following dependencies in your `pom.xml`:  
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

## ✅ **Usage Instructions**
1. **Servlet Execution:**  
   - Navigate to the Servlet URL in the browser:  
   ```
   http://localhost:8080/Adv-java/servlet_name  
   ```

2. **JSP Execution:**  
   - Access JSP pages via:  
   ```
   http://localhost:8080/Adv-java/jsp/page_name.jsp  
   ```

3. **Swing Execution:**  
   - Run the Swing application directly from your IDE.  
   - Select the `main()` method and execute the program.  

---

## 🚀 **Troubleshooting**

✅ **Common Issues:**  
- 🔥 *Tomcat server not starting:*  
   → Check server logs and verify port configurations.  
- ⚠️ *Database connection errors:*  
   → Verify the MySQL server is running and the connection details are correct.  
- ❗ *404 error on servlet:*  
   → Check servlet mappings in `web.xml`.  
- 🛠️ *Swing UI issues:*  
   → Ensure correct event handling for GUI interactions.  

---

## 🌟 **Contributing**
✅ Contributions are welcome!  
If you'd like to contribute:  
1. **Fork the repository.**  
2. Create a new branch:  
```bash
git checkout -b feature-name  
```
3. Commit your changes:  
```bash
git commit -m "Added new feature"  
```
4. Push to the branch:  
```bash
git push origin feature-name  
```
5. Open a **pull request**.  

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
