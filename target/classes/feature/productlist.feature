Feature: Product List
  Scenario: Load the product list
    Given user open app happy fresh and choose address
    When User request the product list
    Then User should receive product lists
