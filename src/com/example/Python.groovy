#! /usr/bin/env groovy

package com.example

class Python implements Serializable {
    def script
    Python(script){
        this.script=script
    }

    def buildVirtualEnv()
    {
        script.sh "python3 -m venv env"
        script.sh ". env/bin/activate"
    }
    def installDependencies()
    {
        script.sh "pip3 install -r requirements.txt"
    }
    def lintCheck()
    {
        script.sh "flake8 ."
    }
    def pytestCheck()
    {
        script.sh "pytest ."
    }
    def IncrementVersion(String type)
    {
        script.sh "python3 utils/versioner.py --$type"
    }
}