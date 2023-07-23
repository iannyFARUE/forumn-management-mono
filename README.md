# forumn-management-mono
Simple Forum Management System

### Build project
```
mvn clean install
```

### running project
```
 java -jar .\target\forumn-management-mono-1.0-SNAPSHOT.jar
```

## Practical Exercise 
Convert the monolith into a multi module using bottom up migration stratedy

Hints: split the project into 
1. security core module (have the core apis only)
2. security-impl module
3. api module
4. persistence module
