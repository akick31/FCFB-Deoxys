# Define the Docker image name
DOCKER_IMAGE_NAME="fcfb-deoxys:Dockerfile"
CONTAINER_NAME="FCFB-Deoxys"

# Check if the Docker container is running
if docker ps -q --filter "name=${CONTAINER_NAME}" | grep -q .; then
    echo "STOPPING DEOXYS..."
    docker stop ${CONTAINER_NAME}
    echo "DEOXYS STOPPED!"
    echo

    echo "REMOVING DEOXYS..."
    docker rm ${CONTAINER_NAME}
    echo "OLD DEOXYS REMOVED!"
    echo
else
    echo "Deoxys is not running. No need to stop and remove."
    echo
fi

echo "BUILD MVN PROJECT..."
mvn clean install

echo "BUILDING NEW DEOXYS..."
docker build -t "${DOCKER_IMAGE_NAME}" .
echo "NEW DEOXYS BUILT!"
echo

echo "STARTING NEW DEOXYS..."
docker run -d --restart=always --name ${CONTAINER_NAME} ${DOCKER_IMAGE_NAME}
echo "NEW DEOXYS STARTED!"
echo "DONE!"

docker system prune -a --force