From openjdk:8
WORKDIR /usr/src/app
COPY springdocker/target/springdocker-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8081
CMD ["java","-jar","app.jar"]