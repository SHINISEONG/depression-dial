plugins {
    alias(libs.plugins.kotlinJvm)
}

dependencies {
    testImplementation(libs.kotest.junit)
}

tasks.withType<Test>().configureEach {
    useJUnitPlatform()
}