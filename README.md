

# Student Analyzer - Unit Test Exercise

Bài tập kiểm thử với JUnit cho lớp `StudentAnalyzer`.

Project layout (Maven):

- `unit-test/pom.xml` - Maven project file (JUnit 5 dependency)
- `unit-test/src/main/java/com/example/StudentAnalyzer.java` - nguồn
- `unit-test/src/test/java/com/example/StudentAnalyzerTest.java` - các test

Run tests (requires Maven):

```bash
cd unit-test
mvn test
```
Notes:
- Methods validate scores by ignoring values < 0 or > 10.
- Empty or null lists return 0 (count or average).
>>>>>>> 5c97e8d3bec4ec05f9a8c9b683b59181d5771db4
