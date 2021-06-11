@chat

Feature: I want to create a chat

  Scenario: I create an empty chat
    Given I login as "89502257988" with password "miha0018"
    When I go to messages
    And I click on the create chat button
    Then I am successfully creating a new empty chat