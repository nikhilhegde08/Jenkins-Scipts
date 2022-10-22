pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building'
                sh encoding: 'UTF-8', returnStdout: true, script: 'python3 main.py'
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
