Feature: Login page feature

  Scenario: Login page title
    Given user is on login page
    When user gets the title of the page
    Then page title should be "Appraisal Management System - Login"

  Scenario: Forgot Password link
    Given user is on login page
    Then forgot your password link should be displayed

  Scenario: Login with correct credentials
    Given user is on login page
    When user enters username "amsadmin"
    And user enters password "VLDir@23"
    And user clicks on Login button
    Then user gets the title of the page
    And page title should be "Appraisal Management System"