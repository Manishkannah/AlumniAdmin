Feature: Add Admin functionality of alumni admin portal
Scenario Outline: Add with positive details for admin
Given enter the valid username
And enter the valid password
When click on the sign in button
Then Dashboard to be displayed
And click on the admins
And click on the admin management
And click on the add admin
And enter first name of admin
And enter last name of admin
And enter email of admin <admin email>
And enter the admin role type
And enter password of admin
And enter confirm password of admin
And click on the is alumni check box
When click on the submit button to submit
Then admin added successfully message displayed on the screen
Examples:
|admin email|
|uniqueadmin@gmail.com|