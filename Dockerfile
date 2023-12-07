FROM adoptopenjdk:8-jdk-hotspot

# Create directories and copy over
WORKDIR /project

# Copy the jar file
COPY ./target/*.jar app.jar

# Expost port
EXPOSE 1212

# Run Deoxys
CMD [ "java", "-jar", "app.jar" ]
