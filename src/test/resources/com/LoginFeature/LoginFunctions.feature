Feature: Checking the login functions with valid UserId and Password

  Background:
    Given Users launch the URL

  @tagLogin
  Scenario Outline: Users login with valid userId and Password
    When User clicks Accept Cookies
    And User clicks the login icon
    And User enters a valid userName "<username>"
    And User enters a valid password "<password>"
    Then Users click the login button

    Examples:
      | username              | password        |
      | aswinco351@gmail.com  | J<_)@yw4'#iP^U0 |


  @tagSearchProducts
  Scenario: User searches products randomly
    When the user mouse hover on "Training Module"
    And the user clicks on "Football Clothing for Men"
    And the user applies the "Clothing for Football Player" filter
    And the user applies the "Size L" filter
    And the user applies the "Adidas" brand filter
    And the user applies the "Shorts" filter
    Then the user clicks the order by dropdown menu and selects "Price: Less expensive first"
    #Then the product list should be ordered by "Price: Less expensive first"
