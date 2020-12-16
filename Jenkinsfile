pipeline {
  agent any
  stages {
    stage('Build Scripe') {
      steps {
        script {
          def filename = 'jenkins.' + env.BRANCH_NAME + '.groovy'
          groovyfile = load filename
        }

      }
    }

    stage('Build Flask app') {
      agent any
      steps {
        script {
          groovyfile.build_app()
        }

      }
    }

    stage('Testing') {
      steps {
        script {
          groovyfile.test_app()
        }

      }
    }

    stage('Docker images down') {
      steps {
        script {
          groovyfile.down_app()
        }

      }
    }

    stage('creating release branch') {
      steps {
        script {
          groovyfile.release_app()
        }

      }
    }

  }
}