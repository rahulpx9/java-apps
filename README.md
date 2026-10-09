# java-apps

Monorepo folder containing two **independent** Gradle projects (no shared root build):

| Directory    | Description                          |
|--------------|--------------------------------------|
| `greeter/`   | Simple greeting helper + CLI entry   |
| `calculator/`| Basic integer math operations        |

Each project has its own `build.gradle.kts`, Gradle Wrapper, and tests.

## Build and test

```bash
cd greeter && ./gradlew test
cd calculator && ./gradlew test
```

Run the greeter CLI:

```bash
cd greeter
./gradlew run --args="YourName"
```
