docker-compose down --volumes --remove-orphans
docker rmi $(docker images confluentinc/cp* -q)
