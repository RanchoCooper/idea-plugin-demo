package com.github.ranchocooper.ideaplugindemo.services

import com.intellij.openapi.project.Project
import com.github.ranchocooper.ideaplugindemo.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
