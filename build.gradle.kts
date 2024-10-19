plugins {
    kotlin("multiplatform") version "2.0.21"
}

group = 'net.kingchev'
version = '1.0-SNAPSHOT'

repositories {
    mavenCentral()
}

dependencies {
    testImplementation 'org.jetbrains.kotlin:kotlin-test'
}

test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}