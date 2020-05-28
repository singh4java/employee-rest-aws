FROM openjdk:8-jdk-alpine
EXPOSE 8080
ADD ./target/employee-rest-aws-0.0.1-SNAPSHOT.jar employee-rest-aws-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-XX:+UnlockExperimentalVMOptions", "-XX:+UseCGroupMemoryLimitForHeap", "-jar", "/employee-rest-aws-0.0.1-SNAPSHOT.jar"]