FROM openjdk:17
COPY ./out/production/movies/ /tmp
WORKDIR /tmp
ENTRYPOINT ["java","MoviesApplication"]