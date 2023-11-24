@runFirst
Feature: Login page feature

  Scenario: Login page title
    Given user is on login page
    When user gets the title of the page
    Then page title should be "law-frontend"

#  Scenario: Forgot Password link
#    Given user is on login page
#    Then forgot your password link should be displayed

  Scenario: Login with correct credentials
    Given user is on login page
    When user click on hover
    When user enters username "slawyer2@yopmail.com"
    And user enters password "Test123#"
    And user clicks on Login button
    Then user gets the title of the page
    And page title should be "law-frontend"



