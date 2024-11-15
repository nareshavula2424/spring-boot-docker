FROM openjdk:17-jdk

MAINTAINER "naresh.avula@gmail.com"

COPY target/spring-boot-docker.jar   /usr/app/spring-boot-docker.jar

WORKDIR /usr/app/

EXPOSE 8080

ENTRYPOINT ["java","-jar","spring-boot-docker.jar"]