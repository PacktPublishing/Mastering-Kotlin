plugins {
    id("com.android.application")
    id("kotlin-android")
    id("kotlin-android-extensions")
}

dependencies {

    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk7:1.3.31")

    implementation("androidx.legacy:legacy-support-v4:1.0.0")
    implementation("androidx.appcompat:appcompat:1.0.2")
    implementation("androidx.constraintlayout:constraintlayout:1.1.3")

    implementation(Deps.Android.Ktx.core)
    implementation(Deps.Android.Ktx.fragment)
}


android {
    compileSdkVersion(29)
    defaultConfig {
        applicationId = "com.goobar.hellokotlin"
        minSdkVersion(21)
        targetSdkVersion(29)
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

androidExtensions {
    isExperimental = true
}
