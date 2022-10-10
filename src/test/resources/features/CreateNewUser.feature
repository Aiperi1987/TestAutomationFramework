Feature: Create new user functionality

  Background: Land to Home page
    Given Go to login page
    Given Enter "nuta" in userName or Email input field
    And Enter "HelloWorld312!" in password input field
    When user clicks on login button
    Then user should successfully logged in

    Scenario: Positive: Create new user
      Given user should click Add user button in Admin Home page
      And verify