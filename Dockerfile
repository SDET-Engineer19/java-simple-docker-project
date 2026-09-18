FROM ubuntu:latest
LABEL authors="digvijayanney"

FROM eclipse-temurin:17-jdk-alpine

WORKDIR /app

COPY src/test/java/Calculator.java /app/Calculator.java

RUN javac Calculator.java

CMD ["java", "Calculator"]