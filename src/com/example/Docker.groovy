#! /usr/bin/env groovy

package com.example

class Docker implements Serializable {
    def script

    Docker(script){
        this.script = script
    }
    def buildDockerImage(){
        script.withCredentials([script.usernamePassword(credentialsId:'dockerhub-adina', passwordVariable: 'PASS', usernameVariable: 'USER')]){
            def matcher = script.readFile('version.toml') =~ ".\..\.."
            script.echo "$matcher"
        }
    }
}