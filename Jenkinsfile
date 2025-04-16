pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                // Se asume que el repositorio Git contiene el código fuente
                checkout scm
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Package') {
            steps {
                sh 'mvn package'
            }
        }

        stage('Evaluate') {
            steps {
                nexusPolicyEvaluation advancedProperties: '', enableDebugLogging: false, failBuildOnNetworkError: false, failBuildOnScanningErrors: false, 
                    iqApplication: selectedApplication'JavaTestApp1', iqStage: 'build', 
                    reachability: [
                        javaAnalysis: [enable: true]
                    ]
            }
        }
    }

    post {
        success {
            archiveArtifacts artifacts: '**/target/*.jar', fingerprint: true
        }
        failure {
            echo 'The build failed.'
        }
    }
}
