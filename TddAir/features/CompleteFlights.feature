
Feature: Complete Flights
As a Member
I want my miles recorded
so that I can accumulate miles and earn status

Background: Cleanup
Given a clean system

Scenario Outline: Member accumulates miles and status

Given a customer registers with username <username> and email "bob@improving.com"
And member <username> has <start ytd> miles
When member <username> takes flight <flight no>
Then that member has <end category> category
And that member has <end ytd> ytd miles
And that member has <end balance> balance miles

Examples: 
|username|start ytd|flight no|end category|end ytd|end balance|
|"bob"   |20000    |"QF191"  |"Green"     |27490  |37490      |
|"bob"   |45000    |"QF191"  |"Blue"      |52490  |62490      |
|"bob"   |70000    |"QF191"  |"Gold"      |77490  |87490      |
|"bob"   |15000    |"QF191"  |"Red"       |22490  |32490      |
|"bob"   |40000    |"QF191"  |"Green"     |47490  |57490      |
