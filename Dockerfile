# Stage 1: Build the application
FROM maven:3.9.6-amazoncorretto-17 AS BUILD

# Set working directory inside the container
WORKDIR /app

# Copy the POM file
COPY pom.xml .

# Resolve dependencies
RUN mvn dependency:go-offline -B

# Copy project files
COPY src ./src

# Build the application without running tests
RUN mvn package -DskipTests

# Stage 2: Create the production image
FROM openjdk:17-slim AS PROD

# Set working directory inside the container
WORKDIR /app

# Copy the JAR file from the build stage to the final image
COPY --from=BUILD /app/target/MoneyHoney-0.0.1-SNAPSHOT.jar app.jar

# Expose the port your application runs on
EXPOSE 8081

# Command to run your application
CMD ["java", "-jar", "app.jar"]
