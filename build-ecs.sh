#!/bin/bash
# docker pull openjdk:8-alpine
export SPRING_PROFILES_ACTIVE=ecs,data
./gradlew -b build-ecs.gradle clean bootRun

./gradlew -b build-ecs.gradle clean jibDockerBuild --image myorg/myapp \
-Djib.from.image=docker://openjdk:8-alpine
