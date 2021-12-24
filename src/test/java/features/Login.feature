Feature: Application Login

#Valid username, valid password
Scenario: User can login with valid credentials
Given user is on login page
When user logins to the application with valid username and password
Then Home page is displayed
And logout link is displayed

# Valid username, invalid password - not allowed to login
Scenario: User cannot login with valid username and invalid password
Given user is on login page
When user logins to the application with "valid" username and "invalid" password
Then an error message is displayed

Scenario: User cannot login with valid username and invalid password
Given user is on login page
When user logins to the application with "aditya" username and "invalid" password
Then an error message is displayed

Scenario: User cannot login with valid username and invalid password
Given user is on login page
When user logins to the application with "alisha" username and "invalid" password
Then an error message is displayed