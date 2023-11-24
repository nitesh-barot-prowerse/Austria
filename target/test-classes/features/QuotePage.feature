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
  Scenario:Data under total and monthly premium column should post fixed by £ sign
    Then User will able to see  all data under total and monthly premium colum post fixed by € sign

#  @Sanity(Not applicable)
#  Scenario:To check whether user will able able to redirect and see data on microchip file upload  page after clicking on upload microchip button on manage quote page
#    When User clicks on upload microchip file button
#    Then User will be able to see microchip file upload page with data

  @Sanity
  Scenario:On the Add Quote page, verify that the Product dropdown appears with list of products
    When User clicks on add quote button
    Then On add quote page product dropdown will appear with desired list

#  @Sanity
#  Scenario: Verify Generate and save quote feature for Dog
#    When User clicks on add quote button
#    And User selects the species value form product dropdown
#    And User enters client details form "client/client.json"
#    And User enters dog species information from "quote/dog.json"
#    And User calculate premium value
#    And User selects appropriate quote and click on save quote
#    And  User Generates policy
#
#    @Sanity
#  Scenario: Verify Generate and save quote feature for Dog for credit/debit card payment mode
#    When User clicks on add quote button
#    And User selects the species value form product dropdown
#    And User enters client details form "client/client.json"
#    And User enters dog species information from "quote/dog.json"
#    And User calculate premium value
#    And User selects appropriate quote and click on save quote
#    And User Generates policy for credit and debit card payment mode for dog

#    @Sanity
#  Scenario: Verify Generate and save quote feature for Dog with direct debit payment mode
#    When User clicks on add quote button
#    And User selects the species value form product dropdown
#    And User enters client details form "client/client.json"
#    And User enters dog species information from "quote/dog.json"
#    And User calculate premium value
#    And User selects appropriate quote and click on save quote
#    And User Generates policy for direct debit payment mode for dog

#  @Sanity
#  Scenario:Generate policy and verify save quote feature for Exotic using other payment option
#    When User clicks on add quote button
#    And User selects the exotic value form product dropdown
#    And User enters client details form "client/client.json"
#    And User enters exotic species information from "quote/exotic.json"
#    And User calculate premium value for exotic
#    And User enters all required information and click on save quote
#    And  User Generates policy for exotic

#  @Sanity
#  Scenario:Generate policy and Verify save quote feature for Exotic using credit/debit card payment option
#    When User clicks on add quote button
#    And User selects the exotic value form product dropdown
#    And User enters client details form "client/client.json"
#    And User enters exotic species information from "quote/exotic.json"
#    And User calculate premium value for exotic
#    And User enters all required information and click on save quote
#    And  User Generates policy for exotic using credit or debit card option
#
#  @Sanity
#  Scenario:Generate policy and Verify save quote feature for Exotic using direct debit payment option
#    When User clicks on add quote button
#    And User selects the exotic value form product dropdown
#    And User enters client details form "client/client.json"
#    And User enters exotic species information from "quote/exotic.json"
#    And User calculate premium value for exotic
#    And User enters all required information and click on save quote
#    And  User Generates policy for exotic using direct debit option

#  @Sanity
#  Scenario: Generate and save quote feature for Cat
#    When User clicks on add quote button
#    And User selects the cat value form product dropdown
#    And User enters client details form "client/client.json"
#    And User enters cat species information from "quote/cat.json"
#    And User calculate premium value for cat
#    And User selects appropriate quote and click on save quote for cat
#    And  User Generates policy for cat
#
#    @Sanity
#  Scenario: Generate policy and Verify save quote feature for Cat using credit and  debit card payment option
#    When User clicks on add quote button
#    And User selects the cat value form product dropdown
#    And User enters client details form "client/client.json"
#    And User enters cat species information from "quote/cat.json"
#    And User calculate premium value for cat
#    And User selects appropriate quote and click on save quote for cat
#    And  User Generates policy for cat using credit and  debit card payment option
#
#    @Sanity
#  Scenario: Generate policy and Verify save quote feature for Cat using direct debit payment option
#    When User clicks on add quote button
#    And User selects the cat value form product dropdown
#    And User enters client details form "client/client.json"
#    And User enters cat species information from "quote/cat.json"
#    And User calculate premium value for cat
#    And User selects appropriate quote and click on save quote for cat
#    And  User Generates policy for cat using  direct debit  payment option

