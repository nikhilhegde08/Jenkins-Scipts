pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building'
                sh encoding: 'UTF-8', returnStdout: true, script: '''chmod 777 main.sh;
./main.sh'''
            }
        }
        stage('Test') {
            steps {
                echo 'Testing'
            }
        }
        stage('Release') {
            steps {
                echo 'Releasing'
            }
        }
    }
}
