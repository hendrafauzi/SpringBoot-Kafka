# SpringBoot-Kafka

1. Install zookeeper
2. Install kafka
3. Run zookeeper
4. Run Kafka
5. Git clone project
6. Compile & Run the project using : mvn clean install && java -jar target\spring-boot-kafka.jar
7. Open terminal --> go to kafka bin --> then type:

   #windows  : kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic messages
   #unix     : kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic messages
   
8. Hit the API using Curl
   curl -H "Content-Type: application/json" --data '{"name":"trondallo", "age":"150"}' localhost:8080/send-data/data
