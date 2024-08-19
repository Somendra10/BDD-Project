Feature: Login Scenario

Background:
Given User is on Login screen

  @smoke
  Scenario: Check Login with invalid credentails
    When User Enter invalid Email and Password
    And User click on Login button
    Then Should show the error message 

   #Scenario Outline: Check Login with valid credentails
    #When User Enter valid "<Email>" and "<Password>"
    #And User click on Login button
    #Then User should naviagate on Products screen
    #
    #Examples:
    #| Email | Password |
    #| problem_user | secret_sauce |
    #| standard_user | secret_sauce |
    