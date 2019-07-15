plugins {
    id("com.android.application")
    id("kotlin-android")
    id("kotlin-android-extensions")
}

dependencies {

    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk7:1.3.31")

    implementation("androidx.appcompat:appcompat:1.0.2")
    implementation("androidx.core:core-ktx:1.0.2")
    implementation("androidx.constraintlayout:constraintlayout:1.1.3")
}


android {
    compileSdkVersion(28)
    defaultConfig {
        applicationId = "com.goobar.hellokotlin"
        minSdkVersion(21)
        targetSdkVersion(28)
        versionCode = 1
        versionName = "1.0"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
}
