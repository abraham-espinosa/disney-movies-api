FROM maven:3.8.3-jdk-11-slim AS build
COPY . .
RUN mvn clean package -DskipTests

FROM openjdk:11-jdk-slim-stretch
COPY --from=build /target/movies-0.0.1-SNAPSHOT.jar movies.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","movies.jar"]