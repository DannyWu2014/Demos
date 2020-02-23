#!/bin/bash
# docker pull openjdk:8-alpine
docker rm -f  demo
docker rmi myorg/myapp
./gradlew -b build-ecs.gradle clean jibDockerBuild --image myorg/myapp \
-Djib.from.image=docker://openjdk:8-alpine

docker run -d --name demo -p 80:8000 -e SPRING_PROFILES_ACTIVE=ecs,data \
	myorg/myapp

