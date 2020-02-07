#!/bin/bash
docker run -d --name=prometheus -p 9090:9090 -v /home/jhunsley/IdeaProjects/MTD/spring-boot-dashboard/prometheus.yml:/etc/prometheus/prometheus.yml prom/prometheus --config.file=/etc/prometheus/prometheus.yml
docker run -d --name=grafana -p 3000:3000 grafana/grafana