@googleParameters
Feature: Google search functionality

  Scenario: Testing Google search
    Given User on the homeoage of Google
    When User enters "flowers"
    Then User should see "flowers" in the title

  Scenario: Testing Google search
    Given User on the homeoage of Google
    When User enters "cars"
    Then User should see "cars" in the title

  Scenario: Testing Google search
    Given User on the homeoage of Google
    When User enters "girls"
    Then User should see "girls" in the title