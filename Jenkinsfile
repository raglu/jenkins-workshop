node {
   stage('Preperation'){
       git credentialsId: 'raglu', url: 'git@github.com:raglu/jenkins-workshop.git'
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