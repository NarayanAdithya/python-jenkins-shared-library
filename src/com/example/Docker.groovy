#! /usr/bin/env groovy

package com.example

class Docker implements Serializable {
    def script
    Docker(script){
        this.script = script
    }
    def buildDockerImage(version){
       script.sh "docker build -t narayanadithya/pythone2e:${version}-${script.BUILD_NUMBER} ." 
    }
    def dockerLogin(){
        script.withCredentials([script.usernamePassword(credentialsId:'dockerhub-adina', passwordVariable: 'PASS', usernameVariable: 'USER')]){
            script.sh "echo $script.PASS | docker login -u $script.User --password-stdin"
        }
    }
    def dockerPush(version){
        script.sh "docker push narayanadithya/pythone2e:${version}-${script.BUILD_NUMBER}"
    }
}