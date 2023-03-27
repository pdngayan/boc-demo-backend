FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
COPY target/spring-boot-react-1.0.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]