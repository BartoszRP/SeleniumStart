Feature: Create an Account

  Scenario Outline: user creates an account
    Given an open browser with qloapps.coderslab.pl
    When User gives <email> and click Create an account button
    And User pickup his gender
    And User input "<firstName>"
    And User gives "<lastName>"
    And User to enter "<password>"
    And User sets Birth
    And User signs for a newsletter
    And User signs for special offers
    Then User registered
    Examples:
      | email               |  | firstName |  | lastName |  | password |
      | terrgger@gmail.com  |  | Tadek     |  | Wek      |  | Admin123 |
      | keergrg@gmail.com   |  | Bodzio    |  | Krak     |  | Admin333 |
      | sferggerg@gmail.com |  | Jozio     |  | Mak      |  | Admin999 |
      | sfgerg@gmail.com    |  | Marian    |  | Dal      |  | 1968409  |
      | hergmail.com        |  | Kazik     |  | Gruby    |  | dwed684  |
      | hergk@gmail.com     |  | Jasiu     |  | Chudy    |  | thtrh801 |

    #czemu sa niektore w "" a email nie?
  #czy mozna zparametryzowac Birth jak jest lista do wyboru?




