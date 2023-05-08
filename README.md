# StringCalculator

String Calculator TDD Project in Java
This project is an example of Test-Driven Development (TDD) for a string calculator program implemented in Java.

## Project Description
The string calculator program accepts a string of numbers separated by delimiters and returns their sum. For example, the string "1,2,3" should return 6.

## Getting Started
To get started with this project, you will need to have the following software installed:

* Java Development Kit (JDK)
* Apache Maven

Then, follow these steps:

Clone repository and,
```
Build the project:
mvn clean install
```

Running the Tests
To run the test suite, use the following command:
```
mvn test
```

This will run the test suite using the JUnit testing framework.

### Development Process
The development of this project followed the TDD process:

* Write a failing test for the desired behavior
* Write the simplest code possible to make the test pass
* Refactor the code to improve readability and maintainability
* Repeat the process for the next feature or requirement

The tests for this project are located in the `src/test` directory, and the implementation code is in the `src/main` directory.

Contributing
If you would like to contribute to this project, please follow these steps:

* Fork the repository
* Create a new branch for your feature or bugfix: git checkout -b feature-name
* Write your code and tests
* Run the tests: mvn test
* Commit your changes: git commit -m "Add feature-name"
* Push your branch: git push origin feature-name
* Create a pull request from your branch to the main branch of the original repository

### License
This project is licensed under the MIT License - see the LICENSE file for details.