pipeline {
  agent any
  stages {
    stage('Firefox tests') {
      steps {
        sh 'xvfb-run mvn -f path/to/pom.xml clean test -Dwebdriver.gecko.driver=${DRIVERS_LOC}/geckodriver'
      }
    }

  }
}