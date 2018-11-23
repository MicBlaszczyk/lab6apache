FROM ubuntu
LABEL maintainer="michal.blaszczyk"
EXPOSE 80
RUN apt-get update && apt-get upgrade -y && apt-get -y install apache2
CMD ["/usr/sbin/apache2ctl","-D","FOREGROUND"]
