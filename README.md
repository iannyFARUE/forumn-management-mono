# forum-management-mono
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
### Modules
Convert the following maven modules to java modules as well by adding module-info.java files

1. security core module (have the core apis only)
2. security-impl module
3. api module
4. persistence module
5. Utility module


### Exception handling
1. Handle the exception in main correctly by only catching BusinessException
2. Fix the code in the math utility so that the tests pass
3. Use the validator module to validate the email input in the user service and handle the thrown exception with an error message

### Annotations
1. Deprecate the v1 email validator method