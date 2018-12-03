FROM java:8
COPY ./mysql-connector-java-8.0.13.jar /mysql-connector-java-8.0.13.jar
COPY ./MyClass.java /MyClass.java
WORKDIR /
RUN ["javac", "MyClass.java"]
