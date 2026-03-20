# JAVA for 1st Time

Learning JAVA for the first time

---

<br>

### SDKMAN is designed for:
(Good to know but not needed)

- Linux [ yes ]
- macOS [ yes ]
- WSL (Windows Subsystem for Linux) [ yes ]
- But NOT for Git Bash (MINGW64) [ no ]

<br>

- SDK comes from SDKMAN
- SDKMAN (Software Development Kit Manager)
- SDKMAN works best on Linux/macOS, not Git Bash (MINGW64) on Windows

<br>

## On Windows + Git Bash
### Setting up Ubuntu
```bash
wsl --install
wsl --list --online || wsl -l -o
wsl --install Ubuntu-22.04

#--> Set UNIX username & password

#--> To open ubuntu
wsl || wsl -d Ubuntu-22.04

exit

wsl --shutdown

#--> To check running ubuntu
wsl -l -v
```

### Installing packages needed for SpringBoot
```bash
wsl
cd ~
sudo apt update && sudo apt upgrade -y
sudo apt install curl zip unzip git -y
curl -s "https://get.sdkman.io" | bash

source "/home/anonymous/.sdkman/bin/sdkman-init.sh"
#OR
source "$HOME/.sdkman/bin/sdkman-init.sh"

sdk version
sdk list java
sdk install java 21.0.10-tem
sdk default java 21.0.10-tem
java -version
sdk install maven
mvn -version
sdk install springboot

spring init --dependencies=web,lombok mygradleapp
#OR
spring init --dependencies=web,lombok --build=maven mymavenapp
```

### spring init using service from https://start.spring.io

- Maven and Gradle they are build tools / dependency managers for Java
- ( Same as npm in nodejs )

```
myapp/
 ├── src/
 │   └── main/
 │       ├── java/
 │       │   └── AppnameApplication.java
 │       └── resources/
 │           └── application.properties
 ├──
 ```

<br>

---
### My Workflow

1. Create repo on GitHub
2. Clone repo
3. Open repo in VScode
4. `wsl`
5. `spring init --dependencies=web,lombok gradleapp`
5. `spring init --dependencies=web,lombok --build=maven mavenapp`
7. write code
8. git add → commit → push

<br>

---

## Maven vs Gradle Project Structure

### Maven
```
appname (Maven)

├── src/
│   ├── main/
│   │   ├── java/com/example/appname/
│   │   │                    └── AppnameApplication.java
│   │   └── resources/
│   │       ├── static/
│   │       ├── templates/
│   │       └── application.properties
│   │       
│   └── test/java/com/example/appname/
│                             └── AppnameApplicationTests.java
├── .mvn/wrapper
│        └── maven-wrapper.properties
│        
├── pom.xml
├── mvnw
└── mvnw.cmd
```

### Gradle
```
appname (Gradle)
│
├── src/
│   ├── main/
│   │   ├── java/com/example/appname/
│   │   │                    └── AppnameApplication.java
│   │   └── resources/
│   │       ├── static/
│   │       ├── templates/
│   │       └── application.properties
│   │       
│   └── test/java/com/example/appname/
│                             └── AppnameApplicationTests.java
├── gradle/wrapper/
│          ├── gradle-wrapper.jar
│          └── gradle-wrapper.properties
│          
├── build.gradle
├── settings.gradle
├── gradlew
└── gradlew.bat
```
---

### Spring Boot common basic structure
```
 project-name
 ├── src
 │   └── main
 │       ├── java/com/example/demo
 │       │     └── DemoApplication.java
 │       └── resources
 │             └── application.properties
 ├── 
```

| Node            | Maven                 | Gradle              |
|-----------------|-----------------------|---------------------|
| `npm install`   | `mvn install`         | `./gradlew build`   |
| `npm start`     | `mvn spring-boot:run` | `./gradlew bootRun` |
| `npm run build` | `mvn package`         | `./gradlew build`   |
| `npm test`      | `mvn test`            | `./gradlew test`    |

## Maven

```bash
# Install dependencies (like npm install)
mvn install
# Run the app (like node index.js or npm start)
mvn spring-boot:run
# Build a .jar file (like npm run build)
mvn package
# Run tests
mvn test
# Clean build output
mvn clean
# Clean + build together
mvn clean package
```

---

## Gradle

```bash
# Install dependencies
gradle build
# Run the app
./gradlew bootRun
# Build a .jar file
./gradlew build
# Run tests
./gradlew test
# Clean build output
./gradlew clean
# Clean + build together
./gradlew clean build
```
---
<br>

## Run vs Build

> Development:
- Maven → `mvn spring-boot:run`
- Gradle → `./gradlew bootRun`

<br>

> Production:
- Build JAR → `mvn package` / `gradlew build`
- Run → `java -jar app.jar`

<br>

---

<br>

## Project Structure Comparison

| Node.js         | Spring Boot                                | Purpose                                            |
|-----------------|--------------------------------------------|----------------------------------------------------|
| `Node.js`       | `JDK (Java Development Kit)`               |                                                    |
| `npm`           | `Maven` / `Gradle`                         | manages dependencies, like package.json → pom.xml  |
| `index.js`      | `MainApplication.java`                     | Entry point, starts the server                     |
| `router.js`     | `Controller.java` (route + controller)     | Routes / endpoints (`@GetMapping`, `@PostMapping`) |
| `middleware.js` | `Filter.java` or `Interceptor.java`        | Middleware logic                                   |
| `controller.js` | `Service.java`                             | Business logic / controller functions              |
| `model.js`      | `Model.java` + `Repository.java`           | DB schema + DB queries                             |
| `package.json`  | `pom.xml` / `build.gradle`                 | Dependencies list                                  |
| `.env`          | `application.properties`                   | Config, DB URL, secrets                            |
| `express`       | `Spring Web`                               | The web framework                                  |
| `mongoose`      | `Spring Data JPA` or `Spring Data MongoDB` | DB interaction                                     |
| `mongodb`       | `MongoDB` or `PostgreSQL` / `MySQL`        | Database itself                                    |

