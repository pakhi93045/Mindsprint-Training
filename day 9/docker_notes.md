# DOCKER

## steps


1. to check docker version

docker version
or
docker --version

2. to check docker images
docker images

3. docker pull hello-world

4. docker run hello-world
(for running this image)

5. docker ps
(it'll not show anything bcz ur img executed and shown the op and its exited)
ps shows running containers

6. docker ps -a
to see all containers

7. docker rm <container_id>
to remove docker container

8. docker rmi hello-world (name of image)
delete the image which is pulled
rmi - remove image

9. if we want to run an image which is using some server to run
docker run -d --name mywebsite -p 80:80 docker/getting-started

- run command is going to create container
- -d means run in a detached mode means run in background
- --name :- gives the name of conatiner, it will give some random name if not explicitly given
- -p 80:80 :- configure port- first port: host port(your system port), second port: container port(used by docker engine internally)
- docker/getting-started: name of image which you want to run in a container
- first port can be anything
- but second port should be specific to the image we are running

10. To delete the container in running state.
first stop the container then remove it

docker stop mywebsite
docker rm mywebsite

11. docker rm mywebsite -f
it'll forcefully stop and remove the container
but it's not suggested

12. docker pull mysql
if you don't have mysql installed but wanna use it

13. docker run --name mysql-server -e MYSQL_ROOT_PASSWORD=12345678 -d mysql
running mysql in container

14. docker exec -it mysql-server mysql -u root -p
It is used to access the MySQL server running inside a Docker container. we are getting into the conatiner to access the database.
now here we can run mysql code.

15. after doing everything on vs-code
go to the folder using cd and run
docker build -t sample-website 

16. docker images

17. docker run -d --name webapp -p 80:80 sample-website
