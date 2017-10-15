@TestMMT
Feature: Test the MMT application for login

  Scenario: Test the login with valid credentials
    Given I am a valid MMT user
    When I enter my MMT username and password
    Then The MMT home page should display
