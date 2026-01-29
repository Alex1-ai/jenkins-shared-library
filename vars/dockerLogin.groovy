#!/usr/bin/env groovy

import com.chidi.Docker


def call(){

    return new Docker(this).dockerLogin();
}