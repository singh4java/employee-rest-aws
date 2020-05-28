FROM openjdk:8-jdk-alpine
EXPOSE 8080
COPY target/employee-rest-aws-0.0.1-SNAPSHOT.jar /target/employee-rest-aws-0.0.1-SNAPSHOT.jar
RUN cp -r /target/employee-rest-aws-0.0.1-SNAPSHOT.jar/* / && rm -r /target/employee-rest-aws-0.0.1-SNAPSHOT.jar
ADD target/employee-rest-aws-0.0.1-SNAPSHOT.jar app.jar
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]