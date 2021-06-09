FROM openjdk:8-jdk-slim
MAINTAINER Logan <pahnki.kim@dreamus.io>

VOLUME /tmp

ENV SPRING_PROFILES_ACTIVE "local"

ARG JAR_FILE
ADD ${JAR_FILE} /flo/app.jar

WORKDIR /flo

ENTRYPOINT java -Xms32m -Xmx512m -Djava.security.egd=file:/dev/./urandom -jar /flo/app.jar --spring.profiles.active=$SPRING_PROFILES_ACTIVE
