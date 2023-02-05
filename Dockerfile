FROM eclipse-temurin:17-jdk-focal

VOLUME /tmp

ENV DATABASE_HOST=host.docker.internal
ENV DATABASE_PORT=5432
ENV DATABASE_NAME=docker
ENV DATABASE_USERNAME=postgres
ENV DATABASE_PASSWORD=123456

ADD target/spring-boot-docker-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT exec java -jar app.jar