Feature: Add Event functionality of alumni admin portal
Scenario Outline: Add with positive details
Given enter the valid username
And enter the valid password
When click on the sign in button
Then Dashboard to be displayed
And click on the events
And click on the events management
When click on the add event
Then add new events page
And enter the event type
And enter new event type name
And enter new event description
And enter the new city
And enter the city name
And enter event name <event name>
And upload the feature image
And enter event description
And enter event venu
And choose event day
And enable event booking
And Select Food
And select chapter
And upload gallery image
And enter note for attendee
When click on add event button
Then verify event created

Examples:
|event name|
|Nexus 2024|

