FROM openjdk:8-jre-alpine
ADD  target/unittestdemo-0.0.1-SNAPSHOT.jar /unittestdemo.jar
EXPOSE 8086
ENTRYPOINT ["java","-jar","unittestdemo.jar"]