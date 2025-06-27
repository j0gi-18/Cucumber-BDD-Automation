Feature: User Login Functionality

  Scenario: Valid user login
    Given User launches the browser
    And User opens the login page
    When User enters valid username and password
    And User clicks on login button
    Then User should be redirected to mainpage
