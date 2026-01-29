#!/usr/bin/env groovy

import com.chidi.Docker


def call(String imageName) {

    return new Docker(this).dockerPush(imageName)
}



