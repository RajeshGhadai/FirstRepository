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
   
