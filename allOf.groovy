/ pipeline for  defining  allOf  condition
//if any one of the   condition is  getting  true  it  will  execute the   condition
pipeline {
    agent any
    stages {
        stage ('buiildphase') {
            steps {
                echo " executing  the  build  stage: "
            }
        }
        stage ('deploy stage'){
            when {
                allOf { // it  should  meet  all the  conditions  for proceeding on the deploy if  any condition fails  the   pipeline  will get failure
                    environemnt name: 'DEPLOY_TO', value: 'production'
                    expression { BRANCH_NAME ==~ /(production|staging)/} 
                }
            }
            steps {
                echo  "Deployed the application "
            }
        }
    }
}
