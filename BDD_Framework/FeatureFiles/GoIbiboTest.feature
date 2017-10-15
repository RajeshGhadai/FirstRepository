@TestGoibibo
Feature: Test the GoIbibo application for login

  Scenario: Test the login with valid credentials
    Given I am a valid goibibo user
    When I enter my GoIBibo username and password
    Then The goibibo home page should display
