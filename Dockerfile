FROM openjdk:17
ADD target/kubernetes.jar kubernetes.jar
EXPOSE 8090
ENTRYPOINT ["java","-jar","/kubernetes.jar"]