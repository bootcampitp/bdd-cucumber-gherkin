Feature: User registration for game website
  This test is to validate firstname field on the registration page

  Scenario: Registration successful with valid firstname
    Given I am on the registration page "http://testingchallenges.thetestingmap.org/index.php"
    When I type first name "JohnDoe" to firstname field
    Then I should see "Welcome" message
    And my score should be 0