#  @Sanity
#  Scenario: Generate and save quote  for horse breed
#    When User clicks on add quote button
#    And User selects the introductory value of horse form product dropdown
#    And User enters client details form "client/client.json"
#    And User selects horse species for introductory
#    And User enters horse species information for introductory from "quote/horse.json"
#    And User calculate premium value for horse introductory
#
#    @Sanity
#  Scenario:Generate policy and Verify save quote feature for Horse using credit and  debit card payment option
#    When User clicks on add quote button
#    And User selects the introductory value of horse form product dropdown
#    And User enters client details form "client/client.json"
#    And User selects horse species for introductory
#    And User enters horse species information for introductory from "quote/horse.json"
#    And  User Generates policy for Horse using credit and  debit card payment option
#
#    @Sanity
#  Scenario:Generate policy and Verify save quote feature for Horse using direct debit payment option
#    When User clicks on add quote button
#    And User selects the introductory value of horse form product dropdown
#    And User enters client details form "client/client.json"
#    And User selects horse species for introductory
#    And User enters horse species information for introductory from "quote/horse.json"
#    And User Generates policy for Horse using direct debit payment option


#  @Sanity
#  Scenario: Generate and save quote  for Introductory product and dog breed
#    When User clicks on add quote button
#    And User selects the introductory value form product dropdown
#    And User enters client details form "client/client.json"
#    And User selects dog species for introductory
#    And User enters dog species information for introductory from "quote/dog.json"
#    And User calculate premium value for dog introductory
#    And User selects appropriate options and click on save quote for dog
#    And  User Generates policy for dog
#
#  @Sanity
#  Scenario: Generate and save quote  for Introductory product and cat breed
#    When User clicks on add quote button
#    And User selects the introductory value form product dropdown
#    And User enters client details form "client/client.json"
#    And User selects cat species for introductory
#    And User enters cat species information for introductory from "quote/cat.json"
#    And User calculate premium value for cat introductory
#    And User selects appropriate options and click on save quote for cat
#    And  User Generates policy for cat introductory
##

#  @Sanity
#  Scenario: Generate and save quote  for Introductory product and exotic breed
#    When User clicks on add quote button
#    And User selects the introductory value form product dropdown
#    And User enters client details form "client/client.json"
#    And User selects exotic species for introductory
#    And User enters exotic species information for introductory from "quote/exotic.json"
#    And User calculate premium value for exotic introductory
#    And  User Generates policy for exotic introductory

  @Sanity
  Scenario: Respected quote information page will be displayed upon clicking quote number on manage quote page
    When User clicks on quote number on manage quote page
    Then Quote Information page displays with details

#  @Sanity(do not use )
#  Scenario: Items on manage quote page displays upon item select from quote status dropdown
#    When User selects appropriate option from quote status dropdown
#    Then Respected data will be displayed on Manage quote page

  @Sanity
  Scenario: Fetch list of quote based on product option from product dropdown on manage quote page
    When User selects appropriate option from product dropdown on manage quote page
    And User clicks on search button on manage quote page
    Then Appropriate list of quote will display

#  @Sanity
#  Scenario: Fetch list of quote based on option from Is referred dropdown on manage quote page
#    When User selects appropriate option from Is referred dropdown on manage quote page
#    And User clicks on search button on manage quote page
#    Then Appropriate list of quote will display upon drop down option
#
#  @Sanity
#  Scenario: Fetch list of quote based on option from division dropdown on manage quote page
#    When User selects appropriate option from division dropdown on manage quote page
#    And User clicks on search button on manage quote page
#    Then Appropriate list of quote will display upon division drop down option

#  @Stage
#  Scenario:Fetch quotation based on quote number on manage quote page
#    When User enters quote number inside search box on manage quote page
#    And User clicks on search button on manage quote page
#    Then Appropriate quote information displays on manage quote page

#  @Sanity
#  Scenario:Verify include payment feature of quote module
#    When User selects include payment only quotes checkbox
#    And User clicks on search button on manage quote page
#    Then Appropriate quote list displays on manage quote page

#  @Stage
#  Scenario: Edit quote details and verifies the same
#    When User selects edit quote option from cog icon on quote information page
#    Then User can edit all required field on edit quote page





