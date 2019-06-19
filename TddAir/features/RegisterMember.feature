Feature: Register Member
As a customer
I want to register as a frequent flyer member
so that I can start collecting benefits

Scenario: Successful Registration

When customer registers with username "tiwong" and email "tim.wong@oracle.com"
Then member with username "tiwong" exists
And member category is "Red"
And member YTD miles is 0
And member balance miles is 10000

Scenario: Duplicate Username

Given customer registers with username "tiwong" and email "tim.wong@oracle.com"
When customer registers with username "tiwong" and email "tim.wong@oracle.com"
Then receive error message "username is already used"

Scenario Outline: Invalid Email

When customer registers with username <username> and email <email>
Then receive error message "Invalid email!"

Examples:
|username  |email    |
|"domc"    |"don.com"|
|"bob"     |"bob@bob"|
|"jane"    |"jane"   |
