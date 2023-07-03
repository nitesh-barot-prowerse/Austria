package steps;

import factory.DriverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import pages.SettingPage;


public class SettingPageSteps {
    SettingPage settingPage = new SettingPage(DriverFactory.getDriver());



    @When("User clicks on look up values icon on left tool bar")
    public void user_clicks_on_look_up_values_icon_on_left_tool_bar() {
        settingPage.clickIcon();

    }

    @When("User clicks on icon on setting page")
    public void user_clicks_on_icon_on_setting_page() {
        settingPage.traversingThroughPages();

    }

    @Then("User will able to redirect to respected page")
    public void user_will_able_to_redirect_to_respected_page() {

    }

    //To verify whether Manage Policy Type page displays with policy type details by clicking on policy type icon on setting page

    @When("User clicks on policy type icon setting page")
    public void user_clicks_on_policy_type_icon_setting_page() {
        settingPage.clickOnPolicyTypeIcon();

    }

    @Then("Manage Policy Type page displays with all policy type details")
    public void manage_policy_type_page_displays_with_all_policy_type_details() {
        String policyTypeDetails = settingPage.verifyManagePolicyTypeIcon();
        if (policyTypeDetails.length() > 0) {
            System.out.println(policyTypeDetails);
        } else {
            System.out.println("Manage Policy Type displays with no policy type data");
        }

    }

    //Add policy type page  displays will all details when user clicks on add policy type icon on manage policy type page
    @When("User clicks on add policy type icon on manage policy type page")
    public void user_clicks_on_add_policy_type_icon_on_manage_policy_type_page() {
        settingPage.clickOnAddPolicyTypeIcon();

    }

    @Then("Add policy type page displays with all details")
    public void add_policy_type_page_displays_with_all_details() {
        String addPolicyTypePage = settingPage.verifyAddPolicyTypeIconPage();
        Assert.assertEquals(addPolicyTypePage, "Add Policy Type");

    }

    // Edit policy type page displays upon clicking on edit icon against policy type on manage policy type page
    @When("User clicks on edit icon against policy type on manage policy type page")
    public void user_clicks_on_edit_icon_against_policy_type_on_manage_policy_type_page() {
        settingPage.clickOnEditIconOnManagePolicyPage();

    }

    @Then("Edit policy type page displays in editable format")
    public void edit_policy_type_page_displays_in_editable_format() {
        String editPolicyTypePage = settingPage.verifyEditPolicyTypePage();
        Assert.assertEquals(editPolicyTypePage, "Edit Policy Type");

    }

    // To verify whether Manage client class page displays with client class details by clicking on client lass icon on setting page
    @When("User clicks on client class icon setting page")
    public void user_clicks_on_client_class_icon_setting_page() {
        settingPage.clickOnClientClassIcon();

    }


    @Then("Manage client class page displays with all client class details")
    public void manage_client_class_page_displays_with_all_client_class_details() {
        String clientClassDetails = settingPage.verifyManageClientClassPage();
        if (clientClassDetails.length() > 0) {
            System.out.println(clientClassDetails);
        } else {
            System.out.println("Manage Client Class Page displays with no client class data");
        }

    }

    //Add client class page  displays will all details when user clicks on add client class icon on manage class client page
    @When("User clicks on add client class icon on manage class client page")
    public void user_clicks_on_add_client_class_icon_on_manage_class_client_page() {
        settingPage.clickOnAddClientClassIcon();

    }

    @Then("Add client class page displays with all details")
    public void add_client_class_page_displays_with_all_details() {
        String addClientClassPage = settingPage.verifyAddClientClassIPage();
        Assert.assertEquals(addClientClassPage, "Add Client Class");

    }

    //Edit client class page displays upon clicking on edit icon against client class icon on manage client class page
    @When("User clicks on edit icon against client class name on manage client class page")
    public void user_clicks_on_edit_icon_against_client_class_name_on_manage_client_class_page() {
        settingPage.clickOnEditIconOnManageClientClassPage();

    }

    @Then("Edit client class page displays in editable format")
    public void edit_client_class_page_displays_in_editable_format() {
        String editClientClassPage = settingPage.verifyEditClientClassPage();
        Assert.assertEquals(editClientClassPage, "Edit Client Class");
    }

