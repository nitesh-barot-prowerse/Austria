Feature: Verify Policy Module Features

  Background:
    Given User should log in with username "sa" and password "Good2go@2019" to the admin panel
    And User selects language option
    When User clicks on policy icon on left tool bar
  @Sanity
  Scenario: List of policies should display by clicking on policy icon on left tool bar
    Then User can see "Manage Policy" message with all policy data
  @Sanity
  Scenario: Verify dates under start date and end date should display with dd-mm-yyyy format on manage policy page
    Then All data under Start date and And date displays in dd-mm-yyyy format
  @Sanity
  Scenario:Respected policy information should displays by clicking on individual policy number on manage policy page
    When User clicks on policy number
    Then User will redirect to policy information page
  @Sanity
  Scenario:Verify that the user can download the client's policy letter
    When User clicks on policy number link
    And User clicks on letter tab on policy information page
    And User clicks on download icon
    Then User will able to see downloaded policy page

#  Scenario: Check appropriate policy data should displays against option selected from status drop down on manage policy page
#    When User selects any options from status dropdown
#    Then Appropriate data displays on manage policy page depend on drop down option
