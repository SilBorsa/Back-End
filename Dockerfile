FROM amazoncorretto:17
MAINTAINER silborsa
COPY target/spb-0.0.1-SNAPSHOT.jar spb-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/spb-0.0.1-SNAPSHOT.jar"]
