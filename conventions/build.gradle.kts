group = "com.almondpeach"

plugins { `kotlin-dsl` }

private val javaVersion = JavaVersion.VERSION_17

kotlin { jvmToolchain(javaVersion.majorVersion.toInt()) }

java {
    sourceCompatibility = javaVersion
    targetCompatibility = javaVersion
}

gradlePlugin {
    plugins {
        fun registerPlugin(name: String): NamedDomainObjectProvider<PluginDeclaration> =
            register(name) {
                id = "$group.$name"
                val camelCaseName = name.split(".").joinToString("") { it.replaceFirstChar(Char::uppercaseChar) }
                implementationClass = "$group.${project.name}.plugins.$camelCaseName"
            }
        registerPlugin("version.catalog.update")
        registerPlugin("git.config")
        registerPlugin("ktlint")
        registerPlugin("detekt")
    }
}

dependencies {
    compileOnly(libs.arturbosch.detekt.gradle.plugin)
    compileOnly(libs.benmanes.versions.gradle.plugin)
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>()
    .configureEach { kotlinOptions { jvmTarget = javaVersion.majorVersion } }
