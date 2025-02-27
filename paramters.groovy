pipeline {
    agent any
    parameters {
        string{string(name: 'Enter your name ', defaultValue: 'gnana', description: 'enter the  user name:')}
    }
    stages {
        stage () {
            steps {
                echo "welcome ${params.Enter your name }" // params.key 
            }
        }
    }
}
