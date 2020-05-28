FROM openjdk:8-jdk-alpine
VOLUME /tmp
EXPOSE 8080
COPY target/employee-rest-aws-0.0.1-SNAPSHOT.jar app.jar
ADD target/employee-rest-aws-0.0.1-SNAPSHOT.jar app.jar
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]