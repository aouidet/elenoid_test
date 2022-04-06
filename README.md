Selenide examples: Selenoid
================================

This is a sample project demonstrating how to run Selenide UI tests with browsers in Selenoid. 

This project uses [selenide-selenoid](https://github.com/selenide/selenide-selenoid) plugin.

**You can checkout and run it locally with a few minutes.**

### How to run with Maven

Type from command line to run tests on your machine:

```
mvn test
```

_Feel free to share your feedback!_

###create docker network
docker network create selenoid
### create vdocker vilume images
docker volume create selenoid-videos
## RUN DOCKER COMPOSE
docker-compose up -d

After it started, you can check the status of the container
####  $ docker-compose ps
to check the status of the hub
####  $ curl -s http://localhost:4444/status

### show log 
#### $ docker logs selenoid

###  to run container
docker run -d --name selenoid                     \
-p 4445:4444                                    \
-v /etc/selenoid:/etc/selenoid:ro               \
-v /var/run/docker.sock:/var/run/docker.sock    \
aerokube/selenoid:1.3.2
