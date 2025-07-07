FROM eclipse-temurin:17-jdk

WORKDIR /app

# Copy the entire repo
COPY . /app

# Build the project inside the support-ticket-api folder
RUN ./support-ticket-api/mvnw -f ./support-ticket-api/pom.xml clean install

# Set working directory to the app folder for running
WORKDIR /app/support-ticket-api

# Run the Spring Boot app
CMD ["./mvnw", "spring-boot:run"]
