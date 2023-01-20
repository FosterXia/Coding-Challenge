# Coding Challenge

Used Java and Spring Boot implement the REST API.



##### Dataset overview

* Customer List

  ![image](https://github.com/FosterXia/Coding-Challenge/blob/master/dataset/Customer%20List.PNG)

* Transaction List

![image](https://github.com/FosterXia/Coding-Challenge/blob/master/dataset/Transaction%20List.PNG)

- Monthly Total Per Customer

![image](https://github.com/FosterXia/Coding-Challenge/blob/master/dataset/Monthly%20Total%20Per%20Customer.PNG)

- 3 Months Summary

![image](https://github.com/FosterXia/Coding-Challenge/blob/master/dataset/3%20Months%20Summary.PNG)



##### Result

* Running Result

![image](https://github.com/FosterXia/Coding-Challenge/blob/master/result/result.PNG)

* Unit Test Result

![image](https://github.com/FosterXia/Coding-Challenge/blob/master/result/Unit%20Test%20Result.PNG)



##### How to use the REST API

* First, start the server locally by running DemoApplication in src/main/java/com.example.demo. The server address and port is http://127.0.0.1: 8080 in default. 

* The rewards calculation REST API locates at /api/calculate-rewards using POST method.

* The POST body accepts the content using JSON format, containing customerName, transactionsInTheFirstMonth, transactionsInTheSecondMonth, transactionsInTheThirdMonth, and totalTransactions.

* The REST API will return the result in JSON format, containing customerName, rewardInTheFirstMonth, rewardInTheSecondMonth, rewardInTheThirdMonth, and totalReward.

* The following picture shows how to call this REST API using Postman.

  ![image](https://github.com/FosterXia/Coding-Challenge/blob/master/result/How%20to%20use.PNG)



##### How to run unit test

* First, start the server locally by running DemoApplication in src/main/java/com.example.demo.
* Next, run the unit test by running RestfulApisUnitTest in src/test/java/com.example.demo.



##### Project Structure

* The REST API is inside RestfulApis.java in src/main/java/com.example.demo/controller.
* Also, define two classes Record and Reward in src/main/java/com.example.demo/model for the input and the output.
* The unit test is inside RestfulApisUnitTest.java in src/test/java/com.example.demo.

##### Unit Test Screenshots
![image](https://github.com/FosterXia/Coding-Challenge/blob/master/unit%20test%20screenshots/unit%20test%20screenshot.PNG)


