package com.github.mardorz.nugetpackageversionupdater.services

import com.intellij.openapi.project.Project
import com.github.mardorz.nugetpackageversionupdater.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
