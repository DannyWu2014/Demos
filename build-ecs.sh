#!/bin/bash
export SPRING_PROFILES_ACTIVE=ecs,data
./gradlew -b build-ecs.gradle clean bootRun

