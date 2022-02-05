FROM openjdk:latest

ADD target/springboot-docker-0.0.1-SNAPSHOT app.jar

ENTRYPOINT ["java","-jar","app.jar"]

EXPOSE 8080