#! /usr/bin/env groovy

package com.example

class Version implements Serializable{
    def version
    def script
    Version(script){
        this.script=script
    }
    def getVersion(){
        def matcher = script.readFile('version.toml') =~ ".\\..\\.."
        this.version = matcher[0]
        matcher = null
        script.echo "${this.version}"
        return this.version
    }
}