@group
Feature: I want to check subscription to the group

  Scenario: Check subscription to the group
    Given I login as "89502257988" with password ""
    When I go to the group with URL "https://ok.ru/technopolis"
    Then I see that I am a subscriber