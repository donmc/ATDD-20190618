Feature: Register Member
As a customer, I want to register as a frequent flyer member
so that I can start collecting benefits. 

Scenario: Successful Registration

When customer regsisters with username "nparikh" and email "nikhil.parikh@oracle.com"
Then member with username "nparikh" exists
And member category is "Read"
And member YTD Miles is 0
And member Balance Miles is 10000

Scenario: Duplicate Username

Given customer regsisters with username "bob" and email "bob@improving.com"
When customer regsisters with username "bob" and email "bob@oracle.com"
Then receive error message "username already exists"


Scenario Outline: Invalid Email

When customer regsisters with username <username> and email <email>
Then receive error message "invalid email"

Examples:
|username  |email    |
|"donmc"   |"don.com"|
|"bob"     |"bob@bob"|
|"jane"    |"jane"   |
