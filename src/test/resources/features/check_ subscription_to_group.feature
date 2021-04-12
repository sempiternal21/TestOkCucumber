Feature: I want to check subscription to the group

  Scenario: Check subscription to the group
    Given I login as "89502257988" with password "miha0018"
    When I go to the group named "Технополис OK (Mail.ru) и Политеха"
    Then I see that I am a subscriber