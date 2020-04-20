# Async HTTP Response with Fuse

This project is for a simple async http response on top of Red Hat Fuse, where it will run a specific logic asyncronously. And we need Java 8 to run this project. 

## Build the project using Maven

```shell script
mvn clean package -s settings.xml
```

## Deploy to OCP
```
mvn fabric8:deploy -Pfabric8
```

## curl
```
curl -kv http://localhost:8080/api/hello
```