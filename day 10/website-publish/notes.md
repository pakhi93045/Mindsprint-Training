# steps:

1. docker build -t webpage1 .
2. docker run -d --name app -p 9090:80 webpage1
3. docker tag webpage1 pakhi93045/firstapp (to publish an image on docker) (firstapp is the name we want to give)
4. docker login
5. docker push pakhi93045/firstapp

after this we run jenkins

dir is similar to ls in git- it'll list out all the files

------------------

localhost:9092
-------------------------------

### more on dockers

1. docker volume
2. docker volume create test_volume
3. docker volume ls
4.  docker run -d --name my_container -v test_volume:/data nginx

docker run

This command is used to create and start a new container.
-d (Detached Mode)

Runs the container in the background instead of keeping it attached to the terminal.
--name my_container

Assigns a custom name (my_container) to the container for easy reference.
-v test_volume:/data

Mounts a Docker volume named test_volume to the /data directory inside the container.
This allows persistent storage, meaning data written to /data in the container will be stored in test_volume and persist even if the container stops or is removed.
ngin

This seems to be a typo. You likely meant nginx, which is a popular web server.
If ngin is not a valid image, Docker will try to pull it from the Docker registry and fail if it doesn't exist.


5. docker exec -it my_container bash
to get inside the container

6. cd data

move to the folder data and let's create a file here

7. echo 'Hello All' > file.txt

8. docker ps -a --filter status=exited

to see exited containers

9. docker container prune
remove all exited containers

10. docker container prune -f
forcefullt remove all exited containers

------------------------------------------------------------

## network docker container

1. docker network create my_network
2.  docker run -d --name container1 --network my_network nginx
to run container under one network

3. docker run -d --name container2 --network my_network nginx
same with another container

4. docker exec -it container1 bash

go inside container 1

5. ping container2

if ping is not working then 
first
apt update
then
apt install iputils-ping
then use ping cmd

6. docker run -d --name container3 nginx
create another containe

7. docker exec -it container1 bash

now if we go inside container1 and ping container3 then it'll not work 
but if we ping container2 it'll respond as they are under the same network