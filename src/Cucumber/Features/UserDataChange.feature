Feature: Change user information after login


  Scenario: Change user birthday date, gender and sign up for a newsletter
    Given User is logged in to CodersLab shop
    When User goes to user information page
    And User signs up for our newsletter
    And User changes his gender
    And Sets birthday date to "10/06/1990"
    And User saves information
    Then User sees "Information successfully updated."