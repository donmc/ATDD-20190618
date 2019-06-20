Feature: Purchase Seat Upgrdes

  @tag1
  Scenario Outline: Purchase with Miles
    Given a customer registers with username "donmc" and email "bob@improving.com"
    And member "donmc" has <start balance> balance miles
    And member "donmc" has <category> category
    And member "donmc" has <start seat upgrades>
    When purchase seat <quantity> upgrades
    Then balance should be <end balance>
    And upgrade quantity should be <end seat upgrades>

    Examples: 
		|category |start balance|quantity |end balance |end upgrades|
		|"Red"    |30000        |1        |20000       |1           |
		|"Red"    |30000        |3        |0           |3           |
		|"Red"    |30000        |5        |30000       |0           |
		|"Green"  |40000        |1        |31000       |1           |
		|"Blue"   |70000        |1        |62000       |1           |
		|"Gold"   |90000        |1        |83000       |1           |