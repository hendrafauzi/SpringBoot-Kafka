FROM openjdk:8
ADD target/spring-boot-kafka.jar spring-boot-kafka.jar
EXPOSE 8085
ENTRYPOINT ["java", "-jar", "spring-boot-kafka.jar"]