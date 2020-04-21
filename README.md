# CS-5213-Exam-Group1
- This repository is configured with GitHub actions to test code pushed to the repo. Code is in Java and tested using JUnit 4. Apache Maven is used to help test the code.
- There are 3 actions configured:
1. GitHub hosted Ubuntu runner
2. Google Cloud Platform (GCP) Virtual Machine
3. Docker running on GCP
- This is for Group 1, Jay McKinley and Patrick Zhong.

Instructions:
Github Hosted Maven:

-Reference: https://help.github.com/en/actions/language-and-framework-guides/building-and-testing-java-with-maven

Running on GCP:
1. Create an Ubuntu 18.04 VM on GCP and install Maven using 'sudo apt install maven'.
2. Follow instructions here to add a GCP VM: https://help.github.com/en/actions/hosting-your-own-runners/adding-self-hosted-runners. Run the application.
3. Copy the .yml file from the section 'Github hosted Maven'. Change the line 'runs-on: ubuntu-latest' to 'runs-on: self-hosted'. This makes your GCP VM run the actions.
4. Your .yml file should like .github/workflows/mavenGCP.yml
OPTIONAL. You can configure the runner application as a service, see second reference below.
Reference: 
- https://help.github.com/en/actions/hosting-your-own-runners/about-self-hosted-runners
- https://help.github.com/en/actions/hosting-your-own-runners/configuring-the-self-hosted-runner-application-as-a-service

Docker GCP:
1. Install Docker on your VM. See: https://docs.docker.com/engine/install/ubuntu/
2. Copy the .yml file from the section 'Running on GCP'.
3. Change the line '- name: Build with Maven' to '- name: Docker build'
4. Change the line 'run: mvn -B package --file "exam/pom.xml"' to 'run: docker build -t demo .'
5. Your .yml should now look like .github/workflows/mavenDockerGCP.yml
4. Add a Dockerfile to the project with these contents, changing 'exam' to the name of your maven project:
FROM maven:3.6.0-jdk-11-slim AS build
COPY exam/src /home/app/src
COPY exam/pom.xml /home/app
RUN mvn -f /home/app/pom.xml test

Reference:
- https://hub.docker.com/_/maven
- https://docs.docker.com/engine/reference/builder/
