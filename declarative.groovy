pipeline {
    agent any
    stages {
        stage('Pull') {
            steps {
                echo 'pull succeed'
            }
        }
        stage('Build') {
            steps {
                echo 'build is building'
            }
        }
        stage('Test') {
            steps {
                echo 'test is going well'
            }
        }
        stage('Deploy') {
            steps {
                echo 'yahooo!! application deployed successfully'
            }
        }
    }
}