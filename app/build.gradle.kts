plugins {
    // detekt
    id("com.almondpeach.detekt")
    // android
    alias(libs.plugins.android.application)
    // kotlin
    alias(libs.plugins.jetbrains.kotlin.android)
}

private val javaVersion = JavaVersion.VERSION_17

kotlin { jvmToolchain(javaVersion.majorVersion.toInt()) }

android {
    namespace = "${rootProject.group}.${rootProject.name}"
    compileSdk = 34
    defaultConfig {
        applicationId = "${rootProject.group}.${rootProject.name}"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "0.0.1"
    }
    sourceSets { getByName("main").kotlin.setSrcDirs(listOf("src/main/kotlin")) }
    kotlinOptions { jvmTarget = javaVersion.majorVersion }
    compileOptions {
        sourceCompatibility = javaVersion
        targetCompatibility = javaVersion
    }
    buildFeatures { compose = true }
    composeOptions { kotlinCompilerExtensionVersion = libs.versions.androidx.compose.compiler.get() }
}

dependencies {
    // core
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.core.splashscreen)
    // activity
    implementation(libs.androidx.activity.compose)
    // compose
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.compose.material3)
    implementation(libs.androidx.compose.ui.tooling.preview)
    debugImplementation(libs.androidx.compose.ui.tooling)
    // navigation
    implementation(libs.androidx.navigation.compose)
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>()
    .configureEach { kotlinOptions { jvmTarget = javaVersion.majorVersion } }
