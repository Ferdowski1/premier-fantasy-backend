FROM eclipse-temurin:21-jdk-alpine

WORKDIR /app

# Copy the source code
COPY . .

# Build the app inside the container
RUN ./mvnw clean package -DskipTests

# Expose port 8080
EXPOSE 8080

# Run the built JAR
CMD ["java", "-jar", "target/premier-zone-0.0.1-SNAPSHOT.jar"]
