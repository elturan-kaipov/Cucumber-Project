Feature: Wikipedia search feature
@wiki
  Scenario: Wikipedia search test
    Given User is on the wikipedia homepage
    When User enters steve jobs to search bar and clicks enter
    Then User should see the first header is displaying steve jobs