// pipeline  using  when  condition
//  when  is used when we need to deploy on conditional based
pipeline {
    agent any
    environemnt {
        DEPLOY_TO = 'production'
    }
    stages {
        stage ('whenstage'){
            when {
                environemnt name : 'DEPLOY_TO', value: 'production'
            }
            steps {
                echo "Executing  the  prod  deploy"
            }
        }
    }
}
