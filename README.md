# Overview
It is a front-end test automation framework designed to validate the functionality of a web application. The project uses Java as the programming language and Selenium WebDriver for browser automation. TestNG is used for test case management and execution.

## Prerequisites
1. Java Development Kit (JDK) version 17
2. IDE (IntelliJ IDEA.
3. Maven (version 3.1.2)
4. Web Browsers (Chrome, Firefox,Edge)

## Technologies Used
1. Java: Programming language.
2. Selenium WebDriver: Browser automation tool.
3. TestNG: Test frameworks for organizing and running test cases.
4. Maven: Build and dependency management.
5. Extent Reports: For generating test reports.

## Setup Instructions
Its a maven project and pom.xml is configured and has all the dependencies added to pom.xml.
1. selenium-java (version 4.11.0).
2. testng (version 7.8.0).

## clone the repository
https://github.com/Devika-Naidu/Devi

## Running the Tests
.Configure the browser driver: Ensure the correct WebDriver (eg ChromeDriver,Firefox,Edge) are in place.
.Run tests with Maven:  mvn test
.Run specific test suites defined in testng.xml: mvn test -DsuiteXmlFile=testng.xml

## Reporting
.Extent Reports are generated after the tests are executed, in the target/extent-reports folder.
.To view reports, open the reports.html file in a browser.

## Packages in Framework
1. Base: launch the browser and loading the property file .
2. Config: configuration related Credentials, Url, BrowserName.
3. Resources: Global Resource package and Static Resource packages
4. Utilities: Here we have different packages
   1. reports: Extent Reports are generated after the tests are executed, in the target/extent-reports folder.
    . To view reports, open the reports.html file in a browser.
   2. screenshot: to store screenshot for test cases in specific directory C:/screenshot/.
5. Test cases: Test case written here
