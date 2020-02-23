#!/bin/bash
export SPRING_PROFILES_ACTIVE=default,data
./gradlew -b build.gradle clean bootRun

