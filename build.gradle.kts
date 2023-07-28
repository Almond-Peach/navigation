group = "com.almondpeach"

plugins {
    // version catalog update
    alias(libs.plugins.benmanes.versions) apply false
    alias(libs.plugins.littlerobots.version.catalog.update) apply false
    id("com.almondpeach.version.catalog.update")
    // git config
    id("com.almondpeach.git.config")
    // ktlint
    id("com.almondpeach.ktlint")
    // detekt
    alias(libs.plugins.arturbosch.detekt) apply false
    id("com.almondpeach.detekt")
    // android
    alias(libs.plugins.android.application) apply false
    // kotlin
    alias(libs.plugins.jetbrains.kotlin.android) apply false
}
