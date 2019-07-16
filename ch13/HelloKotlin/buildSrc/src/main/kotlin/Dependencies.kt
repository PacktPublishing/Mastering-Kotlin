object Deps {
    object Kotlin {
        private const val version = "1.3.31"

        const val gradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:$version"
    }

    object Android {
        object Tools {
            const val androidGradle = "com.android.tools.build:gradle:3.5.0-beta04"
        }

        object Ktx {
            const val core = "androidx.core:core-ktx:1.0.1"
            const val fragment = "androidx.fragment:fragment-ktx:1.1.0-rc01"
        }
    }
}