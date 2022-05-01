FROM openjdk:8
EXPOSE 8080
ADD target/github-actions-exjobb.jar github-actions-exjobb.jar
ENTRYPOINT ["java","-jar","/github-actions-exjobb.jar"]