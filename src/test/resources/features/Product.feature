Feature: Product

  Scenario: Visitor should be able to add the product to the cart
    Given Navigate to Apple's site
    And search for product or item "Macbook Pro" in search bar
    And Verify Search executed
    When Click first result in results
    And Verify expected item page opened
    And