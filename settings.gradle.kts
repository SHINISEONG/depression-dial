rootProject.name = "depression-dial"
enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

pluginManagement {
    repositories {
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
        google()
        gradlePluginPortal()
        mavenCentral()
    }
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

include(":backend:bootstrap:di")
include(":backend:bootstrap:transaction")
include(":backend:bootstrap:server")

include(":frontend:composeApp")
include(":frontend:web")