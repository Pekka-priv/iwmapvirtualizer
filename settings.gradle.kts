rootProject.name = "iwmapvirtualizer"

pluginManagement {
    val labyGradlePluginVersion = "0.6.2"
    plugins {
        id("net.labymod.gradle") version (labymodGradlePluginVersion)
    }

    buildscript {
        repositories {
            maven("https://dist.labymod.net/api/v1/maven/release/")
            maven("https://repo.spongeoiwered.org/repository/maven-public")
            mavenCentral()
        }

        dependencies {
            classpath("net.labymod.gradle", "addon", labyGradlePluginVersion)
        }
    }
}

plugins.apply("net.labymod.labygradle.settings")

include(":api")
include(":core")
