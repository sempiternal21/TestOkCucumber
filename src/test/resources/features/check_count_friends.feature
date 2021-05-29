Feature: I want to check the number of friends

  Scenario: I check the number of friends
    Given I login as "89502257988" with password "miha0018"
    When I go to the friends tab
    Then I see the number of my friends "2"

