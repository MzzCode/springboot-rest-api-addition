# springboot-rest-api-addition
A simple Spring Boot REST API that accepts two numbers and returns their sum. Demonstrates basic REST controller, request/response mapping, and POST API handling

This project is a basic Spring Boot REST API that accepts two numbers in a POST request and returns their sum.
It demonstrates how to create simple controllers, handle JSON request/response bodies, and build REST endpoints.

Features

POST API: /MyApi/Add

Accepts JSON request with num1 and num2

Returns response containing:

num1

num2

sum (addition result)

Project Structure

src/main/java/com/myproject/restapi/
│
├── controller/
│   └── MyController.java
│
└── pojo/
    ├── AddRequest.java
    └── AddResponse.java

API Endpoint
POST /MyApi/Add
Request Body
Json
{
  "num1": 10,
  "num2": 20
}

Response
{
  "num1": 10,
  "num2": 20,
  "sum": 30
}
Run using Maven Build:
clean spring-boot:run

Testing in Postman

Set Method: POST

URL: http://localhost:9090/MyApi/Add

Body → raw → JSON
