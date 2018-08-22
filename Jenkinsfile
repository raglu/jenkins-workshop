node {
   stage('Preperation'){
       git checkout scm
   }
   stage('Build'){
       sh 'mvn clean package'
   }
   stage('Results'){
       junit '**/target/surefire-reports/TEST-*.xml'
   }
   stage('Javadoc'){
       echo 'generating javadoc'
   }
}