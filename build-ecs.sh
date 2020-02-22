#!/bin/bash
export SPRING_PROFILES_ACTIVE=ecs 
./gradlew -b build-ecs.gradle clean bootRun 

