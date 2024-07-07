# Dockerfile for simo application

FROM openjdk:17-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Update package repositories and install curl
RUN apt-get update && \
    apt-get install -y curl && \
    rm -rf /var/lib/apt/lists/*

# Copy the built JAR file from the target directory into the container
COPY target/simo-0.0.1-SNAPSHOT.jar app.jar

# Expose port 9091 for the application
EXPOSE 9091
EXPOSE 5006

# Command to run the application
ENTRYPOINT ["java", "-jar", "simo-0.0.1-SNAPSHOT.jar"]
