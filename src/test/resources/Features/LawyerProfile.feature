Feature: lawyer profile feature

  Background:
    Given user has already logged in to application
      |username|password
      ||VLDir@23


  Scenario: Account page title
    Given user is on admin page
    When user gets the title of the page
    Then page title should be "Appraisal Management System - Appraisals"


  Scenario: Login with correct credentials
    Given user is on login page
    When user click on hover
    When user enters username "client12@yopmail.com"
    And user enters password "Test123#"
    And user clicks on Login button
    Then user gets the title of the page
    And page title should be "law-frontend"


