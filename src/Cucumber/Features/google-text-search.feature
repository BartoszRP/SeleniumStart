Feature: Google search

  Scenario: user can search any keyword
    Given an open browser with google.com
    When a keyword Selenium is entered in input field
    When a keyword Lewandowski is entered in input field
    Then the first one should contain selenium
    Then the first one should contain Lewandowski
    And close browser