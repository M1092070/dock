FROM openjdk:17
LABEL maintainer="susmita.net"
ADD target/springboot-dockerdemo-0.0.1-SNAPSHOT.jar springboot-dockerdemo.jar
ENTRYPOINT ["java","-jar","springboot-dockerdemo.jar"]