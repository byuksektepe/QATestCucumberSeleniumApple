Feature: Search

  Scenario: Visitor should be able search then see results
    Given Navigate to Apple's site
    And search for product or item "Macbook Air" in search bar
    And Verify Search executed
    When Click first result in results
    Then Verify expected item page opened

  Scenario: Visitor should be able search then see results ver 2
    Given Navigate to Apple's site
    And search for product or item "Macbook Air" in search bar
    And Verify Search executed
    When Click first result in results
    Then Verify expected item page opened
