Feature: I want to create a chat

  Scenario: I create an empty chat
    Given I login as "89131102157" with password "Z1X2C3V4"
    When I go to messages
    And I click on the create chat button
    Then I am successfully creating a new empty chat