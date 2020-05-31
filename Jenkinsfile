pipeline {
  agent any
  stages {
    stage('Firefox tests') {
      steps {
        sh 'xvfb-run mvn test -Dwebdriver.gecko.driver=${JENKINS_HOME}/selenium-drivers/geckodriver'
      }
    }

  }
}