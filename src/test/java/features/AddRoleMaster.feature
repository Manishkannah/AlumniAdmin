Feature: Add Role Master to alumni admin portal
Scenario Outline: Add role with positive details
Given enter the valid username
And enter the valid password
When click on the sign in button
Then Dashboard to be displayed
And click on the role master
And click on the role management
And click on the add role button
And enter role name <Role Name>
And enter role type
And enter election availability for role
And enter role description
And click on the necessary check box permissions
When click on the create button Role
Then Success message to be displayed on the listing page

Examples:
|Role Name|
|Board Member|