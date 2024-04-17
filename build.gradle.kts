// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.androidApplication) apply false
}

buildscript{
    repositories{
        google()
        mavenCentral()
    }
    dependencies{
        classpath("io.realm:realm-gradle-plugin:10.11.1")
    }
}
