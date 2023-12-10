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
    Then user click on save changes job title
    When user click law firm name icon
    Then user enter law firm name "ABC LAWYER CO."
    Then user click on save changes firm name
    When user click link to website icon
    Then user enter website link "https://makinglawsimple.staginganideos.com/"
    Then user click on save changes website link button
    When user click about me icon
    Then user enter about me "Senior Lawyer"
    Then user click on save about me button
    When user click consultation icon
    Then user enter consultation "10"
    Then user click on consultation save button
    Then user check offer Remote Consultations
    Then user check mobile friendly checkbox
    When user click on choose file for profile picture
    When user click on Area of practice icon
    Then user select value from dropdown
    Then user click on save area of pratcice







