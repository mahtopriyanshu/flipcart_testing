Feature: To validate the Flipkart Application

Background:
 
Given Launch the Flipkart Application
When Close the popup
Then It should Navigate to the Home page 

Scenario: To validate the search functionality

Given User enter the Text in Search field
When Click the search button
Then It should navigate to search result page and display the relevant details
