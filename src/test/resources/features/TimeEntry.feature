@Smoke @TimeEntry
Feature: Time Entries

  Background:
    Given The app is loaded correctly
    And The user is logued with email 'pruebaqamanual@gmail.com' and password 'Crowdar2022'


  Scenario Outline: Successful Time Entry
    When Clicks on the plus button
    And Set the hours '<hours>' and minutes '<minutes>'
    And Select the Crowdar Academy project on the Project Menu
    And Set the description '<description>'
    And Clicks on the save button
    Then The time entry is saved

    Examples:
      | hours | minutes | description        |
      | 02    | 05      | TP Crowdar Academy |


  Scenario Outline: Discard Time Entry
    When Clicks on the plus button
    And Set the hours '<hours>' and minutes '<minutes>'
    And Select the Crowdar Academy project on the Project Menu
    And Set the description '<description>'
    And Clicks on Back button
    And Clicks on Discard button in the confirmation pop up
    Then Time Entries Page is displayed

    Examples:
      | hours | minutes | description        |
      | 02    | 05      | TP Crowdar Academy |


  Scenario Outline: Successful Time Entry with date time
    When Clicks on the plus button
    And Set the hours '<hours>' and minutes '<minutes>'
    And Set the start date <startDate> and the end date <endDate>
    And Select the Crowdar Academy project on the Project Menu
    And Set the description '<description>'
    And Clicks on the save button
    Then The time entry is saved

    Examples:
      | hours | minutes | startDate        | endDate          | description        |
      | 02    | 05      | 21 November 2022 | 22 November 2022 | TP Crowdar Academy |