    //To verify whether Manage insurer class page displays with insurer class details by clicking on insurer lass icon on setting page

    @When("User clicks on insurer class icon setting page")
    public void user_clicks_on_insurer_class_icon_setting_page() {
        settingPage.clickOnInsurerClassIcon();
    }

    @Then("Manage insurer class page displays with all client class details")
    public void manage_insurer_class_page_displays_with_all_client_class_details() {
        String insurerClassDetails = settingPage.verifyManageInsurerClassPage();
        if (insurerClassDetails.length() > 0) {
            System.out.println(insurerClassDetails);
        } else {
            System.out.println("Manage Insurer Class Page displays with no insurer class data");
        }

    }

    //Add Insurer class page displays will all details when user clicks on add insurer class icon on manage insurer class page

    @When("User clicks on add insurer class icon on manage insurer class page")
    public void user_clicks_on_add_insurer_class_icon_on_manage_insurer_class_page() {
        settingPage.clickOnAddInsurerClassIcon();
    }

    @Then("Add insurer class page displays with all details")
    public void add_insurer_class_page_displays_with_all_details() {

        String addInsurerClassPage = settingPage.verifyAddInsurerClassPage();
        Assert.assertEquals(addInsurerClassPage, "Add Insurer Class");

    }

    //Edit Insurer class page displays upon clicking on edit icon against insurer icon on manage insurer class page

    @When("User clicks on edit icon against insurer icon on manage insurer class page")
    public void user_clicks_on_edit_icon_against_insurer_icon_on_manage_insurer_class_page() {
        settingPage.clickOnEditIconOnManageInsurerClassPage();
    }

    @Then("Edit insurer class page displays in editable format")
    public void edit_insurer_class_page_displays_in_editable_format() {
        String editInsurerClassPage = settingPage.verifyEditInsurerClassPage();
        Assert.assertEquals(editInsurerClassPage, "Edit Insurer Class");

    }

    //To verify whether Manage division page displays with division details by clicking on division icon on setting page

    @When("User clicks on division icon setting page")
    public void user_clicks_on_division_icon_setting_page() {
        settingPage.clickOnDivisionIcon();

    }

    @Then("Manage division page displays with all division details")
    public void manage_division_page_displays_with_all_division_details() {
        String divisionDetails = settingPage.verifyManageDivisionPage();
        if (divisionDetails.length() > 0) {
            System.out.println(divisionDetails);
        } else {
            System.out.println("Manage division Page displays with no division data");
        }

    }

    //Add division page displays will all details when user clicks on add division icon on manage division page

    @When("User clicks on add division icon on manage division page")
    public void user_clicks_on_add_division_icon_on_manage_division_page() {
        settingPage.clickOnAddDivisionIcon();
    }

    @Then("Add division page displays with all details")
    public void add_division_page_displays_with_all_details() {
        String addDivisionPage = settingPage.verifyAddDivisionPage();
        Assert.assertEquals(addDivisionPage, "Add Division");
    }

    //Edit division page displays upon clicking on edit icon against division name on manage division page

    @When("User clicks on edit icon icon against division name on manage division page")
    public void user_clicks_on_edit_icon_icon_against_division_name_on_manage_division_page() {
        settingPage.clickOnEditIconOnManageDivisionPage();
    }

    @Then("Edit division page displays in editable format")
    public void edit_division_page_displays_in_editable_format() {
        String editDivisionPage = settingPage.verifyEditDivisionPage();
        Assert.assertEquals(editDivisionPage, "Edit Division");

    }
    // To verify whether Manage branch page displays with branch details by clicking on branch icon on setting page

    @When("User clicks on branch icon setting page")
    public void user_clicks_on_branch_icon_setting_page() {
        settingPage.clickOnBranchIcon();
    }

    @Then("Manage branch page displays with all branch details")
    public void manage_branch_page_displays_with_all_branch_details() {
        String branchDetails = settingPage.verifyManageBranchPage();
        if (branchDetails.length() > 0) {
            System.out.println(branchDetails);
        } else {
            System.out.println("Manage branch Page displays with no branch data");
        }

    }

