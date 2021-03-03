pipeline {
    agent any
    stages {
	stage('test') {
	    steps {
		measure VMs: 2, iterations: 2, repetitions: 2
	    }
	}
    }
}
