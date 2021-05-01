Feature: I want to check for a specific friend

  Scenario: I want to check the presence of a particular friend by clicking on the link to his page
    Given I login as "89131102157" with password "Z1X2C3"
    When I go to the friends tab
    Then The user that the link "https://ok.ru/profile/579252943340" points to is in my friends