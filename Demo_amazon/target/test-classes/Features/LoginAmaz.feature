@AmazonLogin
Feature: Amazon Login


@scen1
Scenario: Veriy title
When The user is on the home page
Then Verify page title


@scen2
Scenario Outline: Successful Login
Given The user is on the website page
When user clicks on the Login button
And user enter email "<email_id>"
And clicks on continue
And user enter password "<password>"
And user click on Login
Then user should be logged into the application

Examples:
|email_id|password|
|t.....com|| 
|trideepmukherjee914@gmail.com|Trid@|
|trideepmukherjee914@gmail.com|Trid@1992|


