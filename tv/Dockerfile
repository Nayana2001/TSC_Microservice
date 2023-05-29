FROM openjdk:20

WORKDIR /app

COPY target/tv-0.0.1-SNAPSHOT.jar /app/tv.jar

EXPOSE 8083

CMD ["java", "-jar", "tv.jar"]
