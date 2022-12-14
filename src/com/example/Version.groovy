#! /usr/bin/env groovy

package com.example

class Version implements Serializable{
    def version
    Version(script){
        this.script=script
    }
    def getVersion(){
        def matcher = script.readFile('version.toml') =~ ".\\..\\.."
        this.version = matcher[0]
        script.echo "${this.Version}"
        return this.version
    }
}