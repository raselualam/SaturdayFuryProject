@regression @smoke @SKYW-15 @E2E
Feature: Ebay Search Functionality

	Background: 
		Given Open Ebay Homepage

	Scenario: Search for Shoes
		When Search for shoes
		Then Item list should have only shoes related products
		
#	Scenario: Search for Pants
#		When Search for Pants
#		Then Item list should have only Pants related products
		
#	Scenario: Search for Shirts
#		When Search for Shirts
#		Then Item list should have only Shirts related products