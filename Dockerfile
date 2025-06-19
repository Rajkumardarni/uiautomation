FROM maven:3.9.6-eclipse-temurin-17

WORKDIR /app

# Clone from GitHub (not great for CI/CD but possible)
RUN apt-get update && apt-get install -y git \
    && git clone https://github.com/<your-username>/<your-repo>.git .

RUN mvn clean install

CMD ["java", "-jar", "target/your-app.jar"]
