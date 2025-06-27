Feature: User Registration

  Scenario: Fill registration form successfully
    Given I open the registration page
    When I fill in the registration form
    And I submit the form
    Then I should see the confirmation message
