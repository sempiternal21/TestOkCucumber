@scroll
Feature: I want to scroll feed page and see more news
  Scenario: I want to scroll feed page and see more news
    Given I login as "89502257988" with password "miha0018"
    When I go to feed page
    And I scroll the page down
    Then I see, that more news were loaded