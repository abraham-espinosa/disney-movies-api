FROM maven:3.9.4-openjdk-11 as build
WORKDIR /app
COPY pom.xml .
COPY src/ src/
RUN mvn -f pom.xml clean package

FROM openjdk:11-jre-slim-buster
WORKDIR /app
COPY --from=build /app/target/*.jar movies-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar","/movies-0.0.1-SNAPSHOT.jar"]