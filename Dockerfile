FROM maven:3.8.6-openjdk-11 AS builder
VOLUME /root/.m2
WORKDIR /app

COPY ./pom.xml .
RUN ["mvn", "clean", "dependency:resolve"]

COPY . .
RUN ["mvn", "package"]

FROM amazoncorretto:11-alpine
ENV PROJECT_NAME=lojaRoupa

WORKDIR /app
COPY --from=builder /app/target/${PROJECT_NAME}-0.0.1-SNAPSHOT.jar /app/app.jar

ENTRYPOINT ["/usr/bin/java", "-jar", "app.jar"]