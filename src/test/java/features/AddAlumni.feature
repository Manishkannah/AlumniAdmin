Feature: Add Alumni functionality of alumni admin portal
Scenario: Add with positive details
Given enter the valid username
And enter the valid password
When click on the sign in button
Then Dashboard to be displayed
And click on the alumni 
And click on the alumni management
And click on the add alumni button
And enter first name
And enter last name
And enter email id
And enter gender
And enter phone number
And enter programme/degree/certificate
And enter joining year
And enter passout year
When click on the create alumni button
Then verify alumni added
