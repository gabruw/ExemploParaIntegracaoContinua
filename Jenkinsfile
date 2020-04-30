pipeline {
    agent any
    stages {
        stage ('Build') {
            steps {
                bat 'mvn clean package -DskipTests=true'
            }
        }
        stage ('JUnit') {
            steps {
                bat 'mvn test'
            }
        }
        stage ('Sonar Analysis') {
            environment {
                scannerHome = tool 'SONAR_SCANNER'
            }
            steps {
                withSonarQubeEnv('SONAR_LOCAL'){
                    bat "${scannerHome}/bin/sonar-scanner -e -Dsonar.projectKey=Exemplo -Dsonar.host.url=http://localhost:9000 -Dsonar.login=5970cae7cb99e82cd6b89c0754dd505494bd0af8 -Dsonar.java.binaries=target -Dsonar.coverage.exclusions=**/.mvn/**,**/src/test/**,**/model/**,**Application.java"
                }
            }
        }
        stage ('Deploy Backend') {
            steps {
                deploy adapters: [tomcat8(credentialsId: 'tomcat_credentials', path: '', url: 'http://localhost:8001/')], contextPath: 'exemplo', war: 'target/exemplo.war'
            }
        }
        stage ('Health Check') {
            steps {
                dir ('functional-test') {
                    bat 'mvn verify -Dskip.surefire.tests'
                }
            }
        }
    }
}

