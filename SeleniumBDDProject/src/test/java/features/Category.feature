@Category
Feature: Scenarios for Bigbasket Shop By Category page option
  Covers the different sceanrios in Shop By Category page option

	Background:
		Given user is in home page of Bigbasket website


  Scenario: Validate view all category option
    When user clicks on shop by category 
    Then check "bigbasket Store" text is displayed 
    
  Scenario Outline: Validate available items in category under view all category option
    When user clicks on shop by category 
    Then user should see "<item>" under "<category>"
    
      Examples:
    | item                    | category 								 | 
    | Potato, Onion & Tomato  |  Fruits & Vegetables     |   
    | Fresh Salads & Sprouts  |  Fruits & Vegetables     | 
    | Dishwash Bars & Powders |  Cleaning & Household    | 