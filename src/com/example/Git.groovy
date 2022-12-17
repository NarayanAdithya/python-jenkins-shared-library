#! /usr/bin/env groovy

package com.example

class Git implements Serializable {
    def script
    Git(script){
        this.script=script
    }
    def makeVersionCommit(String repo_name){
        script.sh "git config user.email jenkins@adithyanarayan.com"
        script.sh "git config user.name jenkins"
        script.sh "git add ."
        script.sh 'git commit -m "Jenkins-CI: Update Version"'
        script.withCredentials([script.usernamePassword(credentialsId:'jenkins-github', passwordVariable: 'PASS', usernameVariable: 'USER')]){
            script.sh """git push https://${script.USER}:${script.PASS}@github.com/${script.USER}/${repo_name}.git HEAD:${script.BRANCH_NAME}"""
        }
    }
}