Feature: test login functionality

  Scenario Outline: to check successful login attempt with valid credentials
    Given browser is open
    And user is on the Login Page
    When user enters <username> and <password>
    And clicks on the login button
    Then user is navigated to the HomePage

    Examples: 
      | username | password |
      | Admin    | admin123 |
