@SmokeTest
Feature: US0101 URL Test
@SmokeTest
  Scenario: As a user I should be able to access the home page

    Given Open browser go to "userUrl"

    And The user closes "userUrl"