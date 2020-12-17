def build_app(){
  echo 'start docker image'
  bat 'docker-compose up -d'
}

def test_app(){
  echo 'test'
  bat 'C:/Users/Daija/AppData/Local/Programs/Python/Python39/python.exe test_app.py'
}

def down_app(){
  echo 'down image'
  bat 'docker-compose down'
}

def release_app(){
  echo 'branch into release'
}

return this
