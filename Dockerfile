FROM openjdk:8u265-jdk
MAINTAINER leo

ENV PARAMS="&"

ENV TZ=PRC
ENV JAVA_OPTS="-XX:MetaspaceSize=128M -XX:MaxMetaspaceSize=128M -Xms256m -Xmx256m -Xmn128m -XX:+UseG1GC"
RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone

ADD target/spider-data-*.jar /opt/images/spider-data.jar

ENTRYPOINT ["sh","-c","java -jar $JAVA_OPTS /opt/images/spider-data.jar $PARAMS"]