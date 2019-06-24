@datatableSO
Feature: Testing datatables website

  Scenario Outline: Testing adding new employee to the table

    Given User on the datatables homepage
    And User clicks on New Button
    Then User should see Create new Entry Box
    And User should enter firstname "<firstname>"
    And User should enter lastname "<lastname>"
    And User should enter position "<position>"
    And User should enter office "<office>"
    And User should enter extension "<extension>"
    And User should enter start date "<date>"
    And User should enter salary "<salary>"
    Then User should click on create button
    And User enters firs name "<firstname>" to search box
    Then User should see first name "<firstname>" is inserted in the table

    Examples: Test data for database
      |firstname|lastname|position|office|extension|date|salary|
      |john     |doe     |SDET    |london|232      |2019-02-12|123000|
      |Max      |Qwerty  |developer|Chicago|333    |2019-12-12|120000|
      |Luna     |Moon    |manager  |Las-Vegas|111  |2019-09-10|99000 |
