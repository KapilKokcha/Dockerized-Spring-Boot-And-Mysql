# Dockerized-Spring-Boot-And-Mysql

### Prerequisite for Local setup
- Java 17
- Mysql 8

## Run Application Locally
### 1. Using mvn
```
mvn clean package
mvn spring-boot:run
java -jar target/your-app-name.jar
```
### 2. Using mvnw
```
./mvnw clean package
./mvnw spring-boot:run
java -jar target/your-app-name.jar
```

## Run Application with Dokcer

### Prerequisite for Local setup
- Docker
- Docker-Compose

### 1. Create .jar
```
mvn -f pom.xml clean package
```

### 2. Build Docker Image
```
sudo docker build -t javademo .
```

### 3. Run Docker compose
```
sudo docker-compose up
```
