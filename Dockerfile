FROM openjdk:17
WORKDIR /app
ADD pom.xml pom.xml
ENTRYPOINT ["java","xml","pom.xml"]
