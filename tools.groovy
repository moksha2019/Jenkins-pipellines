// tools  can be implemented  on under pipeline or stage
pipeline{
    agent any
    tools {
        maven 'Maven_new' // this  package  path should be added to tools in the jenkins first
    }
    stages {
        stage("build  now "){
            steps{
                echo "Displaying the  maven version: "
                sh 'mvn --version'
            }
        }
        stage('specific  version'){
            tools{
                jdk 'java-new' //different  version of java
            }
            steps{
                sh 'mvn --version'
            }
        }
    }
}
