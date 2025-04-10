# Build stage
FROM maven:3-openjdk-17 AS build
WORKDIR /app

COPY . .
RUN mvn clean package -DskipTests

# Run stage
FROM openjdk:17-jdk-slim
WORKDIR /app

# Copy đúng tên file WAR đã build
COPY --from=build /app/target/greeny-shop-1.0.war greeny-shop.war

EXPOSE 8080

# Chạy ứng dụng
ENTRYPOINT ["java", "-jar", "greeny-shop.war"]
