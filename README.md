# spring-boot-dashboard
An example using Spring Boot Actuator, Prometheus and Grafana

From tutorial - https://www.callicoder.com/spring-boot-actuator/

Build the Spring Boot app and image then start the stack -

``mvn clean package``

``docker build . -t spring-boot-dashboard``

``docker-compose up``

Docker will provision Prometheus which will automatically connect to the spring-app service named in docker-compose.
A grafana container will also be started which loads the datasource and dashboard. The dash will connect to the prometheus
datasource and display the stats

Grafana UI - http://localhost:3000

Prometheus UI - http://localhost:9090

to individually run Promethesus -

``docker pull prom/prometheus``

``docker run -d --name=prometheus -p 9090:9090 -v /full/path/to/prometheus.yml:/etc/prometheus/prometheus.yml prom/prometheus --config.file=/etc/prometheus/prometheus.yml``



Individually run Grafana -

``docker run -d --name=grafana -p 3000:3000 grafana/grafana``






