# spring-boot-issue-3979
This is a sample project that demonstrate the issue Spring-boot #3979


Steps to reproduce the issue
1. Run the project
2. run the following
curl -X POST "Content-Type: application/json"  --header "Accept: application/json"  -d "{\"id\":123, \"name\":\"Car\", \"Chassis\":\"MyChassis\"}" "http://localhost:8080/api/car"