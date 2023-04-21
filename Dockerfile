FROM openjdk:11
RUN mkdir /spring
COPY target/spring-boot-app.jar /spring/
WORKDIR /spring/
ENTRYPOINT ["java","-jar","spring-boot-app.jar"]
