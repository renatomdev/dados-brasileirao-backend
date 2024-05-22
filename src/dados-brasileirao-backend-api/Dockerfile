#
# BUILD STAGE
#
FROM maven:3.9.5-amazoncorretto-21 AS build
WORKDIR /app
COPY target/dados-brasileirao-backend-api-0.0.1-SNAPSHOT.jar /app
EXPOSE 8080
CMD ["java", "-jar", "dados-brasileirao-backend-api-0.0.1-SNAPSHOT.jar"]


