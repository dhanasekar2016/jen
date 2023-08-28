FROM eclipse-temurin:17
COPY target/WebApp.jar WebApp.jar
CMD [ "java","-jar","WebApp.jar" ]