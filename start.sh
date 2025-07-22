#!/bin/bash

set -e  # Detiene la ejecución si algún comando falla

echo "Construyendo el proyecto con Maven..."
mvn clean install -DskipTests

echo "Construyendo la imagen Docker..."
docker build -t reto-aws-users .

echo "Ejecutando el contenedor Docker en el puerto 8080..."
docker run -p 8080:8080 -p 5005:5005 --name reto-aws-users-container reto-aws-users

