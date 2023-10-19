@Smoke
Feature: Log In and Log Out

  Background:
    Given The app is loaded correctly

  @Login
  Scenario Outline: Successful Log In
    When The user enters the email <email>
    And Enters the password <password>
    And Clicks on Log In Button
    Then Home page is displayed

    Examples:
      | email                    | password    |
      | pruebaqamanual@gmail.com | Crowdar2022 |

  @Logout
  Scenario Outline: Successful Log Out
    When The user enters the email <email>
    And Enters the password <password>
    And Clicks on Log In Button
    And Clicks on the Menu button
    And Clicks on the Log Out button
    And Clicks Confirm on the confirmation pop up
    Then The user is in the Log in page

    Examples:
      | email                    | password    |
      | pruebaqamanual@gmail.com | Crowdar2022 |