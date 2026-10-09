plugins {
    java
}

group = "com.example"
version = "1.0.0-SNAPSHOT"

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter:5.10.2")
}

tasks.withType<Test> {
    useJUnitPlatform()
    filter {
        isFailOnNoMatchingTests = false
    }
    val agent = System.getProperty("HARNESS_JAVA_AGENT") ?: System.getenv("JAVA_TOOL_OPTIONS")
    if (!agent.isNullOrBlank()) {
        jvmArgs(agent.split(" ").filter { it.isNotBlank() })
    }
}
