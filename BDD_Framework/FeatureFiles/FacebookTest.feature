Feature: Test the facebook application for login

  Scenario Outline: Test the login with valid credentials
    Given I am a valid user
    When I enter my "<username>"
    Then The home page should display

    Examples: 
      | username |
      | Rajesh   |
      | Rupesh   |
      | bailame  |
