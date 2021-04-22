Feature: I want to log in to "ok.ru"

  Scenario: I want to login with correct credentials
    Given I want to log in to my account
    When I login as "89131102157" with password ""
    Then I have been successfully logged

  Scenario: I want to login with incorrect credentials
    Given I want to log in to my account
    When I login as "aaa" with password "aaa"
    Then I couldn't log in