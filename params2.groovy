pipeline {
    agent any
    parameters {
        string(name: 'change_ticket', defaultValue: '*****', description: 'Enter the change number:'
        booleanParam(name: 'Is sre spproved?', defaultValue: true, description: '')
        choice(name: 'SELECT_ENV', choices: ['STAGE', 'DEV', 'PROD'], description: 'enter the environment as per your choice')
        password(name: 'PASSWORD', defaultValue: '', description: 'Enter secret password')
        credentils(name: 'my_creds', description: 'My docker credentials:', required: true)
    }
    stages {
        stage ('build') {
            steps {
                echo "your change  tocket number is: ${change_ticket} is validated"
                echo "deploy to ${SELECT_ENV}"
                echo "your password is: ${PASSWORD}"
                echo "your  credentials are ${my_creds}"
            }
        }
    }
}
