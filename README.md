# MySpringBank

**MySpringBank** is a simple banking management system developed using **Spring Boot** in **Eclipse IDE**. It demonstrates core banking operations with backend logic using Spring MVC, Spring Data JPA, and a basic web interface with Thymeleaf.

## 🛠️ Developed Using
- **Eclipse IDE**
- Java 8+
- Spring Boot
- Spring MVC
- Spring Data JPA
- Thymeleaf
- MySQL
- HTML & CSS

## ✅ Features
- Create and manage bank accounts
- Deposit and withdraw money
- View account and transaction details
- Web interface with Thymeleaf templates

## 🗂️ Project Structure
MySpringBank/
├── src/
│   ├── main/
│   │   ├── java/com/ty/MySpringBank/
│   │   │   ├── controller/       # Contains controller classes
│   │   │   ├── model/            # Contains model/entity classes
│   │   │   ├── repository/       # Contains data repository interfaces
│   │   │   └── service/          # Contains service classes
│   │   └── resources/
│   │       ├── templates/        # HTML files using Thymeleaf
│   │       └── static/           # CSS, JavaScript, images
├── pom.xml                      # Maven project file
└── application.properties       # Spring Boot configuration

## 🧑‍💻 How to Run the Project in Eclipse
1. **Clone or download** this project:
https://github.com/Vinayak6019/MySpringBank.git
2. **Open Eclipse IDE**
3. Go to:  
`File → Import → Maven → Existing Maven Projects`
4. Select the folder where you saved `MySpringBank` and click **Finish**
5. Configure MySQL in `src/main/resources/application.properties`:
properties 
`spring.datasource.url=jdbc:mysql://localhost:3306/mybank`
`spring.datasource.username=root`
`spring.datasource.password=yourpassword`
6. Right-click on the project → Run As → Spring Boot App
7. Open browser and visit:
   `http://localhost:8080`

Author
    Vinayakan H
    Java Developer | Spring Boot Learner


