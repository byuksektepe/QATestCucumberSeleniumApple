Feature: Product

  Scenario Outline: Visitor should be able to add the product to the bag
    Given Navigate to Apple's site
    And search for product or item "<Model>" in search bar
    And Verify Search executed
    When Click first result in results
    And Verify expected item page opened
    And Select given: "<Model>" product
    And Add product to bag
    Then Verify product added to bag

  Examples:
    | Model       |
    | Macbook Pro |