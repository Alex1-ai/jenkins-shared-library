#!/usr/bin/env groovy

import com.chidi.Docker

def call() {
    def docker = new Docker(this)
    docker.dockerLogin()
}
