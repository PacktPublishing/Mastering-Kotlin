// Top-level build file where you can add configuration options common to all sub-projects/modules.

buildscript {
    repositories {
        google()
        jcenter()
    }

    dependencies {
        classpath(Deps.Android.Tools.androidGradle)
        classpath (Deps.Kotlin.gradlePlugin)
        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
}

allprojects {
    repositories {
        google()
        jcenter()
        
    }
}

task(name = "clean", type = Delete::class) {
    delete(rootProject.buildDir)
}
