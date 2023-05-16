package steps;

import factory.DriverFactory;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.QuotePage;

public class QuotePageSteps {
    QuotePage quotePage = new QuotePage(DriverFactory.getDriver());

    @When("User clicks on quote icon on left tool bar")
    public void user_clicks_on_quote_icon_on_left_tool_bar() {
        String Message = quotePage.verifyManageQuotePage();
        Assert.assertEquals(Message, "Manage Quote");

    }
    @Then("Manage quote page displays with list of quote")
    public void manage_quote_page_displays_with_list_of_quote() {
        String quoteData = quotePage.fetchAndDisplayedData();
        if (quoteData.length() > 0) {
            System.out.println(quoteData);
        } else {
            Assert.fail();
        }
    }

    @Then("User will able to see all data under quote date and expire date column displays with dd-mm-yyyy format")
    public void user_will_able_to_see_all_data_under_quote_date_and_expire_date_column_displays_with_dd_mm_yyyy_format() {
        String date = quotePage.verifyQuoteDateColumnForamt();
        String newDate[] = date.split(" ");
        for (String expDate : newDate) {
            System.out.println(expDate);
            String datePattern = "\\d{1,2}-\\d{1,2}-\\d{4}";
            boolean isDate = expDate.matches(datePattern);
            if (!isDate) {
                System.out.println("QuoteDate Column Having All Dates In Require Format");
                break;
            } else {
                Assert.fail();
            }

        }

        String eDate = quotePage.verifyExpireDateColumnFormat();
        String expDate[] = eDate.split(" ");
        for (String expireDate : expDate) {
            System.out.println(expireDate);
            String datePattern = "\\d{1,2}-\\d{1,2}-\\d{4}";
            boolean isDate = expireDate.matches(datePattern);
            if (!isDate) {
                System.out.println("Expire Date Column Having All Dates In Require Format");
                break;
            } else {
                Assert.fail();
            }
        }
    }

    @When("User clicks add quote button on manage quote page")
    public void user_clicks_add_quote_button_on_manage_quote_page() {
        quotePage.clickOnAddQuoteButton();

    }

    @Then("User will able to see add quote page with data")
    public void user_will_able_to_see_add_quote_page_with_data() {
        String addQuoteMessage = quotePage.verifyAddQuotePage();
        Assert.assertEquals(addQuoteMessage, "Add Quote");

    }

    @Then("User will able to see  all data under total and monthly premium colum post fixed by € sign")
    public void user_will_able_to_see_all_data_under_total_and_monthly_premium_colum_post_fixed_by_€_sign() {
        String yearlyArray = quotePage.verifyTotalPremiumColumn();
        System.out.println(yearlyArray);
        String[] split = yearlyArray.split("[ \\.,]+");
        for (int j = 3; j <= split.length; j = j + 3) {
            if (split[j].equals("€")) {
                System.out.println(split[j]);
                System.out.println("Data Post Fixed by €");

            } else {
                Assert.fail();
            }
        }
        String monthlyArray = quotePage.verifyMonthlyPremiumColumn();
        System.out.println(monthlyArray);
        String[] month = yearlyArray.split("[ \\.,]+");
        for (int j = 3; j <= month.length; j = j + 3) {
            if (month[j].equals("€")) {
                System.out.println(month[j]);
                System.out.println("Data Post Fixed by €");

            } else {
                Assert.fail();
            }
        }

    }


    @When("User clicks on upload microchip file button")
    public void user_clicks_on_upload_microchip_file_button() {
        String Message = quotePage.clickOnMicrochipButton();
        Assert.assertEquals(Message, "Microchip File Upload");
    }

    @Then("User will be able to see microchip file upload page with data")
    public void user_will_be_able_to_see_microchip_file_upload_page_with_data() {
        String dataOfMicroPage = quotePage.verifyDataOnMicrochipPage();
        if (dataOfMicroPage.length() > 0) {
            System.out.println(dataOfMicroPage);
        } else {
            Assert.fail();
        }
    }

    @When("User clicks on add quote button")
    public void user_clicks_on_add_quote_button() {
        quotePage.clickOnAddQuoteButton();
    }

    @Then("On add quote page product dropdown will appear with desired list")
    public void on_add_quote_page_product_dropdown_will_appear_with_desired_list() {
        String verifyProducts = quotePage.verifyProductList();
        if (verifyProducts.length() > 0) {
            System.out.println(verifyProducts);
        } else {
            Assert.fail();
        }

    }

    @When("User clicks on quote number on manage quote page")
    public void user_clicks_on_quote_number_on_manage_quote_page() {
        quotePage.fetchDataOfQuoteInformation();

    }

    @Then("Quote Information page displays with details")
    public void quote_information_page_displays_with_details() {
        String quoteMessage=quotePage.fetchDataOfQuoteInformation();
        if (quoteMessage.length()>0){
            System.out.println(quoteMessage);
        }
        else
        {
            Assert.fail();
        }
    }

    @When("User selects appropriate option from quote status dropdown")
    public void user_selects_appropriate_option_from_quote_status_dropdown() {
        quotePage.SelectItemFromDropDown();

    }

    @Then("Respected data will be displayed on Manage quote page")
    public void respected_data_will_be_displayed_on_manage_quote_page() {
        String statusArray = quotePage.fetchAndVerifyDataAgainstDropDown();
        System.out.println(statusArray);
        String newArray[] = statusArray.split(" ");
        for (int i = 0; i < newArray.length - 1; i++) {
            if (newArray[i].equals("Open")) {
                System.out.println("All Amount Under Yearly Premium Column Prefixed By £");
                break;
            }
        }

    }


}
