Feature: Verify Setting Module Features

  Background:
    Given User should log in with username "sa" and password "Good2go@2019" to the admin panel
    And User selects language option
    When User clicks on look up values icon on left tool bar

  @Sanity
  Scenario: All hyperlinks with icons on setting page should work
    When User clicks on icon on setting page
    Then User will able to redirect to respected page