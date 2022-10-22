pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building'
                sh encoding: 'UTF-8', returnStdout: true, script: '/usr/bin/python3 main.py'
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
