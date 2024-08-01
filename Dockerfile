FROM openjdk:18
WORKDIR /app
COPY ./target/Jenkins-Assessment-0.0.1-SNAPSHOT.jar /app
EXPOSE 8080
CMD ["java", "-jar", "Jenkins-Assessment-0.0.1-SNAPSHOT.jar"]
