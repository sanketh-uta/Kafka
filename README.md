# 📨 Kafka Messaging with Spring Boot

This project demonstrates **asynchronous communication between microservices** using **Apache Kafka** and **Spring Boot**.

It includes:
- A **Producer Service** that accepts an HTTP POST request to place an order and publishes the message to a Kafka topic.
- A **Consumer Service** that listens to the topic and logs the order details automatically.

---

## 📦 Tech Stack

- **Java 17**
- **Spring Boot**
  - `spring-kafka`
  - `spring-web`
- **Apache Kafka**
- **Docker + Docker Compose**

---

## 🧭 Project Structure

KafkaProject/
│
├── KafkaProducer/ # Producer microservice
│ └── POST /send-order # Publishes Order to Kafka topic
│
├── KafkaConsumer/ # Consumer microservice
│ └── Listens to topic # Reads & logs the order details
│
└── docker-compose.yml # Kafka + Zookeeper setup (inside KafkaConsumer)

## 🚀 How to Run the Project

### 🐋 Step 1: Start Kafka using Docker Compose

```bash
cd KafkaConsumer
docker-compose up -d
Starts:

Kafka broker on localhost:29092
Zookeeper on localhost:22181
