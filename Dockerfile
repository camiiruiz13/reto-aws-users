#Imagen y version de java
FROM openjdk:23-jdk
LABEL authors="camilo"

#Directorio del contenedor
WORKDIR /app

#Copiamos el jar
COPY target/reto-aws-users-0.0.1-SNAPSHOT.jar app.jar

#Puerto de la app
EXPOSE 8080
EXPOSE 5005

#EJECUCION DEL JAR
ENTRYPOINT ["java", "-agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=*:5005", "-jar", "app.jar"]
