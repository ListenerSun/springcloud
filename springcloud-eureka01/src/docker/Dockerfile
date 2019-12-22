FROM openjdk:8-jdk-alpine

MAINTAINER Hoastar

COPY ./manage-service/target/manage-service.jar /home/app.jar

EXPOSE 10104

ENTRYPOINT ["/usr/bin/java","-Xms512m","-Xmx1024m","-XX:+UseConcMarkSweepGC","-XX:ParallelGCThreads=4","-server","-jar","/home/app.jar","--spring.profiles.active=test","--server.port=10104"]
