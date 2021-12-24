@otherloginpage
Feature: Techfios login fuctionality 

@otherScenario1 
Scenario Outline: User should be able to login to techfios page  
	Given User is on the techfios login page  
	When User put username as "<username>"  
	When User put password as "<password>" 
	And User click of signin button 
	Then User should be on dashboard page
	Examples:
	 |username|password|
	 |demo@techfios.com|abc123|
	 |demo@techfios.com|abc124|
	 |demo2@techfios.com|abc123|
	 |demo2@techfios.com|abc124|
	 
#@Scenario2
#	Scenario: User should not be able to login to techfios page  invalid username
#	Given User is on the techfios login page  
#	When User put username as "demo1@techfios.com"  
#	When User put password as "abc123" 
#	And User click of signin button 
#	Then User should be on dashboard page 
#@Scenario3
#	Scenario: User should not be able to login to techfios page  invalid password
#	Given User is on the techfios login page  
#	When User put username as "demo@techfios.com"  
#	When User put password as "abc124" 
#	And User click of signin button 
#	Then User should be on dashboard page 
	
