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
    }

    post {
        success {
            archiveArtifacts artifacts: '**/target/*.jar', fingerprint: true
        }
        failure {
            echo 'La construcción falló'
        }
    }
nexusPolicyEvaluation advancedProperties: '', enableDebugLogging: false, failBuildOnNetworkError: false, failBuildOnScanningErrors: false, iqApplication: selectedApplication('JavaTestApp1'), iqInstanceId: 'local', iqOrganization: '2f808db994f547708bd0b75e6679ece7', iqStage: 'build', jobCredentialsId: '', reachability: [failOnError: false, java: [options: [], properties: [], tool: ''], javaAnalysis: [algorithm: 'RTA_PLUS', enable: false, entrypointStrategy: 'ACCESSIBLE_CONCRETE', force: false]], unstableBuildOnScanningWarnings: false
}
