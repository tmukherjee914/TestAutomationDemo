Feature: Search item



@search
Scenario: Search an item
	Given user is on Home page
	When user enter "one plus 7"
	And user select on third option from the list
	Then user should navigates to item detail page