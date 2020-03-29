FROM maven:3.6.0-jdk-11-slim AS build
COPY exam/src /home/app/src
COPY exma/pom.xml /home/app
RUN mvn -f /home/app/pom.xml test
