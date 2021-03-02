pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                sh 'mvn clean package'
            }
	}
	stage('test') {
	    steps {
		measure VMs: 2, iterations: 2
	    }
	}
    }
}
