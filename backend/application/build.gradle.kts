plugins {
    alias(libs.plugins.kotlinJvm)
}

dependencies {

    //=== Test ===
    //Kotest
    testImplementation(libs.kotest.junit)
}

tasks.withType<Test>().configureEach {
    useJUnitPlatform()
}