Feature: I want to add music

  Scenario: I want to add music from the music section
    Given I login as "89131102157" with password "Z1X2C3V4"
    When I go to the music tab
    And I type in the search "Moonlight" by "XXXTentacion"
    And I click on the track
    And I click on the add music icon
    Then I see an alert that the music has been added