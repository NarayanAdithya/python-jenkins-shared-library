#! /usr/bin/env groovy

package com.example

class Version implements Serializable{
    def version
    def script
    Version(script){
        this.script=script
    }
    def returnVersion(){
        def matcher = (script.readFile('version.toml') =~ ".\\..\\..")[0]
        this.version = matcher
        script.echo "${this.version}"
        return this.version
    }
}