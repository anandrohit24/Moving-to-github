pipeline {
    agent any

    stages {

        stage('Build') {
            steps {
                bat 'mvn clean compile'
            }
        }

        stage('Run Tests') {
            steps {
                bat 'mvn test'
            }
        }

        stage('Generate Report') {
            steps {
                echo 'Test execution completed'
            }
        }
    }

    post {
        always {
            echo 'Publishing test results...'
            junit '**/target/surefire-reports/*.xml'
        }

        success {
            echo 'Build and test execution successful!'
        }

        failure {
            echo 'Build or test execution failed!'
        }
    }
}