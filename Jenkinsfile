pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                javac Hello_World.java
            }
        }
        stage('Run') {
            steps {
                java Hello_World
            }
        }
    }
}
