Feature: Product
  You need to provide model linked with Family.
  Like: <Mac>    <Macbook Pro> <14">  [<Base>?<Better>]
  Or:   <Iphone> <Iphone 13>   <Pro>  [<Better>?<Ultimate>]

  @Smoke @Product
  Scenario Outline: Visitor should be able to add the product to the bag using navbar
    Given Navigate to Apple's site
    And Click navbar item "<Family>"
    And Verify family page opened
    When Click product: "<Product>" button
    And Verify product page opened
    And Buy given: '<Model>' product model
    And Select given: "<Configuration>" product configuration
    And Add product to bag
    Then Verify product added to bag

  Examples:
    | Family | Product     | Model | Configuration |
    | Mac    | Macbook Pro | 14"   | Better        |