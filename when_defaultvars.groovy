//pipeline  based on the default environment  variables
pipeline {
    agent any
    stages {
        stage ('Build  stage'){
            steps {
                echo "executing  the  build pipeline: "
            }
        }
        stage ('deploy stage'){
            when {
                // this stage should  trigger when we have  stage/production  barnch
                expression { BRANCH_NAME ==~ /(production|staging)/}
            }
            steps {
                echo "deploying to  production: "
            }
        }
    }
}
