@group
@like
Feature: I want to check liking post in group

  Scenario: Check liking post
    Given I login as "89502257988" with password "miha0018"
    When I go to the group with URL "https://ok.ru/technopolis"
    And I like first post
    Then I see, that post was liked
    When I remove like from first post
    Then I see, that like was removed