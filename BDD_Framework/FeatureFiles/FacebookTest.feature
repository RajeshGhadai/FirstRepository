@TestFB
Feature: Test the facebook application for login

  Scenario Outline: Test the login with valid credentials
    Given I am a valid user
    When I enter my "<username>" and "<password>"
    Then The home page should display

    Examples: 
      | username | password |
      | Rajesh   | pass1    |
      | Rupesh   | pass2    |
      | Barnali  | pass3    |
      
   Scenario Outline: Test the login in Chrome Driver
   	Given I am a valid chrome user
   	When I enter "<cusername>" and "<cpassword>"
   	Then I should get the home page
   
   Examples: 
      | cusername | cpassword |
      | Rajesh1   | pass11    |
      | Monika2   | pass22    |
      | Barnali3  | pass33    |
