Feature: feature to test google search functionality

Scenario: Validate google search is working
Given  Browser is open
And  user is open google search page
When  user enter a text in search box
And  hit enter
Then  user is navigated to search result
