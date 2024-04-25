rootProject.name = "depression-dial"
enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

pluginManagement {
    repositories {
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
        google()
        gradlePluginPortal()
        mavenCentral()
    }
    plugins {
        kotlin("jvm") version "1.9.23"
    }
}
plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.5.0"
}


dependencyResolutionManagement {
    @Suppress("UnstableApiUsage")
    repositories {
        google()
        mavenCentral()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    }
}

include(":backend:adapter:in:web")
include(":backend:adapter:out:persistence")

include(":backend:application")

include(":backend:bootstrap")
include(":backend:bootstrap:di")
include(":backend:bootstrap:transaction")

include(":backend:bootstrap:server")

include(":backend:bootstrap:android")
include(":backend:bootstrap:common")
include(":backend:bootstrap:desktop")
include(":backend:bootstrap:ios")
include(":backend:bootstrap:web")

include(":frontend:android")
include(":frontend:common")
include(":frontend:desktop")
include(":frontend:ios")
include(":frontend:web")