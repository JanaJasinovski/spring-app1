FROM openjdk:17
ADD /target/spring-app1.war backendAlishev.war
ARG PORT
EXPOSE $PORT
ENTRYPOINT ["java", "-jar", "backendAlishev.war"]