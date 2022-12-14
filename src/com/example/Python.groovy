#! /usr/bin/env groovy

package com.example

class Python implements Serializable {
    def script
    Python(script){
        this.script=script
        this.version=script.BRANCH_NAME
    }

    def buildVirtualEnv()
    {
        script.sh "python3 -m venv env"
    }
    def activateEnv()
    {
        script.sh ". env/bin/activate"
    }
    def installDependencies()
    {
        script.sh "pip3 install -r devrequirements.txt"
    }
    def lintCheck()
    {
        script.sh "python3 -m flake8 ."
    }
    def pytestCheck()
    {
        script.sh "python3 -m pytest ."
    }
    def IncrementVersion()
    {
        script.echo "${script.BRANCH_NAME}"
        script.sh "python3 utils/versioner.py --${script.BRANCH_NAME}"
    }
}