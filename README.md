### Running  RabbitMQ in Docker Container
docker run -d --hostname haroldjcastillo --name rabbit-server -e RABBITMQ_DEFAULT_USER=admin -e RABBITMQ_DEFAULT_PASS=admin2017 -p 5672:5672 -p 15672:15672 rabbitmq:3-management

