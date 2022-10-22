pipeline {
    agent any

    
    stage('Setup Parameters') {
        steps {
            properties([parameters([string(defaultValue: 'DEV', description: 'Environment Type', name: 'ENVIRONMENT', trim: true)])])
        }
    }    
    stages {
        stage('Build') {
            steps {
                echo 'Building'
                sh encoding: 'UTF-8', returnStdout: true, script: '''chmod 777 main.sh;
./main.sh params.ENVIRONMENT'''
            }
        }
        stage('Test') {
            steps {
                echo 'Testing'
            }
        }

    }
}
