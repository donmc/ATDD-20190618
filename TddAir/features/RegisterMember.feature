Feature: Register Member
As a Customer
I want to register as a frequent flyer member
so that i can start collecting benefits 

Scenario: Successful Registration

When customer registers with username "skarimis" and email "Srikanth.Karimisetty@oracle.com"
Then member with username "skarimis" exists
And member category is "Red"
And member ytd Mile is 0
And member balance miles is 10000

Scenario: Duplicate

Given customer registers with username "skarimis" and email "Srikanth.Karimisetty@oracle.com"
When customer registers with username "skarimis" and email "Srikanth.Karimisetty@oracle.com"
Then recieve error message "username already exists!"

Scenario Outline: Invalid Email

When customer registers with username <username> and email <email>
Then recieve error message "Invalid Email!"

Examples:
|username   | email |
|"skarimis" | "skarimis.com" |
|"skarimis" | "skarimis.skarimis" |
|"skarimis" | "skarimis" |