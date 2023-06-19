package steps;

import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.ClientPage;
import pages.LogInPage;

public class ClientPageSteps {

    ClientPage clientPage = new ClientPage(DriverFactory.getDriver());

    String clientNumber=" ";

    @Given("User should log in with username {string} and password {string} to the admin panel")
    public void user_should_log_in_with_username_and_password_to_the_admin_panel(String string, String string2) {
        LogInPage logInPage = new LogInPage(DriverFactory.getDriver());
        logInPage.enterUserName(string);
        logInPage.enterPassword(string2);
        logInPage.clickSubmit();

    }

    @When("User clicks on client icon on left tool bar")
    public void user_clicks_on_client_icon_on_left_tool_bar() {
        String Message = clientPage.verifyClientManage();
        Assert.assertEquals(Message, "Manage Client");

    }

    @Then("Manage client page displays with list of clients")
    public void manage_client_page_displays_with_list_of_clients() {
        String clientData = clientPage.fetchAndDisplayData();
        if (clientData.length() > 0) {
            System.out.println(clientData);
        } else {
            Assert.fail();
        }
    }

    @When("User enters code number inside search box on manage client page")
    public void user_enters_code_number_inside_search_box_on_manage_client_page() {
     clientPage.enterCodeDetails();
    }

    @When("User clicks on search button manage client page")
    public void user_clicks_on_search_button_manage_client_page() {
    clientPage.clickOnButton();
    }

    @Then("Appropriate client information displays inside table on manage client page")
    public void appropriate_client_information_displays_inside_table_on_manage_client_page() {
     String clientCode=clientPage.verifyClient();
     Assert.assertEquals(clientCode,"RAOA-0001");
    }

    @When("User selects appropriate option from Active dropdown on manage client page")
    public void user_selects_appropriate_option_from_active_dropdown_on_manage_client_page() {
        clientPage.selectClientStatus();

    }

    @When("User clicks on search button")
    public void user_clicks_on_search_button() {
      clientPage.clickOnButton();
    }

    @When("User clicks on client code on manage client page")
    public void user_clicks_on_client_code_on_manage_client_page() {
    clientPage.clickClientCode();
    }

    @Then("Client status displays on view client page")
    public void client_status_displays_on_view_client_page() {
     String Status=clientPage.verifyClientStatus();
     Assert.assertEquals(Status,"Active");
    }

//To check whether add quote page is displays for same user by clicking on add button on view client page
    @When("User clicks on client code on manage client page to add quote")
    public void user_clicks_on_client_code_on_manage_client_page_to_add_quote() {
        clientNumber= clientPage.clickClientCodeToGetClientNumber();

    }

    @When("User clicks on add button on view client page")
    public void user_clicks_on_add_button_on_view_client_page() {
     clientPage.clickOnAddQuoteButton();
    }

    @Then("Add quote page displays with same client code")
    public void add_quote_page_displays_with_same_client_code() {
        String clientId = clientPage.verifyExistingClientOnAddQuote();
        if(clientId.equals(clientNumber))
        {
            System.out.println("Add quote page displays with Same client details ");
        }
        else {
            System.out.println("Add quote page displays with different client details ");
        }


    }

    //Add client scenario

    @When("User clicks on add client icon on manage client page")
    public void user_clicks_on_add_client_icon_on_manage_client_page() {
        clientPage.clickOnAddClientButton();
    }

    @When("User enters all mandatory details on add client page")
    public void user_enters_all_mandatory_details_on_add_client_page() {
        clientPage.enterUserDetails();
    }

    @When("User clicks on create button on add client page")
    public void user_clicks_on_create_button_on_add_client_page() {
        clientPage.clickOnCreateClientButton();
    }

    @Then("View client page appears with the details of currently added client")
    public void view_client_page_appears_with_the_details_of_currently_added_client() {
        String clientMessage=clientPage.verifyCreatedClient();
        Assert.assertEquals(clientMessage,"View Client");
    }

    //Add contact details of client
    @When("User selects Add contact option from setting dropdown besides of active text on view client page")
    public void user_selects_add_contact_option_from_setting_dropdown_besides_of_active_text_on_view_client_page() {
        clientPage.selectAddContactOfClient();
    }

    @When("User enters all details inside add client window")
    public void user_enters_all_details_inside_add_client_window() {
        clientPage.enterContactDetails();
    }

    @Then("Contact details can view under contacts menu on view client page")
    public void contact_details_can_view_under_contacts_menu_on_view_client_page() {
        String contactDetail = clientPage.verifyGeneratedContactDetails();
        if (contactDetail.length() > 0) {
            System.out.println(contactDetail);

        }
    }


    //Add notes information of client
    @When("User selects Add notes options from setting dropdown besides the active text on view client page")
    public void user_selects_add_notes_options_from_setting_dropdown_besides_the_active_text_on_view_client_page() {
        clientPage.selectAddNotesOfClient();


    }

    @When("User enters all details inside add notes window")
    public void user_enters_all_details_inside_add_notes_window() {
        clientPage.enterNotesDetails();

    }

    @Then("Notes details can view under note menu tab on view client page")
    public void notes_details_can_view_under_note_menu_tab_on_view_client_page() {
        String notesDetail = clientPage.verifyGeneratedNotesDetails();
        if (notesDetail.length() > 0) {
            System.out.println(notesDetail);

        }

    }

    //Add Task details for client

    @When("User selects Add task options from setting dropdown besides the active text on view client page")
    public void user_selects_add_task_options_from_setting_dropdown_besides_the_active_text_on_view_client_page() {
        clientPage.selectAddTaskOfClient();
    }



    @When("User enters all details inside add task window")
    public void user_enters_all_details_inside_add_task_window() {
        clientPage.enterTaskDetails();

    }

    @Then("Task details can view under task menu tab on view client page")
    public void task_details_can_view_under_task_menu_tab_on_view_client_page() {
        String taskDetail = clientPage.verifyGeneratedTaskDetails();
        if (taskDetail.length() > 0) {
            System.out.println(taskDetail);

        }

    }

    //Edit client details test case
    @When("User selects edit client sections from setting dropdown besides the active text on view client page")
    public void user_selects_edit_client_sections_from_setting_dropdown_besides_the_active_text_on_view_client_page() {
        clientPage.selectEditClientDetails();

    }

    @When("User enters all details of client on edit client window")
    public void user_enters_all_details_of_client_on_edit_client_window() {
        clientPage.editClientData();

    }

    @Then("Updated details can view on view client page")
    public void updated_details_can_view_on_view_client_page() {
        String updatedClientDetail = clientPage.verifyUpdatedClient();
        if (updatedClientDetail.length() > 0) {
            System.out.println(updatedClientDetail);

        }

    }

    //Add primary contact for client on production

    @When("User enters test client code inside search box on manage client page")
    public void user_enters_test_client_code_inside_search_box_on_manage_client_page() {
        clientPage.enterClientCode();

    }

    @When("Uer clicks on search button on manage client page")
    public void uer_clicks_on_search_button_on_manage_client_page() {
        clientPage.clickOnSearchButton();
    }

    @When("User clicks on client code on manage client page on production")
    public void user_clicks_on_client_code_on_manage_client_page_on_production() {
        clientPage.clickONClientCode();
    }





}