    //Add branch page displays will all details when user clicks on add branch icon on manage branch page
    @When("User clicks on add branch icon on manage branch page")
    public void user_clicks_on_add_branch_icon_on_manage_branch_page() {
        settingPage.clickOnAddBranchIcon();
    }

    @Then("Add branch page displays with all details")
    public void add_branch_page_displays_with_all_details() {
        String addBranchPage = settingPage.verifyAddBranchPage();
        Assert.assertEquals(addBranchPage, "Add Branch");
    }
    //Edit branch page displays upon clicking on edit icon against branch code on manage branch page

    @When("User clicks on edit icon against branch code on manage branch page")
    public void user_clicks_on_edit_icon_against_branch_code_on_manage_branch_page() {
        settingPage.clickOnEditIconOnManageBranchPage();
    }

    @Then("Edit branch page displays in editable format")
    public void edit_branch_page_displays_in_editable_format() {
        String editBranchPage = settingPage.verifyEditBranchPage();
        Assert.assertEquals(editBranchPage, "Edit Branch");
    }

    //To verify whether Manage change area page displays with area details by clicking on change area icon on setting page

    @When("User clicks on change area icon setting page")
    public void user_clicks_on_change_area_icon_setting_page() {
        settingPage.clickOnChangeAreaIcon();
    }

    @Then("Manage change area page displays with all area details")
    public void manage_change_area_page_displays_with_all_area_details() {
        String changeAreaDetails = settingPage.verifyManageChangeAreaPage();
        if (changeAreaDetails.length() > 0) {
            System.out.println(changeAreaDetails);
        } else {
            System.out.println("Change area Page displays with no area data");
        }
    }

    //Add change area page displays will all details when user clicks on add change area icon on manage change area  page
    @When("User clicks on add change area icon on manage change area  page")
    public void user_clicks_on_add_change_area_icon_on_manage_change_area_page() {
        settingPage.clickOnAddChangeAreaIcon();
    }

    @Then("Add change area page displays with all details")
    public void add_change_area_page_displays_with_all_details() {
        String addChangeAreaPage = settingPage.verifyAddChangeAreaPage();
        Assert.assertEquals(addChangeAreaPage, "Add Change Area");
    }

    //Edit change area page displays upon clicking on edit icon against change area name on manage change area page

    @When("User clicks on edit icon against change area name on manage change area page")
    public void user_clicks_on_edit_icon_against_change_area_name_on_manage_change_area_page() {
        settingPage.clickOnEditIconOnManageChangeAreaPage();
    }

    @Then("Edit change area page displays in editable format")
    public void edit_change_area_page_displays_in_editable_format() {
        String editBranchPage = settingPage.verifyEditChangeAreaPage();
        Assert.assertEquals(editBranchPage, "Edit Change Area");
    }

    //To verify whether Manage sex page of pet displays with pet sex details by clicking on change sex icon on setting page

    @When("User clicks on sex icon on setting page")
    public void user_clicks_on_sex_icon_on_setting_page() {
        settingPage.clickOnSexIcon();
    }

    @Then("Manage sex page displays with all area details")
    public void manage_sex_page_displays_with_all_area_details() {
        String sexDetails = settingPage.verifyManageChangeAreaPage();
        if (sexDetails.length() > 0) {
            System.out.println(sexDetails);
        } else {
            System.out.println("Sex Page of pet displays with no data");
        }
    }

    //Add sex page of pet displays will all details when user clicks on add sex icon on manage sex page
    @When("User clicks on add sex icon on manage sex page")
    public void user_clicks_on_add_sex_icon_on_manage_sex_page() {
        settingPage.clickOnAddSexIcon();
    }

    @Then("Add sex page of pet displays with all details")
    public void add_sex_page_of_pet_displays_with_all_details() {
        String addSexPage = settingPage.verifyAddSexPage();
        Assert.assertEquals(addSexPage, "Add Sex");
    }

    //Edit sex page of pet displays upon clicking on edit icon against sex class on manage sex page of pet
    @When("User clicks on edit icon against sex class on manage sex page of pet")
    public void user_clicks_on_edit_icon_against_sex_class_on_manage_sex_page_of_pet() {
        settingPage.clickOnEditIconOnManageSexPage();

    }

