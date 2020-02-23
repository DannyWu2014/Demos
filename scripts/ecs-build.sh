#!/bin/bash
# docker pull openjdk:8-alpine
export SPRING_PROFILES_ACTIVE=ecs,data
./gradlew -b build-ecs.gradle clean bootRun

