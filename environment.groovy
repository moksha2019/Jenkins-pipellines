// pipelines  defining the  environemnt variables
pipeline{
    agent any
    environment{
        course = "docker  and  kubernetes"
        name = "prasad"
    }
    stages {
        stage("First phase"){
            environemnt{
                name = "awesome"
                course = "AWS"
            }
            steps{
                echo "Hello welcome to ${course}"
                echo "welcome to my world ${name} !!!"
            }
        }
        stage("using global credentils"){
            steps{
                echo "hello  welcome  to ${course}"
                echo "welcome to my world ${name} !!"
            }
        }
    }
}
