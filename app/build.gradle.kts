plugins {
    application
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter:5.9.1")
    testImplementation("org.assertj:assertj-core:3.24.2")

    implementation("com.google.guava:guava:31.1-jre")
}

application {
    mainClass.set("ac.App")
}

tasks.named<Test>("test") {
    useJUnitPlatform()
}