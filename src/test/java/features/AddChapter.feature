Feature: Add chapter functionality of alumni admin portal
Scenario Outline: Add with positive details for chapter
Given enter the valid username
And enter the valid password
When click on the sign in button
Then Dashboard to be displayed
And click on the chapters
And click on the chapter management
And click on the add chapter button
And enter chapter name<chapter name>
And enter chapter city name
And enter chapter banner image
And enter chapter type
And enter chapter description
And enter chapter alumni
When click on the save button for chapter
Then chapter added successfully message is displayed on the screen
Examples:
|chapter name|
|delhi|