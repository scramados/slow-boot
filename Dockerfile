FROM tomcat:9.0-jre11
ENV VERSION '0.0.1'
COPY build/libs/slow-boot-${VERSION}-SNAPSHOT-plain.war /usr/local/tomcat/webapps/slow-boot.war
