@Home
Feature: Scenarios for Bigbasket home page
  Covers the different sceanrios in Bigbasket home page

  @smoke
  Scenario: Validate Cart in home page
    Given user is in home page of Bigbasket website
    When user clicks on MyBasket
    Then user should see text as "basket is empty"
    
  Scenario: Validate login option in home page
    Given user is in home page of Bigbasket website
    When user clicks on Signup
    Then user should see login popup with facebook icon    

  Scenario: Validate Category in home page
    Given user is in home page of Bigbasket website
    When user scrolls down the page 
    Then user should see "Your Daily Staples" as a category
    
  Scenario: Validate product under category in home page
    Given user is in home page of Bigbasket website
    When user clicks on "Rice & Rice Products" under "Your Daily Staples" 
    Then user should see product details with product name "Rice & Rice Products"    