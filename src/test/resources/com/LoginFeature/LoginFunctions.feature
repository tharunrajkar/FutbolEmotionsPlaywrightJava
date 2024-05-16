Feature: Checking the login functions with valid UserId and Password

  Background:
    Given Users launch the URL

  @tagLogin
  Scenario Outline: Users login with valid userId and Password
    When User clicks Accept Cookies
    When User clicks the login icon
    And User enters a valid "<username>"
    And User enters a valid "<password>"
    Then Users click the login button

    Examples:
      | username               | password         |
      | aswinco351@gmail.com   | J<_)@yw4'#iP^U0  |

