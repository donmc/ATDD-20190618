Feature: Purchase Seat Upgrade
  I want to use this template for my feature file

  Scenario Outline: Purchase with Miles
    Given customer registers with username "donmc" and email "bob@improving.com"
    And member "donmc" has 30000 balance miles
    And member "donmc" has "RED" category
    And member "donmc" has <start seat upgrades>
    When purchase seat <quantity> upgrade
   	Then balance should be <blanace>
    And upgrade quantity should be <end seat upgrades>
    
    Examples: 
      | start seat upgrades  | quantity | blanace  | end seat upgrades |
      | 0 									 |     1    | 20000    | 1                 |
      | 0 									 |     3    | 0        | 3                 |
      | 0 									 |     5    | 30000    | 0                 |
    

  