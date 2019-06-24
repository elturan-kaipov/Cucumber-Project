@youtube
Feature: Youtube search feature

Background: User is on the youtube homepage and is able to see search box and search button
  Given User is on the youtube homepage
  And User is able to see the search box
  And User is able to see the search button


  Scenario: Testing youtube search
    When User search for Funny cat videos
    Then User should see results related to funny cat videos

  Scenario: Testing youtube search
    When User search for Funny dog videos
    Then User should see results related to funny dog videos

  Scenario: Testing youtube search
    When User search for Funny pet videos
    Then User should see results related to funny pet videos
