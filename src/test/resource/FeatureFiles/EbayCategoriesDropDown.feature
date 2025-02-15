@regression @smoke @us-248
Feature: Ebay Category Dropdown

Description: User should able to search by category

	Background: 
		Given Open Ebay Homepage
	
	Scenario: Ebay Search Category Dropdown 
		Given User type Starwars in Search text box
		When Select Book from Category dropdown
		And Click on Search button
		Then Item list should have Starwars related Books
		
	Scenario: Ebay Category Dropdown using Index
		Given User type Billie in Search text box
		When Select Music from Category dropdown
		And Click on Search button
		Then Item list should have Billie related Music
		
	Scenario: Ebay Category Dropdown using value
		Given User type Hawaii in Search text box
		When Select Travel from Category dropdown
		And Click on Search button
		Then Item list should have Hawaii related Travel