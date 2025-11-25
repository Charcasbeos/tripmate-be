# Run docker container for consul
docker-compose -f docker-compose-consul.yaml up -d
# Run docker container for DB
docker-compose -f docker-compose-db.yaml up -d

# Start spring boot project
mvn spring-boot:run