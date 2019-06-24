@datatable
Feature: Testing datatables website

  Scenario: Testing adding new employee to the table
    Given User on the datatables homepage
    And User clicks on New Button
    Then User should see Create new Entry Box
    And User should enter firstname
    And User should enter lastname
    And User should enter position
    And User should enter office
    And User should enter extension
    And User should enter start date
    And User should enter salary
    Then User should click on create button
    And User enters firs name to search box
    Then User should see first name is inserted in the table