---

<br>

## Nodejs Flow vs Spring Boot Flow

## Node:
```
index.js (app starts)
  → router.js (defines routes)
    → middleware.js (auth, validation, etc.)
      → controller.js (logic)
        → model.js (DB query)
```

## Spring Boot:
```
MainApplication.java (app starts)
  → Controller.java (defines routes + handles request)
    → Filter/Interceptor.java (auth, validation, etc.)
      → Service.java (logic)
        → Repository.java (DB query)
          → Model.java (DB schema/entity)
```

---

<br><br><br>

# Java Backend

```
Java (Language)
└── JVM (runs the code)
    └── JRE (JVM + standard libraries)
        └── JDK (JRE + compiler + dev tools)  ← what I install
            └── SDKMAN (installs/manages JDK versions)  ← like nvm for Node

Build Tools  ← like npm
├── Maven (pom.xml)  ← old but easy
└── Gradle (build.gradle)  ← I'm stronger, I'm smarter, I- I'm better! I Am Better!

How to add any Spring module
├── Maven:  add <dependency> block inside <dependencies> in pom.xml
└── Gradle: add implementation '...' inside dependencies {} in build.gradle

Spring Ecosystem  ← like Express for Node
├── Spring Framework (the core)
└── Spring Boot (Spring + auto-config + embedded server)  ← what I actually need
    ├── Spring Web          → REST APIs (like Express)
    ├── Spring Data JPA     → SQL databases
    ├── Spring Data MongoDB → MongoDB (like Mongoose)
    ├── Spring Security     → Auth, JWT, OAuth2
    ├── Spring Validation   → Input validation (like Joi)
    ├── Spring Cloud        → Microservices [advanced]
    ├── Spring Batch        → Background jobs [advanced]
    └── Spring WebFlux      → Reactive/async [advanced]

My App Code (files to write inside src/)
├── MainApplication.java       → Entry point          (like index.js)
├── Controller.java            → Routes & endpoints   (like router.js)
├── Service.java               → Business logic       (like controller.js)
├── Repository.java            → DB queries           (like model.js queries)
├── Model.java / Entity.java   → DB schema            (like mongoose schema)
├── DTO.java                   → Request/response shape
├── Filter / Interceptor       → Middleware           (like middleware.js)
└── GlobalExceptionHandler     → Centralized errors

Database Layer
├── SQL path
│   ├── JDBC                  → Raw DB connection (low level)
│   ├── JPA                   → Specification/API for ORM (not code, just rules)
│   ├── Hibernate             → Implements JPA (runs under the hood)
│   └── Spring Data JPA       → Simplifies Hibernate  ← what I need
├── MongoDB path
│   └── Spring Data MongoDB   → Like Mongoose for Java  ← what I need
└── Databases
    ├── MongoDB
    ├── PostgreSQL
    ├── MySQL
    ├── H2 (in-memory, for dev/testing)
    └── Redis (caching)

Embedded Web Server (bundled inside the app, no separate install)
├── Tomcat    → Default, runs on port 8080
├── Jetty     → Lightweight alternative
└── Undertow  → High-performance alternative

Utilities (add to pom.xml for Maven OR build.gradle for Gradle)
│
├── Spring Web (REST APIs — like Express)
│   ├── Maven:  <dependency> org.springframework.boot : spring-boot-starter-web </dependency>
│   └── Gradle: implementation 'org.springframework.boot:spring-boot-starter-web'
│
├── Lombok
│   ├── Maven:  <dependency> org.projectlombok : lombok </dependency>
│   └── Gradle: compileOnly 'org.projectlombok:lombok'
│
├── Spring Data JPA (SQL databases)
│   ├── Maven:  <dependency> org.springframework.boot : spring-boot-starter-data-jpa </dependency>
│   └── Gradle: implementation 'org.springframework.boot:spring-boot-starter-data-jpa'
│
├── Spring Data MongoDB (like Mongoose)
│   ├── Maven:  <dependency> org.springframework.boot : spring-boot-starter-data-mongodb </dependency>
│   └── Gradle: implementation 'org.springframework.boot:spring-boot-starter-data-mongodb'
│
└── Spring Security (auth, JWT, OAuth2)
    ├── Maven:  <dependency> org.springframework.boot : spring-boot-starter-security </dependency>
    └── Gradle: implementation 'org.springframework.boot:spring-boot-starter-security'


Configuration  ← like .env in Node
├── application.properties   → Key=value config (DB URL, port, secrets)
├── application.yml          → Same but YAML format (cleaner)
├── Profiles                 → application-dev.yml, application-prod.yml  (like NODE_ENV)
└── @Value / @ConfigurationProperties  → Read config into Java classes

Testing  ← like Jest + Supertest in Node
├── JUnit 5         → Unit testing framework (like Jest)
├── Mockito         → Mocking/fake objects for isolated tests
├── Spring Boot Test → Integration testing (@SpringBootTest)
└── MockMvc         → Test HTTP endpoints without real server (like Supertest)

Build Output & Deployment
├── .jar location
│   ├── Maven:  target/myapp.jar        (after mvn package)
│   └── Gradle: build/libs/myapp.jar    (after ./gradlew build)
│
├── Docker      → Containerize the .jar (same workflow as Node)
└── Actuator    → Built-in health check endpoints (/actuator/health)
```