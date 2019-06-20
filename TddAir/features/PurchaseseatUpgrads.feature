
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario: Purchase with Miles
    Given A customer registers with username "donmc" and email "bob@improving.com"
    And member "donmc" has 3000 balance miles
    And member "donmc" has "Red" category
    When I complete action
    And some other action
    And yet another action
    Then I validate the outcomes
    And check more outcomes

  @tag2
  Scenario Outline: Title of your scenario outline
    Given I want to write a step with <name>
    When I check for the <value> in step
    Then I verify the <status> in step

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
