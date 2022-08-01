Feature: Product
  You need to provide model linked with SearchQuery.
  Like: <Macbook Pro> <14 inch>
  Or: <Macbook Air> <m2 chip>

  Scenario Outline: Visitor should be able to add the product to the bag
    Given Navigate to Apple's site
    And search for product or item "<SearchQuery>" in search bar
    And Verify Search executed
    When Click first result in results
    And Verify expected item page opened
    And Select given: "<Model>" product
    And Add product to bag
    Then Verify product added to bag

  Examples:
    | SearchQuery | Model   |
    | Macbook Pro | 14 inch |