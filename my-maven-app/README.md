# My Maven App

A simple Java application built with Maven, designed for practicing Jenkins CI/CD builds.

## Features

- Calculator class with basic arithmetic operations (add, subtract, multiply, divide)
- Greeter class with simple greeting methods
- Comprehensive JUnit 4 test cases
- Maven build configuration with executable JAR

## Project Structure

```
my-maven-app/
├── pom.xml
├── src/
│   ├── main/java/com/vyshu/
│   │   ├── App.java         (Main class)
│   │   ├── Calculator.java
│   │   └── Greeter.java
│   └── test/java/com/vyshu/
│       ├── CalculatorTest.java
│       └── GreeterTest.java
```

## How to Build

```bash
mvn clean package
```

## How to Run Tests Only

```bash
mvn test
```

## How to Run the Application

```bash
java -jar target/my-maven-app-1.0-SNAPSHOT.jar
```

## Expected Output

```
=================================
  Hello from my Maven app!
  Built and deployed via Jenkins
=================================
5 + 3 = 8
10 - 4 = 6
6 * 7 = 42
20 / 4 = 5
Hello, Vyshu!
```

## Tests

The project contains 9 JUnit test cases covering:
- Calculator operations (addition, subtraction, multiplication, division)
- Division by zero exception handling
- Greeter with various input scenarios (null, empty, valid names)

## Built With

- Java 17
- Maven 3
- JUnit 4.13.2
