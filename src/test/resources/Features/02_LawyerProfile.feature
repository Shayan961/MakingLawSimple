Feature: lawyer profile feature

  Background:
    Given user is on login page
    When user click on hover
    When user enters username "slawyer2@yopmail.com"
    And user enters password "Test123#"
    And user clicks on Login button


  Scenario: update Lawyer Profile page title

    When user is on lawyerprofile page
    Then user gets the title of the page
    When user enter job title
    Then user enter job "lAWYER TEST"
    Then user click on save
    When user click law firm name icon
    Then user enter law firm name "lAWYER TEST"
    Then user click on save
    When user click link to website icon
    Then user enter website link "lAWYER TEST"
    Then user click on save
    When user click about me icon
    Then user enter about me "lAWYER TEST"
    Then user click on save
    When user click consultation icon
    Then user enter consultation "lAWYER TEST"
    Then user click on save







