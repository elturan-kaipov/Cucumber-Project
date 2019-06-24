@datatable2
Feature: Testing datatables website

  Scenario: Testing adding new employee to the table
    Given User on the datatables homepage
    And User clicks on New Button
    Then User should see Create new Entry Box
    And User should enter firstname "Max"
    And User should enter lastname "Welington"
    And User should enter position "Retired"
    And User should enter office "London"
    And User should enter extension "123"
    And User should enter start date "2019-01-12"
    And User should enter salary "123400"
    Then User should click on create button
    And User enters firs name "Max" to search box
    Then User should see first name "Max" is inserted in the table