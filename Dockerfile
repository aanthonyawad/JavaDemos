From tomcat:8.0.51-jre8-alpine

ENV GOOGLE_APPLICATION_CREDENTIALS "/usr/local/tomcat/webapps/key.json"
RUN rm -rf /usr/local/tomcat/webapps/*

COPY ./key.json /usr/local/tomcat/webapps/key.json
COPY ./target/demo-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps/ROOT.war

CMD ["catalina.sh","run"]