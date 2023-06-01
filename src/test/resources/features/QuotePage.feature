Feature: Verify Quote Module Features


  Background:
    Given User should log in with username "sa" and password "Good2go@2019" to the admin panel
    And User selects language option
    When User clicks on quote icon on left tool bar
  @Sanity
  Scenario: Manage Quote page displays with list of quotes by clicking on quote icon on left tool bar.
    Then Manage quote page displays with list of quote
  @Sanity
  Scenario:To verify dates under Quote date and Expire date columns displays in dd-mm-yyyy format
    Then User will able to see all data under quote date and expire date column displays with dd-mm-yyyy format
  @Sanity
  Scenario: One can redirect to add quote page by clicking add quote button on top right corner of manage quote
    When User clicks add quote button on manage quote page
    Then User will able to see add quote page with data
  @Sanity
  Scenario:Data under total and monthly premium column should prefixed by £ sign
    Then User will able to see  all data under total and monthly premium colum post fixed by € sign
  @Sanity
  Scenario:To check whether user will able able to redirect and see data on microchip file upload  page after clicking on upload microchip button on manage quote page
    When User clicks on upload microchip file button
    Then User will be able to see microchip file upload page with data
  @Sanity
  Scenario:On the Add Quote page, verify that the Product dropdown appears with list of products
    When User clicks on add quote button
    Then On add quote page product dropdown will appear with desired list
  @Sanity
  Scenario: Respected quote information page will be displayed upon clicking quote number on manage quote page
    When User clicks on quote number on manage quote page
    Then Quote Information page displays with details

#  Scenario: Items on manage quote page displays upon item select from quote status dropdown
#    When User selects appropriate option from quote status dropdown
#    Then Respected data will be displayed on Manage quote page





