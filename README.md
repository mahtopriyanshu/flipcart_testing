<pre> Flipkart_EndToEndProject/ ├── src/ │ ├── main/java/ │ │ ├── com.Baseclass/ # Base classes and utilities │ │ ├── com.Hooks/ # Hooks for before/after scenarios │ │ ├── com.ReusableFunctions/ # Common reusable methods │ │ └── com.Utilities/ # Utility classes (Excel, ConfigReader, etc.) │ ├── test/java/ │ │ ├── com.Pages/ # Page Object Model classes (e.g., SearchPage.java) │ │ ├── com.stepdefinitions/ # Step definition files (e.g., SearchMobile_Testcase.java) │ │ └── com.TestRunner/ # Cucumber runner file (Runner.java) │ └── test/resources/ │ ├── Features/ # Feature files (e.g., SearchFunctionality.feature) │ ├── Properties/ # Config.properties and other environment files │ └── Reports/ # Screenshots and Extent Reports ├── pom.xml # Maven configuration ├── testng.xml # TestNG suite file (optional) └── README.md # Project documentation </pre>

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
