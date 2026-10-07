# java-apps

Monorepo folder containing two **independent** Maven projects (no shared parent POM):

| Directory    | Description                          |
|--------------|--------------------------------------|
| `greeter/`   | Simple greeting helper + CLI entry   |
| `calculator/`| Basic integer math operations        |

Each project has its own `pom.xml`, build, and tests.

## Build and test

```bash
cd greeter && mvn test
cd calculator && mvn test
```

Run the greeter CLI:

```bash
cd greeter
mvn exec:java -Dexec.mainClass=com.example.greeter.Main -Dexec.args="YourName"
```
