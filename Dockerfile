FROM tomcat:9.0-jre11
COPY build/libs/slow-boot-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps/slow-boot.war
