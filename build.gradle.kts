plugins {
    application
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {

        testImplementation("org.seleniumhq.selenium:selenium-java:4.21.0")
        testImplementation("org.testng:testng:7.10.2")


}

application {
    mainClass.set("org.example.Main")
}


tasks.test {
    useTestNG()
}