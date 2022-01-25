Feature:  Login
  Scenario:  Check login successful with valid credential
    Given user is on login screen
    When user enters valid username and password
    And clicks on login button
    Then user is navigated to home page

  Scenario: Check login with invalid credential
    Given  user is on login screen
    When user enters invalid username and password
    And clicks on login button
    Then error message shows
