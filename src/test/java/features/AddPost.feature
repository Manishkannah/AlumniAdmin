Feature: Add post functionality of alumni admin portal
Scenario: Add with positive details
Given enter the valid username
And enter the valid password
When click on the sign in button
Then Dashboard to be displayed
And click on the whats new
And click on the posts
And click on the post content button
And enter post title
And enter upload feature image
And enter publish date
And enter description
When click on the create post button
Then verify post added
