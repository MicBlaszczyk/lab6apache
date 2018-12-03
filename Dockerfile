FROM java:8
COPY ./mysql-connector-java-8.0.13.jar /mysql-connector-java-8.0.13.jar
COPY ./main.java /main.java
CMD ["javac", "main.java"]
RUN ["java", "-cp", ".:mysql-connector-java-8.0.13.jar", "main"]
