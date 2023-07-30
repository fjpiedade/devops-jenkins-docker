FROM openjdk:17
EXPOSE 9090
ADD target/devops-jenkins-docker.jar devops-jenkins-docker.jar
ENTRYPOINT ["java", "-jar", "/devops-jenkins-docker.jar"]