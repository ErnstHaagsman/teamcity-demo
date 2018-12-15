package patches.buildTypes

import jetbrains.buildServer.configs.kotlin.v2018_1.*
import jetbrains.buildServer.configs.kotlin.v2018_1.ui.*

/*
This patch script was generated by TeamCity on settings change in UI.
To apply the patch, change the buildType with id = 'Backend_DockerImage'
accordingly, and delete the patch script.
*/
changeBuildType(RelativeId("Backend_DockerImage")) {
    check(paused == false) {
        "Unexpected paused: '$paused'"
    }
    paused = true
}
