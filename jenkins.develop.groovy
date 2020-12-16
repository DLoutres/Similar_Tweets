def build_app(){
  bat 'docker-compose up -d'
}

def test_app(){
  bat 'py test_app.py'
}

def down_app(){
  bat 'docker-compose down'
}

def release_app(){
  echo 'branch into release'
}

def live_app(){
}

return this

/*def build_app(){
  bat 'C:/Users/Daija/AppData/Local/Programs/Python/Python39/python.exe -m pip install -r requirements.txt'
}

def test_app(){
  bat 'C:/Users/Daija/AppData/Local/Programs/Python/Python39/python.exe test_app.py'
}

def down_app(){
  
}

def release_app(){
  echo 'branch into release 1'
}

def live_app(){
}

return this*/
