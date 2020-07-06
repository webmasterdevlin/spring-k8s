FROM openjdk:8-jdk-alpine
# run this separately to generate build/libs/*.jsar in the root directory of this application
# ./gradlew build
ADD build/libs/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]