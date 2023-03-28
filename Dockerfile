FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
COPY /var/jenkins_home/workspace/boc-backend/target/spring-boot-react-1.0.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]