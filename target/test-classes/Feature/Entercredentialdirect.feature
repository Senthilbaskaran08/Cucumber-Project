Feature: Facebook Login
Scenario: Login
    Given Login url
    When User enter "bsenthil30@gmail.com" and "sengi12345" and click login button
    Then close the browser