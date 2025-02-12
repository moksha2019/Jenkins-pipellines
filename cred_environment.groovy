//pipeline for  defining the environemnt variables(username and passwd)
pipeline{
    agent any
    stages {
        stage ('testing the  creds'){
            environemnt{
                GITHUB_CREDENTIALS = credentils('git_creds')
            }
            steps{
                echo "username  is : ${GITHUB_CREDENTIALS_USR}"
                echo "password is: ${GITHUB_CREDENTIALS_PSW}"
               // docker  login -u GITHUB_CREDENTIALS_USR -p GITHUB_CREDENTIALS_PSW
            }
        }
    }
}
