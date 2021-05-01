Feature: I want to check the number of friends

  Scenario: I check the number of friends
    Given I login as "89131102157" with password "Z1X2C3"
    When I go to the friends tab
    Then I see the number of my friends "15"

