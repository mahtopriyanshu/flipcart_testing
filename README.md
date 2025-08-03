Flipkart End-to-End Test Automation Framework
This project automates the Flipkart website using Selenium, Java, and Cucumber with the Page Object Model design. 
It's built using Eclipse IDE with support for Extent Reports and Maven.

Flipkart_EndToEndProject/
├── src/
│ ├── main/java/
│ │ ├── com.Baseclass/
│ │ ├── com.Hooks/
│ │ ├── com.ReusableFunctions/
│ │ └── com.Utilities/
│ ├── test/java/
│ │ ├── com.Pages/ # POM classes like SearchPage.java
│ │ ├── com.stepdefinitions/ # StepDefs like SearchMobile_Testcase.java
│ │ └── com.TestRunner/ # Runner.java with Cucumber options
│ └── test/resources/
│ ├── Features/ # Cucumber Feature Files
│ │ └── SearchFunctionality.feature
│ ├── Properties/ # Config files like Config.Properties
│ └── Reports/ # Screenshots & Extent Reports
├── pom.xml # Maven Dependencies
├── testng.xml # 
└── README.md

| Tool/Library     | Purpose                                |
|------------------|----------------------------------------|
| Java             | Programming Language                   |
| Selenium WebDriver | Browser Automation                  |
| Cucumber         | BDD Framework with Gherkin syntax      |
| JUnit            | Test runner for Cucumber               |
| Maven            | Build & Dependency Management          |
| Eclipse IDE      | Development Environment                |
| Extent Reports   | HTML Reporting for Cucumber Tests      |

1. Open in Eclipse
  File > Import > Maven > Existing Maven Project
2.Run Using Runner Class
  Navigate to: src/test/java/com/TestRunner/Runner.java
  Right-click → Run As → JUnit Test

Feature: Search Product on Flipkart
  Scenario: User searches mobile on Flipkart
    Given Launch the Flipkart Application
    When Close the popup
    And Enter "Mobile" in search bar
    And Click on search icon
    Then Mobile results should be displayed