    @Then("Edit sex page of pet displays in editable format")
    public void edit_sex_page_of_pet_displays_in_editable_format() {
        String editSexPage = settingPage.verifyEditSexPage();
        Assert.assertEquals(editSexPage, "Edit Sex");
    }
    //To verify whether Manage Debtor Codes of pet displays with debtor code details by clicking on debtor code icon on setting page

    @When("User clicks on debtor code on setting page")
    public void user_clicks_on_debtor_code_on_setting_page() {
        settingPage.clickOnDebtorCodeIcon();
    }

    @Then("Manage Debtor Codes page displays with all debtor code details")
    public void manage_debtor_codes_page_displays_with_all_debtor_code_details() {
        String debtorCodeDetails = settingPage.verifyManageebtorCodePage();
        if (debtorCodeDetails.length() > 0) {
            System.out.println(debtorCodeDetails);
        } else {
            System.out.println("Debtor code Page of pet displays with no data");
        }
    }
    //Add Debtor Codes page of  displays will all details when user clicks on add Debtor Code icon on manage Debtor Codes page

    @When("User clicks on add debtor code icon on manage debtor code page")
    public void user_clicks_on_add_debtor_code_icon_on_manage_debtor_code_page() {
        settingPage.clickOnAddDebtorCodeIcon();
    }

    @Then("Add debtor code page displays with all details")
    public void add_debtor_code_page_displays_with_all_details() {
        String addDebtorCodePage = settingPage.verifyAddDebtorCodePage();
        Assert.assertEquals(addDebtorCodePage, "Add Debtor Code");
    }
    //Edit debtor code page displays upon clicking on edit icon against debtor code name on manage debtor page

    @When("User clicks on edit icon against debtor code name on manage debtor page")
    public void user_clicks_on_edit_icon_against_debtor_code_name_on_manage_debtor_page() {
        settingPage.clickOnEditIconOnManageDebtorCodePage();
    }

    @Then("Edit debtor page displays in editable format")
    public void edit_debtor_page_displays_in_editable_format() {
        String editDebtorCodePage = settingPage.verifyEditDebtorCodePage();
        Assert.assertEquals(editDebtorCodePage, "Edit Debtor Code");
    }
    //To verify whether Manage renewal type page displays with renewal type details by clicking on renewal type icon on setting page

    @When("User clicks on renewal type icon on setting page")
    public void user_clicks_on_renewal_type_icon_on_setting_page() {
        settingPage.clickOnRenewalTypeIcon();
    }

    @Then("Manage renewal type page displays with all debtor code details")
    public void manage_renewal_type_page_displays_with_all_debtor_code_details() {
        String renewTypeDetails = settingPage.verifyManageebtorCodePage();
        if (renewTypeDetails.length() > 0) {
            System.out.println(renewTypeDetails);
        } else {
            System.out.println("Renew Type Page of pet displays with no data");
        }
    }
    //Add renewal type page displays will all details when user clicks on add renewal type icon on manage renewal type  page

    @When("User clicks on add renewal type icon on manage debtor code page")
    public void user_clicks_on_add_renewal_type_icon_on_manage_debtor_code_page() {
        settingPage.clickOnAddRenewalTypeIcon();
    }

    @Then("Add renewal type page displays with all details")
    public void add_renewal_type_page_displays_with_all_details() {
        String addRenewTypeCodePage = settingPage.verifyAddRenewalTypePage();
        Assert.assertEquals(addRenewTypeCodePage, "Add Renewal Type");
    }
    //Edit renewal type  page displays upon clicking on edit icon against renewal type  name on manage renewal type  page

    @When("User clicks on edit icon against renewal type name on manage renewal type page")
    public void user_clicks_on_edit_icon_against_renewal_type_name_on_manage_renewal_type_page() {
        settingPage.clickOnEditIconOnManageRenewalTypePage();
    }

    @Then("Edit renewal type page displays in editable format")
    public void edit_renewal_type_page_displays_in_editable_format() {
        String editRenewTypePage = settingPage.verifyEditRenewalTypePage();
        Assert.assertEquals(editRenewTypePage, "Edit Renewal Type");
    }


}
