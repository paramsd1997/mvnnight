FROM openjdk:11
COPY target/mvn1-0.0.1-SNAPSHOT.jar /
WORKDIR /
CMD ["java", "-jar", "mvn1-0.0.1-SNAPSHOT.jar"]
