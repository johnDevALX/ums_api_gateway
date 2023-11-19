FROM openjdk:17-alpine

COPY target/ums_api_gateway-0.0.1-SNAPSHOT.jar ums-gateway.jar
ENTRYPOINT ["java","-jar","/ums-gateway.jar"]