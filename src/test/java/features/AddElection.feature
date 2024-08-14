Feature: Add Alumni functionality of alumni admin portal
@manish
Scenario Outline: Add with positive details
Given enter the valid username
And enter the valid password
When click on the sign in button
Then Dashboard to be displayed
And click on the elections module
And click on the election management
And click on the add election button
And enter the election name as <election name> 
And enter the election type
And  enter the posts
And upload the rules and regulation pdf
And select the ro
When click on the create button
Then redirect to election page

Examples:
|election name|
|VMHSS|

