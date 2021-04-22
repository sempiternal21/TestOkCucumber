Feature: I want to add music

  Scenario: I want to add music from the music section
    Given I login as "89131102157" with password ""
    When I go to the music tab
    And I type in the search "1996" by "PHARAOH"
    And I click on the track
    And I click on the add music icon
    And i go to my music library
    Then I see an alert that the music has been added