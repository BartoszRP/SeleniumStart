Feature: Change user address after login

  Scenario Outline: Change user address
    Given User is logged in to CodersLab_shop
    When User goes to user address page
    And User enters "<alias>"
    And User enters 1 "<company>"
    And User enters 2 "<Address>"
    And User enters 3 "<City>"
    And User enters 4 "<Zip>"
    And User enters 5 Country
    And User enters 6 "<Phone Number>"
    And User saves Address information
    Then User sees info "Address successfully added!"
    Examples:
      |alias| |company| |Address   | |City  | |Zip   | |Phone Number|
      |Koko | |Burma  | |Szkolna 7 | |Krakow| |88-888| |600-000-000 |
      |Loko | |Karma  | |Jasna 12  | |Radom | |01-123| |500-000-000 |
      |Spoko| |Rex    | |Ciemna 12 | |Leszno| |99-444| |100-000-000 |


    #spytac sie jak jest wiele tych samych AND?