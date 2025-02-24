# JENKINS ASSIGNMENT

## Step 1: Start Jenkins
First, download the Jenkins .war file and launch Jenkins with the following command:

``` java -jar jenkins.war ```

By default, Jenkins will be available on port 8080. Open your browser and navigate to:
```http://localhost:8080```


## Step 2: Create a New Jenkins Job
Once Jenkins is up and running:
![alt text](<Screenshot 2025-02-24 225719.png>)
Click on New Item in the Jenkins dashboard.
Enter a name for your job and select Pipeline as the project type.
Click OK to create the job.

 ## Step 3: Configure the Jenkins Job
 After creating the job, configure it by:
 ![alt text](<Screenshot 2025-02-24 225841.png>) ![alt text](<Screenshot 2025-02-24 225853.png>)![alt text](<Screenshot 2025-02-24 225902.png>)
- Selecting Git as the source code management tool.
- Entering the repository URL and branch name.
- Defining build triggers, such as "Build when a change is pushed to GitHub."
- Adding a Pipeline script from SCM option to define the pipeline steps.

## Step 4: Define the CI/CD Pipeline Script

Use the following Jenkinsfile to automate the build, test, packaging, containerization, and deployment processes:

 ```
 pipeline {
    agent any

    stages {
        stage('Clone Repository') {
            steps {
                git branch: 'main', url: 'https://github.com/example-user/springboot-app.git'
                echo 'Repository cloned successfully'
            }
        }

        stage('Build Application') {
            steps {
                bat "./mvnw clean compile"
                echo 'Application compiled successfully'
            }
        }

        stage('Run Tests') {
            steps {
                bat "./mvnw test"
                echo 'Tests executed successfully'
            }
        }

        stage('Create JAR File') {
            steps {
                bat "./mvnw package"
                echo 'Application packaged successfully'
            }
        }

        stage('Build Docker Image') {
            steps {
                bat "docker build -t spring-app ."
                echo 'Docker image created successfully'
            }
        }

        stage('Deploy Application') {
            steps {
                script {
                    def existingContainer = bat(script: 'docker ps -aq -f name=springboot-container', returnStdout: true).trim()

                    if (existingContainer) {
                        echo 'Stopping and removing existing container...'
                        bat(script: 'docker stop springboot-container', returnStatus: true)
                        bat(script: 'docker rm springboot-container', returnStatus: true)
                    }

                    bat "docker run -d --name springboot-container -p 9095:8080 spring-app"
                    echo 'Application deployed successfully'
                }
            }
        }
    }
}

```

## Step 5: Execute the Jenkins Job
Once the pipeline is configured, trigger the job manually or let Jenkins detect changes in the repository and start a new build.
![alt text](<Screenshot 2025-02-24 230223.png>)
![alt text](<Screenshot 2025-02-24 230230.png>) 

## Step 6: Verify Running Containers
```docker ps ```
![alt text](<Screenshot 2025-02-24 230313.png>)
You should see a running container named springboot-container.

## Step 7: Access the Deployed Application
The Spring Boot application will be accessible at:

```http://localhost:9095```

![alt text](<Screenshot 2025-02-24 230622.png>)


To test an API endpoint:
```http://localhost:9095/api/products/1234```
![alt text](<Screenshot 2025-02-24 230638.png>)

## Step 8: Automatic Build on Code Changes
Jenkins will automatically trigger a new build whenever changes are pushed to the repository. The pipeline will rebuild, test, and deploy the updated application.

### Build before changes
![alt text](<Screenshot 2025-02-24 230738.png>)
![alt text](<Screenshot 2025-02-24 230746.png>)

### Build after changes
![alt text](<Screenshot 2025-02-24 230753.png>) ![alt text](<Screenshot 2025-02-24 230759.png>)

