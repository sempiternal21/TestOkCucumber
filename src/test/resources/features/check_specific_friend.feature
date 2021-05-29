Feature: I want to check for a specific friend

  Scenario: I want to check the presence of a particular friend by clicking on the link to his page
    Given I login as "89502257988" with password "miha0018"
    When I go to the friends tab
    Then The user that the link "https://ok.ru/profile/529108304595" points to is in my friends