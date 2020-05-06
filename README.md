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

## Redeploy to OCP
```
mvn clean install -Pfabric8
```

## curl
```
curl -kv http://localhost:8080/api/hello
```

## Blog
```
https://edwin.baculsoft.com/2020/04/create-async-http-process-with-red-hat-fuse-on-top-of-openshift-3-11/
```