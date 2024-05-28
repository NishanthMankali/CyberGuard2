// Root-level build.gradle.kts
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.jetbrains.kotlin.android) apply false
}

allprojects {
    repositories {
        google()
        mavenCentral()
    }
}
