FROM openjdk:17-alpine
RUN java --version
WORKDIR /app
COPY ./target/corsbackend-0.0.1-SNAPSHOT.jar /app/app.jar
CMD ["java","-jar","/app/app.jar"]