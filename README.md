# JAVA for 1st Time

Learning JAVA for the first time

---

```
java -version
javac -version
mvn -version
sdk install springboot
```

<br>

## SDKMAN is designed for:

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

```
wsl --install
wsl
```

<br>

---

```
pom.xml
src/main/java
src/main/resources
Application.java
```

1. Install JDK 21
2. Install Maven
3. Install VS Code + Java extensions
4. Generate project (Spring Initializr)

---

## Project Setup

```
Project: Maven
Language: Java
Spring Boot: latest
Dependencies:
 - Spring Web
 - Lombok (optional)
 - Spring Data JPA (optional)
```

### Spring Boot
```
 project-name
 ├── src
 │   └── main
 │       ├── java/com/example/demo
 │       │     └── DemoApplication.java
 │       └── resources
 │             └── application.properties
 ├── pom.xml
```

### Nodejs

```
project
 ├── src
 │    ├── controllers
 │    ├── services
 │    ├── routes
 │    └── middleware
 └── server.js
 ```
