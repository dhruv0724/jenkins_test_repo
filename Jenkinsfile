pipeline {
         agent any
         stages {
         stage('Build'){
         steps{ input('build phase')}
         }
         stage('POST-Build'){
         steps { input('Want to proceed for testing')}
         }
         stage('Testing'){
         when{
                  not { branch "master"}
             }
          steps{ echo "Testing Done"}
          }
          stage('Deployment'){
          steps{ echo('Deployed Successfully')}
          }
         }
}
