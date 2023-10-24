@Smoke @TimeEntry
Feature: Time Entries

  Background:
    Given The app is loaded correctly
    And The user is logued with email 'Mobile-lucas@gmail.com' and password 'Lippia2023'


  Scenario Outline: Successful Time Entry
    When Clicks on the plus button
    And Set the hours '<hours>' and minutes '<minutes>'
    And Select the Crowdar Academy project on the Project Menu
    And Set the description '<description>'
    And Clicks on the save button
    Then The time entry is saved

    Examples:
      | hours | minutes | description      |
      | 03    | 07      | Description Test |


  Scenario Outline: Discard Time Entry
    When Clicks on the plus button
    And Set the hours '<hours>' and minutes '<minutes>'
    And Select the Crowdar Academy project on the Project Menu
    And Set the description '<description>'
    And Clicks on Back button
    And Clicks on Discard button in the confirmation pop up
    Then Time Entries Page is displayed

    Examples:
      | hours | minutes | description      |
      | 04    | 10       | Description Test |


  Scenario Outline: Successful Time Entry with date time
    When Clicks on the plus button
    And Set the hours '<hours>' and minutes '<minutes>'
    And Set the start date <startDate> and the end date <endDate>
    And Select the Crowdar Academy project on the Project Menu
    And Set the description '<description>'
    And Clicks on the save button
    Then The time entry is saved

    Examples:
      | hours | minutes | startDate       | endDate         | description       |
      | 01    | 01      | 10 October 2022 | 22 October 2022 | TDescription Test |

