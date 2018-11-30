FROM java:8
LABEL maintainer="michal.blaszczyk"
COPY ./mysql-connector-java-8.0.13.jar /mysql-connector-java-8.0.13.jar
COPY ./main.java /main.java
WORKDIR /
RUN ["javac", "main.java"]
