# CI/CD, Jenkins

1. CI/CD- continuous integration and continuous deployment/delivery

2. ci/cd steps:-

- code
- build
- test 
- depoy

----------------------------------------------------------------------------

Devsecops- devops+high level of security
 
 -------------------------------------------

with jenkins, we can build pipelines, can schedule jobs, can create plugins 

--------------------------------------------------------------------

#### working on jenkins-
steps:
1. sudo apt update
sudo apt install fontconfig openjdk-17-jre
java -version
openjdk version "17.0.13" 2024-10-15
OpenJDK Runtime Environment (build 17.0.13+11-Debian-2)
OpenJDK 64-Bit Server VM (build 17.0.13+11-Debian-2, mixed mode, sharing)

(run all these steps at once for installing java)

2. java -version

3. sudo wget -O /usr/share/keyrings/jenkins-keyring.asc \
  https://pkg.jenkins.io/debian-stable/jenkins.io-2023.key
echo "deb [signed-by=/usr/share/keyrings/jenkins-keyring.asc]" \
  https://pkg.jenkins.io/debian-stable binary/ | sudo tee \
  /etc/apt/sources.list.d/jenkins.list > /dev/null
sudo apt-get update
sudo apt-get install jenkins

(for installing jenkins)

4. sudo systemctl enable jenkins

5. sudo systemctl start jenkins

6. sudo systemctl status jenkins

7. sudo apt install nginx -y

8. 

--------------------------------------
- to start jenkins

java -jar jenkins.war 
then go to localhost:8080