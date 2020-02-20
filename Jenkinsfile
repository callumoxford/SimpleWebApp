node {
   stage('Preparation') {
      git 'https://github.com/callumoxford/SimpleWebApp.git'
   }
   stage('Build') {
      sh "./gradlew clean test"
   }
   stage('Deploy'){
      sh "git push https://git.heroku.com/frozen-beach-16308.git master"
   }
}