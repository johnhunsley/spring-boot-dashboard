# spring-boot-dashboard
An example using Spring Boot Actuator, Prometheus and Grafana

From tutorial - https://www.callicoder.com/spring-boot-actuator/

Run Promethesus -

``docker pull prom/prometheus``
``docker run -d --name=prometheus -p 9090:9090 -v /full/path/to/prometheus.yml:/etc/prometheus/prometheus.yml prom/prometheus --config.file=/etc/prometheus/prometheus.yml``

Or

``./prometheus.sh``

Prometheus UI - http://localhost:9090

Run Grafana -

``docker run -d --name=grafana -p 3000:3000 grafana/grafana``