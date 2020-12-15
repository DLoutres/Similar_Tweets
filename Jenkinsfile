pipeline {
  agent { docker { image 'python:3.7.2' } }
  stages {
    stage('build') {
      steps {
	echo 'Start building'
        sh 'pip install -r requirements.txt'
      }
    }
    stage('test') {
      parallel {
        stage('test') {
          steps {
            sh 'git checkout feature'		
            sh 'python test.py'
          }
        }
        stage('Stress_test') {
          steps {
            sh 'git checkout release'
            sh 'python stress_test_app.py'
          }
	}
	stage('push to develop') {
    	  steps {
            sh 'git commit -m 'merged to develop''
            sh 'git push origin develop'
          }
        }
      }
    }
    stage('End') {
      steps {
        echo 'Finish'
      }
    }
  }
}

    stage('End') {
      steps {
        echo 'Finish'
      }
    }

  }
}
