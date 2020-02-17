node {
   stage('Preparation') {
      git 'https://github.com/katieburke1/SimpleWebApp.git'
   }
   stage('Build') {
      sh "./gradlew clean test"
   }
}