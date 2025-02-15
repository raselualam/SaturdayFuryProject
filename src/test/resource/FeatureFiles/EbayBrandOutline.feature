@regression @smoke @us-246
Feature: Ebay Brand Outline

Description: User should able to filter items by Brand

	Background: 
		Given Open Ebay Homepage
	
	Scenario Outline: Filter items by Brand
		Given Search for "<Items>"
		When Filter by "<Brand>"
		Then Item list should have products of "<Brand>"
	
	Examples:
		|Items		|Brand		|
		|Shoes		|Nike		|
		|Shirts		|Adidas		|
		|Pants		|Unbranded	|
		
		
	Scenario Outline: Filter items by filter 
		Given Search for "<Items>"
		When User select "<Size>"
		Then Item list should have size of "<Size>"
	
	Examples:
		|Items		|Size		|
		|Shoes		|10			|
		|Shirts		|L			|
		|Pants		|Tall		|