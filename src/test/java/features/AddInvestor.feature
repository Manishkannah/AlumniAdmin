Feature: Add Investor functionality of alumni admin portal
Scenario: Add with positive details for investor
Given enter the valid username
And enter the valid password
When click on the sign in button
Then Dashboard to be displayed
And click on the home page
And click on the funding
And click on the investors
And click enlist as a investor
And enter type of investor
And enter type of funding
And enter quantum of funds
And enter sector
And enter previous investment
And enter linkedin url
And enter website url
And enter other details
When submit the investor
Then verfiy investor submitted