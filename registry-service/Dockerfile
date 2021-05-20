FROM adoptopenjdk:11-jre-hotspot

RUN mkdir /app

COPY ./build/libs/*.jar /app/eureka-server-image.jar

# java -XX:+UnlockExperimentalVMOptions -Djava.security.egd=file:/dev/./urandom CONFIG_SERVER=configserver:http://config-server:8888 -jar registry-service-0.0.1-SNAPSHOT.jar (eureka server)
ENTRYPOINT ["java", "-XX:+UnlockExperimentalVMOptions", "-Djava.security.egd=file:/dev/./urandom","-jar","/app/eureka-server-image.jar"]
#
# docker run -d -p 8099:8099 --name=registry-server -e CONFIG_SERVER=configserver:http://config-server:8888 sdsc81/eureka-server-image
# docker run -d -p 8099:8099 --name=registry-server -e CONFIG_SERVER=configserver:http://172.17.0.2:8888 sdsc81/eureka-server-image