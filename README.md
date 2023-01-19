# Coding Challenge

Used Java and Spring Boot implement the REST API.



##### Dataset overview

* Customer List

  ![image](dataset\Customer List.PNG)

* Transaction List

![image](dataset\Transaction List.PNG)

- Monthly Total Per Customer

![image](dataset\Monthly Total Per Customer.PNG)

- 3 Months Summary

![image](dataset\3 Months Summary.PNG)



##### Result

* Running Result

![image](result\result.PNG)

* Unit Test Result

![image](result\Unit Test Result.PNG)



##### How to use the REST API

* First, start the server locally by running DemoApplication in src/main/java/com.example.demo. The server address and port is http://127.0.0.1: 8080 in default. 

* The rewards calculation REST API locates at /api/calculate-rewards using POST method.

* The POST body accepts the content using JSON format, containing customerName, transactionsInTheFirstMonth, transactionsInTheSecondMonth, transactionsInTheThirdMonth, and totalTransactions.

* The REST API will return the result in JSON format, containing customerName, rewardInTheFirstMonth, rewardInTheSecondMonth, rewardInTheThirdMonth, and totalReward.

* The following picture shows how to call this REST API using Postman.

  ![image](result\How to use.PNG)



##### How to run unit test

* First, start the server locally by running DemoApplication in src/main/java/com.example.demo.
* Next, run the unit test by running RestfulApisUnitTest in test/java/com.example.demo.



##### Project Structure

* The REST API is inside RestfulApis.java in src/main/java/com.example.demo/controller.
* Also, define two classes Record and Reward in src/main/java/com.example.demo/model for the input and the output.
* The unit test is inside RestfulApisUnitTest in test/java/com.example.demo.

