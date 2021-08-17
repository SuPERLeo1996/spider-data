FROM openjdk:8u265-jdk
MAINTAINER leo

ENV PARAMS="&"

ENV TZ=PRC
ENV JAVA_OPTS="-XX:MetaspaceSize=64M -XX:MaxMetaspaceSize=64M -Xms128m -Xmx128m -Xmn64m -XX:+UseG1GC"
RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone

ADD target/spider-data-*.jar /opt/images/spider-data.jar

ENTRYPOINT ["sh","-c","java -jar $JAVA_OPTS /opt/images/spider-data.jar $PARAMS"]