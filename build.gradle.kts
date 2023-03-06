plugins {
    kotlin("jvm") version "1.8.0"
    id("org.openapi.generator") version "6.4.0"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(8)
}

openApiGenerate {
    inputSpec = "$rootDir/openapi.yaml".toString()
    configFile = "$rootDir/openapitools.json".toString()

}