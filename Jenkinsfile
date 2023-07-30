pipeline {
    agent any
    tools{
        maven 'MAVEN_HOME'
    }
    stages{
        stage('Build Maven'){
            steps{
                checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/fjpiedade/devops-jenkins-docker']])
                sh 'mvn clean install'
            }
        }
        stage('Build Docker Image from Dockerfile'){
            steps{
                script{
                    sh 'docker build -t fjpiedade/devops-jenkins-docker .'
                }
            }
        }
        stage('Push Docker Image to DockerHub'){
            steps{
                script{
                    withCredentials([string(credentialsId: 'dockerhubpwd', variable: 'dockerhubpwd')]) {
                        // some block
                        sh 'docker login -u fjpiedade -p ${dockerhubpwd}'
                    }
                    sh 'docker push fjpiedade/devops-jenkins-docker'
                }
            }
        }
    }
}