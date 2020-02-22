#!/bin/bash
export SPRING_PROFILES_ACTIVE=ecs 
./gradlew -q -b build-ecs.gradle bootRun 

