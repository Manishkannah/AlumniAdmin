Feature: Add Email Notification functionality of alumni admin portal
Scenario: Select target users as All users
Given enter the valid username
And enter the valid password
When click on the sign in button
Then Dashboard to be displayed
And click on the email notification
And click on the create notification
And enter mail content
And enter the subject
And enter the notificaiton date
And enter the notification time
And select the target user as all
When click on add notification button
Then verify the added notification

Scenario: Select target users as user by batch
Given enter the valid username
And enter the valid password
When click on the sign in button
Then Dashboard to be displayed
And click on the email notification
And click on the create notification
And enter mail content
And enter the subject
And enter the notificaiton date
And enter the notification time
And select the target user as batch
And enter the batch start date
And enter the batch end date
When click on add notification button
Then verify the added notification

Scenario: Select target users by chapter
Given enter the valid username
And enter the valid password
When click on the sign in button
Then Dashboard to be displayed
And click on the email notification
And click on the create notification
And enter mail content
And enter the subject
And enter the notificaiton date
And enter the notification time
And select the target user as chapter
And select the chapter from the dropdown
When click on add notification button
Then verify the added notification

Scenario: Select target users as custome
Given enter the valid username
And enter the valid password
When click on the sign in button
Then Dashboard to be displayed
And click on the email notification
And click on the create notification
And enter mail content
And enter the subject
And enter the notificaiton date
And enter the notification time
And select the target user as custome
And upload the file
When click on add notification button
Then verify the added notification


