# Multi-stage build: Stage 1 - Build the application with Maven
FROM maven:3.9-eclipse-temurin-17 AS build

# Set working directory inside the container
WORKDIR /app

# Copy pom.xml first (for better layer caching)
COPY pom.xml .

# Download dependencies (cached unless pom.xml changes)
RUN mvn dependency:go-offline -B

# Copy source code
COPY src ./src

# Build the application (skip tests for faster builds; remove -DskipTests to run tests)
RUN mvn clean package -DskipTests

# Stage 2: Create the final lightweight runtime image
FROM eclipse-temurin:17-jre-alpine

# Set working directory
WORKDIR /app

# Copy only the built JAR from the build stage
COPY --from=build /app/target/my-maven-app-1.0-SNAPSHOT.jar app.jar

# Document which port the app uses (informational)
EXPOSE 8080

# Command to run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
