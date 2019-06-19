Feature: Register Member
As a customer
I want to register as a frequent flyer member
so that I can start collecting benefits

Scenario: Successful Registration

When customer registers with username "donmc" and email "don@improving.com"
Then member with username "donmc" exists
And member category is "Red"
And member Ytd Miles is 0
And member balance miles is 10000 

Scenario: Duplicate Username

Given customer registers with username "bob" and email "bob@improving.com"
When customer registers with username "bob" and email "bob@oracle.com"
Then receive error message "user already exist!"


Scenario Outline: Invalid Email

When customer registers with username <username> and email <email>
Then receive error message "Inavlid email!"

Examples:
|username  |email    |
|"donmc"   |"don.com"|
|"bob"     |"bob@bob"|
|"jane"    |"jane"   |

