Feature: Create an Account

  Scenario: user creates an account
    Given an open browser with qloapps.coderslab.pl
    When User gives marek@wp.pl and click Create an account button
    Then User fills up the form
    And close the browser