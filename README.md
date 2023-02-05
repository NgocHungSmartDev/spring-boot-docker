# build file jar
* mvn clean package -DskipTests

# build images from dockerFile

* build images: docker build -t spring-boot-docker .
* run images: docker run -p 8080:8080 -t spring-boot-docker
* build and run docker compose: docker build -t spring-boot-docker-compose .