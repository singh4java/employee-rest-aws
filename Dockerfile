FROM openjdk:8-jdk-alpine
VOLUME /tmp
WORKDIR /
ADD /target/employee-rest-aws-0.0.1-SNAPSHOT.jar /var/lib/docker/tmp/app.jar
RUN rm /var/lib/docker/tmp/app.jar
EXPOSE 8080
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/var/lib/docker/tmp/app.jar"]
