Feature: Validate the scenario for hshceu.com Website  

Scenario: 1.open the hshceu by using chromebrowser

Given  ChromeBrowser is opened
When   user enter url
Then  open the hshceu website And validate the URL

Scenario: 2.click on search box in course page

Given open the course page 
Then  click on searchbox field
And  search the respected Result which you want

Scenario: 3.check the free Trail Page

Given opened the Trail Page
Then enter the deatils 
And click on signup Button & Take the screenshot for validation

Scenario: 4.To validate the Login Page

Given click on Login page 
When User enter the EmailAddress & Password
Then click on Login button 
And Take screenshot for validation
