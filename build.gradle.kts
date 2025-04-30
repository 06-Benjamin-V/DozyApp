// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "8.10.0-alpha05" apply false
    id("com.google.gms.google-services") version "4.4.2" apply false
    id("org.sonarqube").version("4.4.1.3373")
}

sonarqube {
    properties {
        property("sonar.projectKey", "Dozy")
        property("sonar.host.url", "http://localhost:9000")
        property("sonar.login", "sqp_4c5a2b0332dac6abf735a99a2b454a2b51ff5085")
    }
}