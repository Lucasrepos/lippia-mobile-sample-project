@Smoke @Settings
Feature: Settings

  Background:
    Given The app is loaded correctly
    And The user is logued with email 'pruebaqamanual@gmail.com' and password 'Crowdar2022'

  Scenario: Activates Dark mode
    When Clicks on the Menu button
    And Clicks on the Settings button
    And Clicks to activate the Dark mode
    Then Dark mode is enabled
