#### Dockerizing a Spring Boot 2

Login to Docker Hub

```zsh
$ docker login
```

create a Spring Boot 2 container

```zsh
$ docker build -t {yourDockerUsername}/spring-boot-api:1.0.0 .
```

Test the Spring Boot 2 container by running it. It should be visible at localhost:8080

```zsh
$ docker run -p 8080:8080 {yourDockerUsername}/spring-boot-api:1.0.0
```

Push the container to your Docker Hub account repository

```zsh
$ docker push {yourDockerUsername}/spring-boot-api:1.0.0
```
