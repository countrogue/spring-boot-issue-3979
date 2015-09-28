## spring-boot-issue-3979
This is a sample project that demonstrate the issue [Spring-boot-Issue-3979](https://github.com/spring-projects/spring-boot/issues/3979)

Steps to reproduce the issue:

1.  Run the project using mvn spring-boot:run
2.  Run the following in the command line
```
curl -X POST "Content-Type: application/json"  --header "Accept: application/json"  -d "{\"id\":123, \"name\":\"Car\", \"Chassis\":\"MyChassis\"}" "http://localhost:8080/api/car"
```