Feature: Login functionality

  Background: Land to Home page
    Given Go to login page
@smoke
  Scenario: Positive: Login with valid credentials
    Given Enter "nuta" in userName or Email input field
    And Enter "HelloWorld312!" in password input field
    When user clicks on login button
    Then user should successfully logged in

  @smoke
  Scenario: Positive: creating user
    Given Enter "nuta" in userName or Email input field
    And Enter "HelloWorld312!" in password input field
    When user clicks on login button
    Then user should successfully logged in
    When user click add user button
    Then user should be in add user page
    And user should see
