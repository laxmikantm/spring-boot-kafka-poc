docker-compose up -d --force-recreate --remove-orphans
docker-compose exec kafka0  kafka-topics --create --bootstrap-server localhost:9092 --replication-factor 1 --partitions 1 --topic devTesTask90POE
