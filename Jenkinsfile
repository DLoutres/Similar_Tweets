pipeline {
  agent any

  stages {
    stage('Install requirements') {
      steps {
        powershell 'C:/Users/Daija/AppData/Local/Programs/Python/Python39/python.exe -m pip install -r requirements.txt'
      }
    }

    stage('run test_app') {
      when {
        branch 'feature'
      }
      steps {
        powershell 'C:/Users/Daija/AppData/Local/Programs/Python/Python39/python.exe test_app.py'
      }
    }

    stage('Run stress test') {
      when {
        branch 'develop'
      }

      steps {
        powershell 'C:/Users/Daija/AppData/Local/Programs/Python/Python39/python.exe test_stress.py'
      }
    }

    stage('Push on release') {
      when {
        branch 'develop'
      }

      steps {
        powershell 'git fetch --all'
        powershell 'git checkout -B develop'
        powershell 'git pull origin develop'
        powershell 'git checkout -B release'
        powershell 'git pull origin release'
        powershell 'git merge develop'
        powershell 'git push --set-upstream origin release'
      }
    }

    stage('Push on main') {
      when {
        branch 'release'
      }

      steps {
        input 'are you sur to put in production?'
        powershell 'git fetch --all'
        powershell 'git checkout -B release'
        powershell 'git pull origin release'
        powershell 'git checkout -B main'
        powershell 'git pull origin main'
        powershell 'git merge release'
        powershell 'git push --set-upstream origin main'


        echo "The application is now in production."
      }
    }
  }
}
