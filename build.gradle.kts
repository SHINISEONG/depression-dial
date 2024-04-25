import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    //android
    alias(libs.plugins.androidApplication) apply false
    alias(libs.plugins.androidLibrary) apply false
    //compose
    alias(libs.plugins.jetbrainsCompose) apply false
    //kotlin
    alias(libs.plugins.kotlinJvm) apply false
    alias(libs.plugins.kotlinMultiplatform) apply false
    //spring
    alias(libs.plugins.springBoot) apply false
    alias(libs.plugins.springDependencyManagement) apply false
    alias(libs.plugins.kotlinSpring) apply false
}

group = "io.huiseong.depressionDial"
version = "0.0.1-SNAPSHOT"

//java {
//    sourceCompatibility = JavaVersion.VERSION_17
//}

repositories {
    mavenCentral()
}

//dependencies {
//    implementation(libs.r2dbc)
//    implementation(libs.webflux)
//    implementation(libs.jackson.kotlin)
//    implementation(libs.reactor.kotlin)
//    implementation(libs.kotlin.reflect)
//    implementation(libs.coroutines.reactor)
//    testImplementation(libs.spring.boot.test)
//    testImplementation(libs.reactor.test)
//}

//tasks.withType<KotlinCompile> {
//    kotlinOptions {
//        freeCompilerArgs += "-Xjsr305=strict"
//        jvmTarget = "17"
//    }
//}
//
//tasks.withType<Test> {
//    useJUnitPlatform()
//}
