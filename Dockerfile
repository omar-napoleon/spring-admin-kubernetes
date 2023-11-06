FROM openjdk:17-jdk-alpine

EXPOSE 8080

COPY build/libs/ms-admin-k8s-0.0.1.jar app.jar

ENTRYPOINT ["java"]

CMD ["-jar", "/app.jar"]