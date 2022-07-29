FROM adoptopenjdk/openjdk11
COPY target/*.jar /opt/app.jar
WORKDIR /opt
ENV PORT 8080
EXPOSE 8080


ENTRYPOINT [ "sh", "-c", "java -jar app.jar" ]
