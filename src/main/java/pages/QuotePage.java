package pages;

import actions.AddQuoteForDog;
import actions.ClientActions;
import dataModels.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Log;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class QuotePage extends AddQuoteForDog {
    private WebDriver driver;

    public QuotePage(WebDriver driver) {
        this.driver = driver;
    }

    Dog dog;

    Client client;

    Exotic exotic;

    Cat cat;

    Horse horse;

    ClientActions clientActions = new ClientActions();

    private By quoteIcon = By.cssSelector("ul[id='side-menu']>li:nth-child(4)");
    private By displayedMessage = By.xpath("//div[@id='page-wrapper']/div[3]/div/h2");

    private By addQuoteButton = By.xpath("//div[@class=' tooltip-demo pull-right']/a[2]");

    private By messageOnAddQuotePage = By.xpath("//div[@id='page-wrapper']/div[3]/div/h2");

    private By monthlyPremiumColumn = By.xpath("//div[@id='gridName']/table/tbody[1]/tr/td[13]");

    private By microchipButton = By.xpath("//div[@class='form-group pull-right']/div/a[3]");

    private By productListDropDown = By.xpath("//div[@class='ibox-content']/div/div/div[4]/div/div/span");

    private By quoteStatusDropDown = By.xpath("//div[@class='ibox-content-search m-b-sm']/div/div/div[5]/div/div/div/button");

    private By statusOpen = By.xpath("//div[@class='ms-drop']/ul/li[1]");

    //****Dog information***//
    private By titleDropdown = By.xpath("//div[@id='divfname']/div[1]/div/div/span");

    private By optionOfTitleDD = By.xpath("//ul[@id='Title_listbox']/li[2]");

    private By firstName = By.cssSelector("input[id='FirstName']");

    private By lastName = By.cssSelector("input[id='LastName']");

    private By birthDate = By.cssSelector("input[id='BirthDate']");

    private By Email = By.cssSelector("input[id='Email']");

    private By addressCode = By.cssSelector("input[id='Address1']");

    private By optionOfAddressCode = By.xpath("//div[@id='cc_c2a']/ul/li[4]");

    private By contactNumber = By.cssSelector("input[id='PrimaryContactNumber']");

    private By dogSpeciesOption = By.xpath("//ul[@id='PrimaryProductId_listbox']/li[4]");

    private By petDogName = By.cssSelector("input[id='Question_11307']");

    private By breedCategoryDropDown = By.xpath("//div[@id='Div_11308']/div/div/span");

    private By optionOfBreedCategoryDD = By.xpath("//ul[@id='Question_11308_listbox']/li[3]");

    private By breedSubCategoryDropDown = By.xpath("//div[@id='Div_11433' ]/div/div/span");

    private By optionOfBreedSubCategoryDD = By.xpath("//ul[@id='Question_11433_listbox' ]/li[4]");

    private By breedSubSecondCategory = By.xpath("//div[@id='Div_11434' ]/div/div/span");

    private By optionOfBreedSecondSubCategoryDD = By.xpath("//ul[@id='Question_11434_listbox' ]/li[5]");

    private By petDogGenderDropDown = By.xpath("//div[@id='Div_11312']/div/div/span");

    private By optionOfPetDogGenderDD = By.xpath("//ul[@id='Question_11312_listbox']/li[2]");

    private By petDogDateOfBirth = By.cssSelector("input[id='Question_11313']");

    private By petDogPrice = By.cssSelector("input[id='Question_11314']");

    private By calculatePremiumButton = By.xpath("//button[@id='btnCalculate']");

    private By selectSuperiorPlanIcon = By.xpath("//div[@id='GridMonthly']/table/thead/tr[2]/th[2]/input");

    private By closeButtonOfPlan = By.xpath("//div[@id='myModal']/div/div/div[3]/button");

    private By saveQuoteButton = By.xpath("//div[@id='divQuoteSavebutton']/div/div/button[2]");

    private By coverStartDate = By.cssSelector("input[id='Question_11435']");

    private By microchipNumberOfPet = By.cssSelector("input[id='Question_11319']");

    private By questionOne = By.cssSelector("input[id='Question_11430_647']");

    private By questionTwo = By.cssSelector("input[id='Question_11336_661']");

    private By questionThree = By.cssSelector("input[id='Question_11415_678']");

    private By paymentFrequency = By.cssSelector("input[id='PremiumFrequency_2']");

    private By paymentOptionDropDown = By.xpath("//div[@id='divPayment']/div/div/div/div/span/span/span");

    private By optionOfPaymentDropDown = By.xpath("//ul[@id='PaymentTenderId_listbox']/li[5]");

    private By optionOfPaymentDebitCardDropDown = By.xpath("//ul[@id='PaymentTenderId_listbox']/li[3]");

    private By optionOfPaymentDirectDebitDD=By.xpath("//ul[@id='PaymentTenderId_listbox']/li[4]");

    private By cardTypeDropDown=By.xpath("//div[@id='divCreditCardDetail']/div[1]/div/div/div/span");

    private By optionOfCardTyeDD=By.xpath("//ul[@id='CardType_listbox']/li[2]");

    private By cardHolderName=By.cssSelector("input[name='customerfirstname']");

    private By cardNumber=By.cssSelector("input[id='st-card-number-input']");

    private By cardExpireDate=By.cssSelector("input[id='st-expiration-date-input']");

    private By cardCvv=By.cssSelector("input[id='st-security-code-input']");

    private By payButton=By.cssSelector("button[id='st-form__submit']");



    private By directDebitAccountHolderName=By.id("DirectDebitAccountName");

    private By directDebitAccountHolderNumber=By.id("DirectDebitAccountNumber");

    private By createPolicyButton = By.xpath("//div[@id='divQuotebutton']/div[2]/div/div/button[2]");

    //Exotic Information

    private By optionOfExoticFromProductDD = By.xpath("//ul[@id='PrimaryProductId_listbox']/li[2]");

    private By agentDropDown = By.xpath("//div[@id='Div_33020']/div/div/span");

    private By optionOfAgentDD = By.xpath("//ul[@id='Question_33020_listbox']/li[3]");

    private By brandOption = By.cssSelector("input[id='Question_234_279']");

    private By speciesDropDownOfExotic = By.xpath("//div[@id='Div_138']/div/div/span");

    private By optionOfSpeciesExoticDD = By.xpath("//ul[@id='Question_138_listbox']/li[4]");

    private By exoticPetName = By.cssSelector("input[id='Question_139']");

    private By petGenderOfExoticDropDown = By.xpath("//div[@id='Div_140']/div/div/span");

    private By optionOfPetGenderExoticDD = By.xpath("//ul[@id='Question_140_listbox']/li[2]");

    private By exoticDateOfBirth = By.cssSelector("input[id='Question_141']");

    private By exoticPrice = By.cssSelector("input[id='Question_142']");

    private By plusPlanCheckBox = By.xpath("//div[@id='tab-MonthlyPremiumCalculation']/div/div/div/div/div/table/tbody/tr/th[3]/input");

    private By planStartDate = By.cssSelector("input[id='Question_80']");

    private By questionOneExotic = By.cssSelector("input[id='Question_82_340']");

    private By termsAndCondition = By.cssSelector("input[id='Question_137']");

    //Cat Information

    private By optionOfCatFromProductDD = By.xpath("//ul[@id='PrimaryProductId_listbox']/li[3]");

    private By agentDropDownForCat = By.xpath("//div[@id='Div_33020']/div/div/span");

    private By optionOfAgentForCatDD = By.xpath("//ul[@id='Question_33020_listbox']/li[3]");


    private By speciesDropDownOfCat = By.xpath("//div[@id='Div_11366']/div/div/span");

    private By optionOfSpeciesCatDD = By.xpath("//ul[@id='Question_11366_listbox']/li[4]");

    private By catPetName = By.cssSelector("input[id='Question_11365']");

    private By petGenderOfCatDropDown = By.xpath("//div[@id='Div_11367']/div/div/span");

    private By optionOfPetGenderCatDD = By.xpath("//ul[@id='Question_11367_listbox']/li[2]");

    private By catDateOfBirth = By.cssSelector("input[id='Question_11368']");

    private By catPrice = By.cssSelector("input[id='Question_11369']");

    private By promoCode = By.cssSelector("input[id='Question_11371']");

    private By closeButtonOfPlanForCat = By.xpath("//div[@id='premiumCalculationModal']/div/div/div[3]/button");

    private By coverStartDateForCat = By.cssSelector("input[id='Question_11486']");

    private By microchipNumberOfCat = By.cssSelector("input[id='Question_11372']");

    private By questionOneForCat = By.cssSelector("input[id='Question_11378_609']");

    private By questionTwoForCat = By.cssSelector("input[id='Question_11385_720']");

    private By questionThreeForCat = By.cssSelector("input[id='Question_11409_637']");

    private By paymentFrequencyForCat = By.cssSelector("input[id='PremiumFrequency_2']");

    private By paymentOptionDropDownForCat = By.xpath("//div[@id='divPayment']/div/div/div/div/span/span/span");

    private By optionOfPaymentDropDownForCat = By.xpath("//ul[@id='PaymentTenderId_listbox']/li[4]");

    private By createPolicyButtonForCat = By.xpath("//div[@id='divQuotebutton']/div[2]/div/div/button[2]");

    //Introductory horse information

    private By optionOfHorseIntroductoryDD = By.xpath("//ul[@id='PrimaryProductId_listbox']/li[6]");

    private By horseRadioButton = By.cssSelector("input[id='CBHorse']");

    private By addAgentIntroductoryHorseDropDown = By.xpath("//div[@id='Div_33020']/div/div/span/span");

    private By optionOfAgentIntroductoryHorseDD = By.xpath("//ul[@id='Question_33020_listbox']/li[3]");

    private By petHorseName = By.cssSelector("input[id='Question_20000']");

    private By petHorseBreedDrpDown = By.xpath("//div[@id='Div_20001']/div/div/span");

    private By optionOfPetHorseBreedDD = By.xpath("//ul[@id='Question_20001_listbox']/li[5]");

    private By petHorseGenderDropDown = By.xpath("//div[@id='Div_20002']/div/div/span");

    private By optionOfPetHorseGenderDD = By.xpath("//ul[@id='Question_20002_listbox']/li[3]");

    private By horseDateOfBirth = By.cssSelector("input[id='Question_20003']");

    private By horseColorDropDown = By.xpath("//div[@id='Div_20004']/div/div/span");

    private By optionOfHorseColorDD = By.xpath("//ul[@id='Question_20004_listbox']/li[4]");

    private By horseHeight = By.cssSelector("input[id='Question_20005']");

    private By horsePurchaseTypeDropDown = By.xpath("//div[@id='Div_20006']/div/div/span");

    private By optionOfHorsePurchaseTypeDD = By.xpath("//ul[@id='Question_20006_listbox']/li[2]");

    private By horseStudFees = By.cssSelector("input[id='Question_20079']");

    private By horseMarketValue = By.cssSelector("input[id='Question_20008']");

    private By horseActivityDropDown = By.xpath("//div[@id='Div_20009']/div/div/div/div");

    private By optionOfHorseActivityDD = By.xpath("//ul[@id='Question_20009_listbox']/li[4]");

    private By calculateOfHorse = By.cssSelector("button[id='btnCalculate']");

    private By basicPlanHorse = By.cssSelector("input[id='chkBaicMonthly']");

    private By policyStartDate = By.cssSelector("input[id='Question_22071']");

    private By microChipNumberHorse = By.cssSelector("input[id='Question_22070']");

    private By disclosureHorse = By.cssSelector("input[id='Question_20029']");

    private By question1Horse = By.cssSelector("input[id='Question_20030_8016']");
    private By question2Horse = By.cssSelector("input[id='Question_20032_8018']");
    private By question3Horse = By.cssSelector("input[id='Question_20034_8020']");

    private By question4Horse = By.cssSelector("input[id='Question_20036_8022']");

    private By question5Horse = By.cssSelector("input[id='Question_20038_8023']");

    private By question6Horse = By.cssSelector("input[id='Question_20040_8025']");

    private By question7Horse = By.cssSelector("input[id='Question_22029_9016']");
    private By question8Horse = By.cssSelector("input[id='Question_22031_9019']");
    private By question9Horse = By.cssSelector("input[id='Question_22033_9022']");

    private By question10Horse = By.cssSelector("input[id='Question_22035_9024']");

    private By question11Horse = By.cssSelector("input[id='Question_22037_9026']");

    private By question12Horse = By.cssSelector("input[id='Question_22039_9028']");

    private By question13Horse = By.cssSelector("input[id='Question_22076']");

    private By question14Horse = By.cssSelector("input[id='Question_22077']");

    private By question15Horse = By.cssSelector("input[id='Question_22078']");

    private By acceptCondition = By.xpath("//div[@class='modal-body']/div/div[4]/div/button[2]");

    //Introductory product

    private By optionOfIntroductoryFromProductDD = By.xpath("//ul[@id='PrimaryProductId_listbox']/li[5]");

    private By petTypeDropDown = By.xpath("//div[@id='Div_31000']/div/div/span/span");

    private By optionOfPetTypeDD = By.xpath("//ul[@id='Question_31000_listbox']/li[3]");

    private By introductoryRegistrationDropDown = By.xpath("//div[@id='Div_31001']/div/div/span/span/span[2]");

    private By optionIntroductoryDD = By.xpath("//ul[@id='Question_31001_listbox']/li[2]/table/tbody/tr/td[4]/span");

    private By petNameDogIntroductory = By.cssSelector("input[id='Question_11307']");

    private By petBreedDropDown = By.xpath("//div[@id='Div_11308']/div/div/span");

    private By optionOfPetBreedDD = By.xpath("//ul[@id='Question_11308_listbox']/li[3]");

    private By petBreedCrossedWith = By.xpath("//div[@id='Div_11433']/div/div/span");

    private By optionOfPetBreedCrossDD = By.xpath("//ul[@id='Question_11433_listbox']/li[5]");

    private By petBreedCrossedWithSecond = By.xpath("//div[@id='Div_11434']/div/div/span");

    private By optionOfPetBreedCrossedWithSecondDD = By.xpath("//ul[@id='Question_11434_listbox']/li[4]");

    private By petGenderDropDownIntroductory = By.xpath("//div[@id='Div_11312']/div/div/span");

    private By optionOgPetGenderDDOfIntroductory = By.xpath("//ul[@id='Question_11312_listbox']/li[3]");

    private By dateOfBirthIntroductoryDog = By.cssSelector("input[id='Question_11313']");

    private By priceIntroductoryDog = By.cssSelector("input[id='Question_11314']");

    private By petDogCollectionDate = By.cssSelector("input[id='Question_32000']");

    private By calculateQuoteIntroductory = By.cssSelector("button[id='btnCalculate']");

    private By microchipNumberForIntroductoryNumber = By.cssSelector("input[id='Question_33000']");

    private By radioButtonIntroductory = By.cssSelector("input[id='Question_30001_30000']");

    private By createPolicyButtonOfIntroductory = By.cssSelector("button[id='BindButton']");

    //Introductory cat Information

    private By optionOfIntroductoryCatOption = By.xpath("//ul[@id='Question_31000_listbox']/li[2]");

    private By petNameIntroductoryCat = By.cssSelector("input[id='Question_11365']");

    private By petBreedDropDownIntroductoryCat = By.xpath("//div[@id='Div_11366']/div/div/span");

    private By optionOfPetBreedIntroductoryCat = By.xpath("//ul[@id='Question_11366_listbox']/li[3]");

    private By petGenderDropDownIntroductoryCat = By.xpath("//div[@id='Div_11367']/div/div/span");

    private By optionPetGenderIntroductoryCat = By.xpath("//ul[@id='Question_11367_listbox']/li[3]");

    private By petDateOfBirthIntroductoryCat = By.cssSelector("input[id='Question_11368']");

    private By petPriceIntroductoryCat = By.cssSelector("input[id='Question_11369']");

    private By petBeingCollectedCat = By.cssSelector("input[id='Question_32000']");

    private By calculateButtonIntroductoryCat = By.cssSelector("button[id='btnCalculate']");

    private By microchipNUmberForIntroductoryCat = By.cssSelector("input[id='Question_33000']");

    private By radioButtonIntroductoryCat = By.cssSelector("input[id='Question_30051_30006']");

    private By createPolicyButtonIntroductoryCat = By.cssSelector("button[id='BindButton']");

    //Introductory exotic information

    private By optionOfIntroductoryExoticOption = By.xpath("//ul[@id='Question_31000_listbox']/li[4]");

    private By petNameIntroductoryExotic = By.cssSelector("input[id='Question_139']");

    private By petBreedDropDownIntroductoryExotic = By.xpath("//div[@id='Div_138']/div/div/span/span");

    private By optionOfPetBreedIntroductoryExotic = By.xpath("//ul[@id='Question_138_listbox']/li[3]");

    private By petGenderDropDownIntroductoryExotic = By.xpath("//div[@id='Div_140']/div/div/span");

    private By optionPetGenderIntroductoryExotic = By.xpath("//ul[@id='Question_140_listbox']/li[3]");

    private By petDateOfBirthIntroductoryExotic = By.cssSelector("input[id='Question_141']");

    private By petPriceIntroductoryExotic = By.cssSelector("input[id='Question_142']");

    private By calculateButtonIntroductoryExotic = By.cssSelector("button[id='btnCalculate']");

    private By microchipNUmberForIntroductoryExotic = By.cssSelector("input[id='Question_33000']");

    private By radioButtonIntroductoryExotic = By.cssSelector("input[id='Question_30051_30006']");

    private By createPolicyButtonIntroductoryExotic = By.cssSelector("button[id='BindButton']");


    //Fetch quote list based upon product dropdown options

    private By productDropdown = By.xpath("//div[@class='ibox-content-search m-b-sm']/div[1]/div[1]/div[2]/div/span");

    private By optionsFromProductDD = By.xpath("//ul[@id='ProductId_listbox']/li[3]");

    private By isReferredDropdown = By.xpath("//div[@class='ibox-content-search m-b-sm']/div[1]/div[1]/div[3]/div/span");

    private By optionsFromIsReferredDD = By.xpath("//ul[@id='IsReferRequired_listbox']/li[2]");

    private By divisionDropdown = By.xpath("//div[@class='ibox-content-search m-b-sm']/div[1]/div[2]/div[4]/div/span");

    private By optionsFromDivisionDD = By.xpath("//ul[@id='DivisionId_listbox']/li[2]");


    private By detailsOfQuotes = By.xpath("//div[@id='gridName']/table/tbody/tr");

    private By searchButton = By.cssSelector("button[id='SearchGrid']");


    //Fetch quote on manage quote page based on quote number

    private By quoteSearchBox = By.cssSelector("input[id='QuoteNumber']");

    //Verify include payment feature of quote module for Qa

    private By includePaymentCheckBox = By.cssSelector("div[id='search']>:nth-child(1)>:nth-child(6)>:nth-child(1)>div[class^='icheckbox_square-green']");


    //Edit quote information and verifies the same

    private By selectCogIcon = By.xpath("//div[@id='gridName']/table/tbody/tr[1]/td[18]/ul/li[1]/a");

    private By selectEditQuoteIcon = By.xpath("//div[@id='gridName']/table/tbody/tr[1]/td[18]/ul/li[1]/ul/li[1]/a");

    private By enterPostCodeInAddressDropDown = By.cssSelector("input[id='Address1']");

    private By selectPostCodeFromDD = By.xpath("//div[@id='cc_c2a']/ul/li[3]");

    private By hearAboutUsDropDown = By.xpath("//div[@id='divhear']");

    private By selectOptionFromHearAboutUsDD = By.xpath("//ul[@id='HearAboutUs_listbox']/li[3]");

    private By petSpeciesDropDown = By.xpath("//div[@id='Div_11366']/div/div/span");

    private By selectOptionFromPetSpeciesDD = By.xpath("//ul[@id='Question_11366_listbox']/li[6]");

    private By petName = By.xpath("//div[@id='Div_11365']/div/div/input");

    private By petGenderDropDown = By.xpath("//div[@id='Div_11367']/div/div/span");

    private By selectOptionsFromPetGDD = By.xpath("//ul[@id='Question_11367_listbox']/li[2]");

    private By petBirthDate = By.cssSelector("input[id='Question_11368']");

    private By petPurchaseAmount = By.xpath("//div[@id='Div_11369']/div/div/span/span/input[@id='Question_11369']");

    private By petAdminFees = By.cssSelector("input[id='Question_11370']");

    private By calculateButton = By.xpath("//button[@id='btnCalculate']");

    //  private By calculateButton = By.xpath("//button[@id='btnCalculate']");

    // private By closeButton = By.xpath("//button[@class='btn btn-primary' and @data-dismiss='modal']");

    // private By saveButton = By.xpath("//div[@id='divQuoteSavebutton']/div[2]/div/button[2]");

    // private By fetchPetBreed = By.xpath("//div[@class='col-lg-4 view-column form-group ']/div[3] /div/label");


    //Manage Quote page displays with list of quotes by clicking on quote icon on left tool bar.
    public String verifyManageQuotePage() {
        driver.findElement(quoteIcon).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return driver.findElement(displayedMessage).getText();
    }

    public String fetchAndDisplayedData() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        List<WebElement> totalRow = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@id='gridName']/table/tbody/tr")));
        String array = " ";
        for (WebElement rEle : totalRow) {
            array = array + " " + rEle.getText();
        }
        return array;
    }

    //To verify dates under Quote date and Expire date columns displays in dd-mm-yyyy format

    public String verifyQuoteDateColumnForamt() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        List<WebElement> quoteDateColumn = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@id='gridName']/table/tbody[1]/tr/td[3]")));
        String date = "";
        for (WebElement quoteDate : quoteDateColumn) {
            date = date + " " + quoteDate.getText().toString();

        }
        return date;

    }

    public String verifyExpireDateColumnFormat() {
        WebDriverWait eWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        List<WebElement> expireDateColumn = eWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@id='gridName']/table/tbody[1]/tr/td[4]")));
        String date = "";
        for (WebElement expireDate : expireDateColumn) {
            date = date + " " + expireDate.getText().toString();

        }
        return date;

    }

    public void clickOnAddQuoteButton() {
        driver.findElement(addQuoteButton).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public String verifyAddQuotePage() {
        return driver.findElement(messageOnAddQuotePage).getText();
    }

    public String verifyTotalPremiumColumn() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("arguments[0].scrollIntoView();", driver.findElement(monthlyPremiumColumn));
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        List<WebElement> yearlyPremiumColum = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@id='gridName']/table/tbody[1]/tr/td[13]")));
        String yPremium = " ";
        for (WebElement amountP : yearlyPremiumColum) {
            yPremium = yPremium + " " + amountP.getText().toString();
        }
        return yPremium;
    }

    public String verifyMonthlyPremiumColumn() {
        WebDriverWait mWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        List<WebElement> monthlyPremiumColumn = mWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@id='gridName']/table/tbody[1]/tr/td[14]")));
        String yPremium = " ";
        for (WebElement amountP : monthlyPremiumColumn) {
            yPremium = yPremium + " " + amountP.getText().toString();
        }
        return yPremium;

    }

    //To check whether user will able able to redirect and see data on microchip file upload  page after clicking on upload microchip button on manage quote page

    public String clickOnMicrochipButton() {
        driver.findElement(microchipButton).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return driver.findElement(displayedMessage).getText();
    }

    public String verifyDataOnMicrochipPage() {
        WebDriverWait rWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        List<WebElement> totalRow = rWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@id='MicrochipFileUploadAuditGrid']/table/tbody/tr")));
        String data = " ";
        for (WebElement rEle : totalRow) {
            data = data + " " + rEle.getText();
        }
        return data;
    }

    //On the Add Quote page, verify that the Product dropdown appears with list of products

    public String verifyProductList() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(productListDropDown).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        List<WebElement> pList = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector("ul[id='PrimaryProductId_listbox']>li")));
        System.out.println(pList.size());

        String verfiy = " ";
        for (WebElement product : pList) {

            verfiy = verfiy + product.getText() + " ";

        }
        return verfiy;
    }

    public String fetchDataOfQuoteInformation() {
        WebDriverWait cWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        List<WebElement> totalColumn = cWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@id='gridName']/table/tbody[1]/tr/td[2]/a")));
        String displayMessage = " ";
        for (WebElement cEle : totalColumn) {
            System.out.println(cEle.getText());

            cEle.click();
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
            driver.switchTo().window(tabs2.get(1));
            System.out.println(driver.getCurrentUrl());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            displayMessage = displayMessage + driver.findElement(displayedMessage).getText();
            driver.close();
            driver.switchTo().window(tabs2.get(0));

        }
        return displayMessage;

    }


    //Verify quote generate and save feature for dog

    public void selectProductOfBreed() {

        Log.info("**********Generate Quote For Dog Test Case Starts Here************");

        driver.findElement(productListDropDown).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

        }
        driver.findElement(dogSpeciesOption).click();
        Log.info("Selected Breed Is== " + driver.findElement(dogSpeciesOption).getText());
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {

        }

    }

    public void clientDetails(String datasetFile) throws Exception {
        client = clientActions.getClientDetails(datasetFile);

        setFirstName(client.getFirstName());
        setLastName(client.getLastName());
        setBirthDate(client.getBirthDate());
        setEmail(client.getEmail());
        setAddress1(client.getAddressCode());
        setContactNumber(client.getPrimaryContactNumber());


    }

    public void setFirstName(String firstname) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(titleDropdown).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(optionOfTitleDD).click();
        Log.info("Client Title is== " + driver.findElement(optionOfTitleDD).getText());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.findElement(firstName).sendKeys(firstname);
        Log.info("Client FirstName is==" + firstname);


    }

    public void setLastName(String lastname) {
        driver.findElement(lastName).sendKeys(lastname);
        Log.info("Client LastName is==" + lastname);

    }

    public void setBirthDate(String dob) {
        driver.findElement(birthDate).sendKeys(dob);
        Log.info("Client Date Of Birth Is==" + dob);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public void setEmail(String EmailId) {
        driver.findElement(Email).sendKeys(EmailId);
        Log.info("Client Email Id Is==" + EmailId);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public void setAddress1(String postcode) {
        WebElement address = driver.findElement(By.cssSelector("input[id='Address1']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", address);

        driver.findElement(addressCode).sendKeys(postcode);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(optionOfAddressCode).click();
        Log.info("Client PostCode Is==" + driver.findElement(optionOfAddressCode).getText());
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public void setContactNumber(String contactNumbers) {
        driver.findElement(contactNumber).sendKeys(contactNumbers);
        Log.info("Client Primary Contact Number Is==" + contactNumbers);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("window.scrollBy(0,100)", "");

        driver.findElement(hearAboutUsDropDown).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(selectOptionFromHearAboutUsDD).click();
        Log.info("Client heared about company from==" + driver.findElement(selectOptionFromHearAboutUsDD).getText());

        JavascriptExecutor js2 = (JavascriptExecutor) driver;
        js2.executeScript("window.scrollBy(0,-300)", "");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void dogDetails(String datasetFile) throws Exception {
        dog = getDogDetails(datasetFile);
        setDogName(dog.getPetName());
        setDogBirthDate(dog.getBirthDate());
        setDogPrice(dog.getPrice());
    }

    public void setDogName(String firstname) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(petDogName).sendKeys(firstname);
        Log.info("Dog Name is==" + firstname);

    }

    public void setDogBirthDate(String birthDate) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(petDogDateOfBirth).sendKeys(birthDate);
        Log.info("Dog Date of birth is==" + birthDate);

    }

    public void setDogPrice(String price) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        ((JavascriptExecutor) driver).executeScript("document.getElementById('Question_11314').style.display='block';");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.findElement(petDogPrice).sendKeys(price);
        Log.info("Dog purchased price is==" + price);

    }

    public void enterDogDetails() {
        driver.findElement(breedCategoryDropDown).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(optionOfBreedCategoryDD).click();

        Log.info("Dog Breed is==" + driver.findElement(optionOfBreedCategoryDD).getText());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.findElement(breedSubCategoryDropDown).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // WebElement m = driver.findElement(By.xpath("//div[@id='Question_11309-list']/span/input"));
        //JavascriptExecutor to click element
        // JavascriptExecutor jse = (JavascriptExecutor) driver;
        // jse.executeScript("arguments[0].click();", m);
        driver.findElement(optionOfBreedSubCategoryDD).click();
        Log.info("Dog breeds subcategory is==" + driver.findElement(optionOfBreedSubCategoryDD).getText());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.findElement(breedSubSecondCategory).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        driver.findElement(optionOfBreedSecondSubCategoryDD).click();
        Log.info("Dog breeds subcategory is==" + driver.findElement(optionOfBreedSecondSubCategoryDD).getText());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        driver.findElement(petDogGenderDropDown).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(optionOfPetDogGenderDD).click();
        Log.info("Dog Gender is==" + driver.findElement(optionOfPetDogGenderDD).getText());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }

    public boolean calculateQuoteButton() {

        WebElement calculateButton = driver.findElement(By.id("btnCalculate"));

        // Scrolling down the page till the element is found
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", calculateButton);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        if (driver.findElement(calculatePremiumButton).isEnabled()) {
            driver.findElement(calculatePremiumButton).click();
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        } else {
            return false;
        }


        return true;
    }

    public void selectSuperiorPlan() {

        driver.findElement(selectSuperiorPlanIcon).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Log.info("Plan Selected By Client Is==" + driver.findElement(By.xpath("//div[@id='GridMonthly']/table/thead/tr[2]/th[2]/span")).getText());
        WebElement closeButton = driver.findElement(closeButtonOfPlan);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", closeButton);
        driver.findElement(closeButtonOfPlan).click();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public void enterQuestionDetailsOfPolicy() {
        WebElement startDateOfPolicy1 = driver.findElement(By.id("Question_11435"));
        // Scrolling down the page till the element is found
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", startDateOfPolicy1);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(coverStartDate).sendKeys("12.12.2023");
        Log.info("Cover Start Date is==12.12.2023");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(microchipNumberOfPet).sendKeys("ABC123");
        Log.info("Microchip Number Of Pet is ABC123");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(questionOne).click();
        Log.info("Client has clicked radio button 1");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(questionTwo).click();
        Log.info("Client has clicked radio button 2");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(questionThree).click();
        Log.info("Client has clicked radio button 3");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }



    }
    public void otherPaymentMode(){

        //Payment Details

        WebElement paymentFrequencyRadio = driver.findElement(By.id("PremiumFrequency_2"));
        // Scrolling down the page till the element is found
        JavascriptExecutor js3 = (JavascriptExecutor) driver;
        js3.executeScript("arguments[0].scrollIntoView();", paymentFrequencyRadio);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        JavascriptExecutor js4 = (JavascriptExecutor) driver;
        js4.executeScript("arguments[0].click();", paymentFrequencyRadio);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Log.info("Payment Frequency Option Selected By Client is==" + driver.findElement(paymentFrequency).getText());
        WebElement paymentOptionDropDown = driver.findElement(By.xpath("//div[@id='divPayment']/div/div/div/div/span/span"));
        // Scrolling down the page till the element is found
        JavascriptExecutor js5 = (JavascriptExecutor) driver;
        js5.executeScript("arguments[0].click();", paymentOptionDropDown);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement otherPaymentOption = driver.findElement(By.xpath("//ul[@id='PaymentTenderId_listbox']/li[4]"));
        JavascriptExecutor js6 = (JavascriptExecutor) driver;
        js6.executeScript("arguments[0].click();", otherPaymentOption);
       // Log.info("Mode Of Payment  Option Selected By Client is==" +otherPaymentOption.getText());

        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
        WebElement createButton=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='divQuotebutton']/div[2]/div/div/button[2]")));
        JavascriptExecutor js7 = (JavascriptExecutor) driver;
        js7.executeScript("arguments[0].click();", createButton);

      //  driver.findElement(createPolicyButton).click();
        Log.info("Client Has clicked on generate Policy button==" + driver.findElement(createPolicyButton).getText());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void creditCardPaymentMode(){
        //Payment Details

        WebElement paymentFrequencyRadio = driver.findElement(By.id("PremiumFrequency_1"));
        // Scrolling down the page till the element is found
        JavascriptExecutor js3 = (JavascriptExecutor) driver;
        js3.executeScript("arguments[0].scrollIntoView();", paymentFrequencyRadio);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        JavascriptExecutor js4 = (JavascriptExecutor) driver;
        js4.executeScript("arguments[0].click();", paymentFrequencyRadio);

        //driver.findElement(paymentFrequency).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Log.info("Payment Frequency Option Selected By Client is==" + driver.findElement(paymentFrequency).getText());
        WebElement paymentOptionDropDown = driver.findElement(By.xpath("//div[@id='divPayment']/div/div/div/div/span/span"));
        // Scrolling down the page till the element is found
        JavascriptExecutor js5 = (JavascriptExecutor) driver;
        js5.executeScript("arguments[0].click();", paymentOptionDropDown);
        // driver.findElement(paymentOptionDropDown).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement creditDebitCartPaymentOption = driver.findElement(By.xpath("//ul[@id='PaymentTenderId_listbox']/li[3]"));
        js3.executeScript("arguments[0].click();", creditDebitCartPaymentOption);
        //driver.findElement(optionOfPaymentDebitCardDropDown).click();
        Log.info("Mode Of Payment  Option Selected By Client is==" + creditDebitCartPaymentOption.getText());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        System.out.println(driver.getCurrentUrl());
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
        WebElement holderName=wait.until(ExpectedConditions.presenceOfElementLocated(cardHolderName));

        holderName.sendKeys("Nitesh Barot");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement iframeCardNumber = driver.findElement(By.id("st-card-number-iframe"));
        driver.switchTo().frame(iframeCardNumber);
        WebElement cardNumber1=wait.until(ExpectedConditions.presenceOfElementLocated(By.id("st-card-number-input")));
        cardNumber1.sendKeys("4111111111111111");
        driver.switchTo().defaultContent();
        //driver.findElement(cardNumber).sendKeys("4111111111111111");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement iframeCardExpireDate = driver.findElement(By.id("st-expiration-date-iframe"));
        driver.switchTo().frame(iframeCardExpireDate);
        driver.findElement(cardExpireDate).sendKeys("12/23");
        driver.switchTo().defaultContent();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement iframeCardSecurityCode = driver.findElement(By.id("st-security-code-iframe"));
        driver.switchTo().frame(iframeCardSecurityCode);
        driver.findElement(cardCvv).sendKeys("123");
        driver.switchTo().defaultContent();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(payButton).click();

        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.switchTo().window(tabs2.get(0));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        WebDriverWait wait1=new WebDriverWait(driver,Duration.ofSeconds(10));
        WebElement createButton=wait1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='divQuotebutton']/div[2]/div/div/button[2]")));
        JavascriptExecutor js7 = (JavascriptExecutor) driver;
        js7.executeScript("arguments[0].click();", createButton);

        //  driver.findElement(createPolicyButton).click();
       ;
        Log.info("Client Has clicked on generate Policy button==" + driver.findElement(createPolicyButton).getText());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public void directDebitPaymentMode(){
        //Payment Details

        WebElement paymentFrequencyRadio = driver.findElement(By.id("PremiumFrequency_1"));
        // Scrolling down the page till the element is found
        JavascriptExecutor js3 = (JavascriptExecutor) driver;
        js3.executeScript("arguments[0].scrollIntoView();", paymentFrequencyRadio);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        JavascriptExecutor js4 = (JavascriptExecutor) driver;
        js4.executeScript("arguments[0].click();", paymentFrequencyRadio);

        //driver.findElement(paymentFrequency).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Log.info("Payment Frequency Option Selected By Client is==" + driver.findElement(paymentFrequency).getText());
        WebElement paymentOptionDropDown = driver.findElement(By.xpath("//div[@id='divPayment']/div/div/div/div/span/span"));
        // Scrolling down the page till the element is found
        JavascriptExecutor js5 = (JavascriptExecutor) driver;
        js3.executeScript("arguments[0].click();", paymentOptionDropDown);
        // driver.findElement(paymentOptionDropDown).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement directDebitPaymentOption = driver.findElement(By.xpath("//ul[@id='PaymentTenderId_listbox']/li[4]"));
        js3.executeScript("arguments[0].click();", directDebitPaymentOption);
        //driver.findElement(optionOfPaymentDirectDebitDD).click();
        Log.info("Mode Of Payment  Option Selected By Client is==" +directDebitPaymentOption.getText());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.findElement(directDebitAccountHolderName).sendKeys("Nitesh Barot");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(directDebitAccountHolderNumber).sendKeys("AT611904300234573201");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebDriverWait wait1=new WebDriverWait(driver,Duration.ofSeconds(10));
        WebElement createButton=wait1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='divQuotebutton']/div[2]/div/div/button[2]")));
        JavascriptExecutor js7 = (JavascriptExecutor) driver;
        js7.executeScript("arguments[0].click();", createButton);
        Log.info("Client Has clicked on generate Policy button==" + driver.findElement(createPolicyButton).getText());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }


    //Create and Verify Quote and policy for exotic

    public void selectExoticProductOfBreed() {

        Log.info("**********Generate Quote For Exotic Test Case Starts Here************");

        driver.findElement(productListDropDown).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

        }
        driver.findElement(optionOfExoticFromProductDD).click();
        Log.info("Selected Breed Is==" + driver.findElement(optionOfExoticFromProductDD).getText());
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {

        }


    }

    public void exoticDetails(String datasetFile) throws Exception {
        exotic = getExoticDetails(datasetFile);
        setExoticName(exotic.getPetName());
        setExoticBirthDate(exotic.getBirthDate());
        setExoticPrice(exotic.getPrice());
    }

    public void setExoticName(String firstname) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(exoticPetName).sendKeys(firstname);
        Log.info("Exotic Species Name is==" + firstname);

    }

    public void setExoticBirthDate(String birthDate) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(exoticDateOfBirth).sendKeys(birthDate);
        Log.info("Exotic date of birth is==" + birthDate);

    }

    public void setExoticPrice(String price) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        ((JavascriptExecutor) driver).executeScript("document.getElementById('Question_142').style.display='block';");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.findElement(exoticPrice).sendKeys(price);
        Log.info("Exotic purchased price is==" + price);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(By.id("Question_143")).click();

    }

    public void enterExoticDetails() {

        driver.findElement(speciesDropDownOfExotic).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(optionOfSpeciesExoticDD).click();

        Log.info("Exotic Breed is==" + driver.findElement(optionOfSpeciesExoticDD).getText());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        driver.findElement(petGenderOfExoticDropDown).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(optionOfPetGenderExoticDD).click();
        Log.info("Exotic Gender is==" + driver.findElement(optionOfPetGenderExoticDD).getText());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }

    public void selectPlanForExoticBreed() {
        driver.findElement(plusPlanCheckBox).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
    public void enterQuestionDetailsOfPolicyForExotic() {
        WebElement startDateOfPolicy1 = driver.findElement(By.id("Question_80"));
        // Scrolling down the page till the element is found
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", startDateOfPolicy1);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(planStartDate).sendKeys("20.12.2023");
        Log.info("Cover Start Date is== 20.12.2023");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement assumptionRadioButton = driver.findElement(By.id("Question_82_340"));
        JavascriptExecutor js2 = (JavascriptExecutor) driver;
        js2.executeScript("arguments[0].scrollIntoView();", assumptionRadioButton);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", assumptionRadioButton);
        Log.info("Client has clicked radio button of assumption ");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement termsAndConditionCheckBox = driver.findElement(By.id("Question_137"));
        JavascriptExecutor executor1 = (JavascriptExecutor) driver;
        executor1.executeScript("arguments[0].click();", termsAndConditionCheckBox);
        //driver.findElement(termsAndCondition).click();
        Log.info("Client has checked terms and condition check box");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }





    //Create and Verify Quote and policy for cat
    public void selectCatProductOfBreed() {

        Log.info("********** Generate Quote For Cat Test Case Starts Here ************");

        driver.findElement(productListDropDown).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

        }
        driver.findElement(optionOfCatFromProductDD).click();
        Log.info("Selected Breed Is ==" + driver.findElement(optionOfCatFromProductDD).getText());
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {

        }


    }

    public void catDetails(String datasetFile) throws Exception {
        cat = getCatDetails(datasetFile);
        setCatName(cat.getPetName());
        setCatBirthDate(cat.getBirthDate());
        setCatPrice(cat.getPrice());
    }

    public void setCatName(String firstname) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(catPetName).sendKeys(firstname);
        Log.info("Cat Species Name is==" + firstname);

    }

    public void setCatBirthDate(String birthDate) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(catDateOfBirth).sendKeys(birthDate);
        Log.info("Cat date of birth is==" + birthDate);

    }

    public void setCatPrice(String price) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        ((JavascriptExecutor) driver).executeScript("document.getElementById('Question_11369').style.display='block';");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.findElement(catPrice).sendKeys(price);
        Log.info("Cat purchased price is==" + price);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(By.id("Question_11371")).click();

    }

    public void enterCatDetails() {
//        driver.findElement(agentDropDown).click();
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        driver.findElement(optionOfAgentDD).click();
//        Log.info("Whether Agent is selected for Cat Breed is or not== " + driver.findElement(optionOfAgentDD).getText());
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
        // driver.findElement(brandOption).click();
        //Log.info("Brand Of exotic is " + driver.findElement(brandOption).getText());
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
        driver.findElement(speciesDropDownOfCat).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(optionOfSpeciesCatDD).click();

        Log.info("Cat Breed is==" + driver.findElement(optionOfSpeciesCatDD).getText());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        driver.findElement(petGenderOfCatDropDown).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(optionOfPetGenderCatDD).click();
        Log.info("Cat Gender is== " + driver.findElement(optionOfPetGenderCatDD).getText());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }

    public void selectSuperiorPlanOfCat() {

        driver.findElement(selectSuperiorPlanIcon).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Log.info("Plan Selected By Client Is==" + driver.findElement(By.xpath("//div[@id='GridMonthly']/table/thead/tr[2]/th[2]/span")).getText());
        WebElement closeButton = driver.findElement(closeButtonOfPlanForCat);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", closeButton);
        driver.findElement(closeButtonOfPlanForCat).click();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public void enterQuestionDetailsOfPolicyForCat() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement startDateOfPolicy1 = driver.findElement(By.id("Question_11486"));
        // Scrolling down the page till the element is found
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", startDateOfPolicy1);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(coverStartDateForCat).sendKeys("12.11.2023");
        Log.info("Cover Start Date is==12.11.2023");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(microchipNumberOfCat).sendKeys("ABC123");
        Log.info("Microchip Number Of Pet is ABC123");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(questionOneForCat).click();
        Log.info("Client has clicked radio button 1");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(questionTwoForCat).click();
        Log.info("Client has clicked radio button 2");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(questionThreeForCat).click();
        Log.info("Client has clicked radio button 3");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    //Generate quote and policy for introductory product (dog)
    public void selectIntroductoryProductOfBreed() {

        Log.info("**********Generate Quote For Introductory Product Test Case Starts Here************");

        driver.findElement(productListDropDown).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

        }
        driver.findElement(optionOfIntroductoryFromProductDD).click();
        Log.info("Selected Breed Is==" + driver.findElement(optionOfExoticFromProductDD).getText());
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {

        }
    }

    public void selectDogForIntroductory() {
        driver.findElement(petTypeDropDown).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(optionOfPetTypeDD).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(introductoryRegistrationDropDown).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(optionIntroductoryDD).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public void dogDetailsIntroductory(String datasetFile) throws Exception {
        dog = getDogDetailsIntroductory(datasetFile);
        setDogNameIntordutory(dog.getPetName());
        setDogBirthDateIntordutory(dog.getBirthDate());
        setDogPriceIntordutory(dog.getPrice());
    }

    public void setDogNameIntordutory(String firstname) {
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(petNameDogIntroductory).sendKeys(firstname);
        Log.info("Dog Species Name is==" + firstname);

    }

    public void setDogBirthDateIntordutory(String birthDate) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(dateOfBirthIntroductoryDog).sendKeys(birthDate);
        Log.info("Dog date of birth is==" + birthDate);

    }

    public void setDogPriceIntordutory(String price) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        ((JavascriptExecutor) driver).executeScript("document.getElementById('Question_11314').style.display='block';");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.findElement(priceIntroductoryDog).sendKeys(price);
        Log.info("Dog purchased price is==" + price);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //driver.findElement(By.id("Question_11317")).click();

    }

    public void enterIntroductoryDogDetails() {
        driver.findElement(petBreedDropDown).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(optionOfPetBreedDD).click();
        Log.info("Pet Breed Selected is== " + driver.findElement(optionOfPetBreedDD).getText());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.findElement(petBreedCrossedWith).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(optionOfPetBreedCrossDD).click();

        Log.info("Dog Breed is==" + driver.findElement(optionOfPetBreedCrossDD).getText());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.findElement(petBreedCrossedWithSecond).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(optionOfPetBreedCrossedWithSecondDD).click();
        Log.info("Dog Breed is mixed with==" + driver.findElement(optionOfPetBreedCrossedWithSecondDD).getText());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.findElement(petGenderDropDownIntroductory).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(optionOgPetGenderDDOfIntroductory).click();
        Log.info("Dog Gender is== " + driver.findElement(optionOgPetGenderDDOfIntroductory).getText());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(petDogCollectionDate).sendKeys("26.10.2023");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(calculateQuoteIntroductory).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(calculateQuoteIntroductory).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


    public void generatePolicyFoRIntroductoryDog() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement microchipNumber = driver.findElement(By.id("Question_33000"));
        // Scrolling down the page till the element is found
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", microchipNumber);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(microchipNumberForIntroductoryNumber).sendKeys("A123");
        Log.info("Microchip Number Is Start Date is==A123");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(radioButtonIntroductory).click();
        Log.info("Click Radio Button");
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.findElement(createPolicyButtonOfIntroductory).click();
        Log.info("Client Has clicked on generate Policy button==" + driver.findElement(createPolicyButton).getText());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }

    //Generate quote and policy for introductory Cat

    public void selectCatForIntroductory() {

        Log.info("**********Generate Quote For Introductory Cat Product Test Case Starts Here************");

        driver.findElement(petTypeDropDown).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(optionOfIntroductoryCatOption).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(introductoryRegistrationDropDown).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(optionIntroductoryDD).click();

    }

    public void catDetailsIntroductory(String datasetFile) throws Exception {
        cat = getCatDetailsIntroductory(datasetFile);
        setCatNameIntordutory(cat.getPetName());
        setCatBirthDateIntordutory(cat.getBirthDate());
        setCatPriceIntordutory(cat.getPrice());
    }

    public void setCatNameIntordutory(String firstname) {
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(petNameIntroductoryCat).sendKeys(firstname);
        Log.info("Cat Species Name is==" + firstname);

    }

    public void setCatBirthDateIntordutory(String birthDate) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(petDateOfBirthIntroductoryCat).sendKeys(birthDate);
        Log.info("Cat date of birth is==" + birthDate);

    }

    public void setCatPriceIntordutory(String price) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        ((JavascriptExecutor) driver).executeScript("document.getElementById('Question_11369').style.display='block';");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.findElement(petPriceIntroductoryCat).sendKeys(price);
        Log.info("Cat purchased price is==" + price);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //driver.findElement(By.id("Question_11317")).click();

    }

    public void enterIntroductoryCatDetails() {
        driver.findElement(petBreedDropDownIntroductoryCat).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(optionOfPetBreedIntroductoryCat).click();
        Log.info("Pet Breed Selected is== " + driver.findElement(optionOfPetBreedIntroductoryCat).getText());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        driver.findElement(petGenderDropDownIntroductoryCat).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(optionPetGenderIntroductoryCat).click();
        Log.info("Cat Gender is== " + driver.findElement(optionPetGenderIntroductoryCat).getText());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        ((JavascriptExecutor) driver).executeScript("document.getElementById('Question_11369').style.display='block';");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.findElement(petPriceIntroductoryCat).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(calculateButtonIntroductoryCat).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(calculateButtonIntroductoryCat).click();
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


    public void generatePolicyFoRIntroductoryCat() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement microchipNumber = driver.findElement(By.id("Question_33000"));
        // Scrolling down the page till the element is found
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", microchipNumber);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(microchipNUmberForIntroductoryCat).sendKeys("A123");
        Log.info("Microchip Number Is Start Date is==A123");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(radioButtonIntroductoryCat).click();
        Log.info("Click Radio Button");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.findElement(createPolicyButtonIntroductoryCat).click();
        Log.info("Client Has clicked on generate Policy button==" + driver.findElement(createPolicyButtonIntroductoryCat).getText());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }

    //Generate quote and policy for Horse

    public void selectHorseProductOfBreed() {

        Log.info("**********Generate Quote For Horse Product Test Case Starts Here************");

        driver.findElement(productListDropDown).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

        }
        driver.findElement(optionOfHorseIntroductoryDD).click();
        Log.info("Selected Breed Is==" + driver.findElement(optionOfHorseIntroductoryDD).getText());
        try {
            Thread.sleep(30000);
        } catch (InterruptedException e) {

        }
    }

    public void selectHorseForIntroductory() {
        //WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
        //WebElement horseRadio=wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input[id='CBHorse']")));
        //horseRadio.click();
        WebElement horseRadio = driver.findElement(By.id("CBHorse"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", horseRadio);
        //driver.findElement(horseRadioButton).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }

    public void horseDetails(String datasetFile) throws Exception {
        horse = getHorseDetails(datasetFile);
        setHorseName(horse.getPetName());
        setHorseBirthDate(horse.getBirthDate());
        setHorseHeight(horse.getHeight());
        setHorseStudFees(horse.getStudprice());
        setHorsePrice(horse.getPrice());
    }

    public void setHorseName(String firstname) {
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(petHorseName).sendKeys(firstname);
        Log.info("Horse Species Name is==" + firstname);

    }

    public void setHorseBirthDate(String birthDate) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(horseDateOfBirth).sendKeys(birthDate);
        Log.info("Horse date of birth is==" + birthDate);

    }

    public void setHorseHeight(String height) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(horseHeight).sendKeys(height);
        Log.info("Horse height is==" + height);

    }

    public void setHorseStudFees(String studFees) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement studFee = driver.findElement(By.id("Question_20079"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", studFee);
        driver.findElement(horseStudFees).sendKeys(studFees);
        Log.info("Horse stud fees is==" + studFees);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }

    public void setHorsePrice(String price) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        ((JavascriptExecutor) driver).executeScript("document.getElementById('Question_20008').style.display='block';");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.findElement(horseMarketValue).sendKeys(price);
        Log.info("Horse Market Values is==" + price);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(By.id("Question_20027")).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //driver.findElement(By.id("Question_11317")).click();

    }

    public void enterHorseDetails() {
//        driver.findElement(addAgentIntroductoryHorseDropDown).click();
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        driver.findElement(optionOfAgentIntroductoryHorseDD).click();
//        Log.info("Agent Value is== " + driver.findElement(optionOfAgentIntroductoryHorseDD).getText());
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }


        driver.findElement(petHorseBreedDrpDown).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(optionOfPetHorseBreedDD).click();
        Log.info("Horse Breed is== " + driver.findElement(optionOfPetHorseBreedDD).getText());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.findElement(petHorseGenderDropDown).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(optionOfPetHorseGenderDD).click();
        Log.info("Horse Gender is== " + driver.findElement(optionOfPetHorseGenderDD).getText());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(horseColorDropDown).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(optionOfHorseColorDD).click();
        Log.info("Horse Color is== " + driver.findElement(optionOfHorseColorDD).getText());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(horsePurchaseTypeDropDown).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(optionOfHorsePurchaseTypeDD).click();
        Log.info("Horse Purchase Type is== " + driver.findElement(optionOfHorsePurchaseTypeDD).getText());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(horseActivityDropDown).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(optionOfHorseActivityDD).click();
        Log.info("Horse Activity is== " + driver.findElement(optionOfHorseActivityDD).getText());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }


    public void selectPlanAndEnterQuestionOfPolicyForHorse() {

        WebElement btncalc = driver.findElement(By.id("btnCalculate"));
        // Scrolling down the page till the element is found
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", btncalc);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement calculate = driver.findElement(By.id("btnCalculate"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", calculate);
        // driver.findElement(calculateOfHorse).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(basicPlanHorse).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
//        driver.findElement(By.xpath("//div[@class='modal-footer']/button")).click();
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
        WebElement startDate = driver.findElement(By.id("Question_22071"));
        // Scrolling down the page till the element is found
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("arguments[0].scrollIntoView();", startDate);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(policyStartDate).sendKeys("20.12.2023");
        Log.info("Policy Start Date is==25.10.2023");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(microChipNumberHorse).sendKeys("A123");
        Log.info("Microchip Number Of Horse is==A123");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(disclosureHorse).click();
        Log.info("Client Has clicked on disclosure");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(question1Horse).click();
        Log.info("Client Has clicked on disclosure");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(question2Horse).click();
        Log.info("Client Has clicked on disclosure");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(question3Horse).click();
        Log.info("Client Has clicked on disclosure");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(question4Horse).click();
        Log.info("Client Has clicked on disclosure");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(question5Horse).click();
        Log.info("Client Has clicked on disclosure");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(question6Horse).click();
        Log.info("Client Has clicked on disclosure");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(question7Horse).click();
        Log.info("Client Has clicked on disclosure");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(question8Horse).click();
        Log.info("Client Has clicked on disclosure");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(question9Horse).click();
        Log.info("Client Has clicked on disclosure");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(question10Horse).click();
        Log.info("Client Has clicked on disclosure");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(question11Horse).click();
        Log.info("Client Has clicked on disclosure");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(question12Horse).click();
        Log.info("Client Has clicked on disclosure");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(question13Horse).click();
        Log.info("Client Has clicked on disclosure");
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(question14Horse).click();
        Log.info("Client Has clicked on disclosure");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(question15Horse).click();
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
//        Alert alert = driver.switchTo().alert();
//        // Capturing alert message.
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        // Accepting alert
//        alert.accept();
        driver.findElement(acceptCondition).click();
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    //Generate quote and policy for Introductory Exotic breed

    public void selectExoticForIntroductory() {

        Log.info("**********Generate Quote For Introductory Exotic Product Test Case Starts Here************");

        driver.findElement(petTypeDropDown).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(optionOfIntroductoryExoticOption).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(introductoryRegistrationDropDown).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(optionIntroductoryDD).click();

    }

    public void exoticDetailsIntroductory(String datasetFile) throws Exception {
        exotic = getExoticDetails(datasetFile);
        setExoticNameIntorductory(exotic.getPetName());
        setExoticBirthDateIntorductory(exotic.getBirthDate());
        setExoticPriceIntorductory(exotic.getPrice());
    }

    public void setExoticNameIntorductory(String firstname) {
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(petNameIntroductoryExotic).sendKeys(firstname);
        Log.info("Exotic Species Name is==" + firstname);

    }

    public void setExoticBirthDateIntorductory(String birthDate) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(petDateOfBirthIntroductoryExotic).sendKeys(birthDate);
        Log.info("Exotic date of birth is==" + birthDate);

    }

    public void setExoticPriceIntorductory(String price) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        ((JavascriptExecutor) driver).executeScript("document.getElementById('Question_142').style.display='block';");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.findElement(petPriceIntroductoryExotic).sendKeys(price);
        Log.info("Exotic purchased price is==" + price);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //driver.findElement(By.id("Question_11317")).click();

    }

    public void enterIntroductoryExoticDetails() {

        WebElement DropDown = driver.findElement(By.xpath("//div[@id='Div_138']/div/div/span"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", DropDown);
       // driver.findElement(petBreedDropDownIntroductoryExotic).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(optionOfPetBreedIntroductoryExotic).click();
        Log.info("Pet Breed Selected is== " + driver.findElement(optionOfPetBreedIntroductoryExotic).getText());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        driver.findElement(petGenderDropDownIntroductoryExotic).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(optionPetGenderIntroductoryExotic).click();
        Log.info("Exotic Gender is== " + driver.findElement(optionPetGenderIntroductoryExotic).getText());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        ((JavascriptExecutor) driver).executeScript("document.getElementById('Question_142').style.display='block';");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.findElement(petPriceIntroductoryExotic).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(calculateButtonIntroductoryExotic).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(calculateButtonIntroductoryExotic).click();
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


    public void generatePolicyFoRIntroductoryExotic() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement microchipNumber = driver.findElement(By.id("Question_33000"));
        // Scrolling down the page till the element is found
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", microchipNumber);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(microchipNUmberForIntroductoryExotic).sendKeys("A123");
        Log.info("Microchip Number Is  is==A123");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(radioButtonIntroductoryExotic).click();
        Log.info("Click Radio Button");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.findElement(createPolicyButtonIntroductoryExotic).click();
        Log.info("Client Has clicked on generate Policy button==" + driver.findElement(createPolicyButtonIntroductoryExotic).getText());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }


    //Items on manage quote page displays upon item select from quote status dropdown
    public void SelectItemFromDropDown() {
        driver.findElement(quoteStatusDropDown).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(statusOpen).click();
        driver.findElement(searchButton).click();
    }

    public String fetchAndVerifyDataAgainstDropDown() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        List<WebElement> totalRow = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@id='gridName']/table/tbody/tr")));
        String array = " ";
        for (WebElement rEle : totalRow) {
            array = array + " " + rEle.getText();
        }
        return array;
    }

    //Fetch list of quote based upon product drop down

    public void selectOptionFromProductDropDown() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.findElement(productDropdown).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(optionsFromProductDD).click();
    }

    public void clickOnSearchButton() {
        driver.findElement(searchButton).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public List<WebElement> verifyListOfQuoteBasedOnProductDD() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        List<WebElement> listOfProduct = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@id='gridName']/table/tbody/tr")));
        return listOfProduct;

    }

    //Fetch list of quote based on option from Is referred dropdown on manage quote page

    public void selectOptionFromIsReferredDropDown() {

        driver.findElement(isReferredDropdown).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(optionsFromIsReferredDD).click();

    }


    public String verifyListOfQuoteBasedOnIsReferredDD() {
        return driver.findElement(detailsOfQuotes).getText();

    }


    //Fetch list of quote based on option from division dropdown on manage quote page

    public void selectOptionFromDivisionDropDown() {

        driver.findElement(divisionDropdown).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(optionsFromDivisionDD).click();

    }


    public String verifyListOfQuoteBasedOnDivisionDD() {
        return driver.findElement(detailsOfQuotes).getText();

    }

    //Fetch quote on manage quote page based on quote number for UTS Stage

    public void enterQuoteNumberInsideSearchBox() {
        driver.findElement(quoteSearchBox).sendKeys("Q0001777");
    }

    public String verifyQuoteDetails() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement quoteInfo = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='gridName']/table/tbody/tr[1]")));
        return quoteInfo.getText();
    }

    //Verify include payment feature of quote module for Stage

    public void selectIncludePaymentCheckBox() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(includePaymentCheckBox).click();


    }

    public String verifyIncludePaymentDetailsOfQuote() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement quoteInfoIncludePayment = driver.findElement(By.xpath("//div[@id='gridName']/table/tbody/tr"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", quoteInfoIncludePayment);
        //WebDriverWait wait=new WebDriverWait(driver,10);
        // WebElement quoteInfoIncludePayment=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("")));

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return quoteInfoIncludePayment.getText();
    }

    //Edit quote information and verifies the same

    public void clickOnQuoteNumber() {

        WebDriverWait cWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement quoteNumber = cWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='gridName']/table/tbody/tr[1]/td[2]/a")));
        quoteNumber.click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public void selectEditQuoteOption() {
        WebElement cogIcon = driver.findElement(By.xpath("//div[@id='gridName']/table/tbody/tr[1]/td[18]/ul/li[1]/a"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", cogIcon);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(selectCogIcon)).perform();
        driver.findElement(selectEditQuoteIcon).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void editQuoteDetails() {
        //Scroll up
        //Scroll up
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", "");
        driver.findElement(enterPostCodeInAddressDropDown).clear();
        driver.findElement(enterPostCodeInAddressDropDown).sendKeys("RM8 2TE");
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(selectPostCodeFromDD).click();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.findElement(hearAboutUsDropDown).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(selectOptionFromHearAboutUsDD).click();
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        //Scroll up
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("window.scrollBy(0,-150)", "");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.findElement(petName).clear();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(petName).sendKeys("TestEditQuote");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.findElement(petSpeciesDropDown).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(selectOptionFromPetSpeciesDD).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.findElement(petGenderDropDown).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(selectOptionsFromPetGDD).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.findElement(petBirthDate).clear();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(petBirthDate).sendKeys("02.08.2020");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        ((JavascriptExecutor) driver).executeScript("document.getElementById('Question_11369').style.display='block';");
        driver.findElement(petPurchaseAmount).clear();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        ((JavascriptExecutor) driver).executeScript("document.getElementById('Question_11369').style.display='block';");
        driver.findElement(petPurchaseAmount).sendKeys("500");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        ((JavascriptExecutor) driver).executeScript("document.getElementById('Question_11370').style.display='block';");
        driver.findElement(petAdminFees).clear();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        ((JavascriptExecutor) driver).executeScript("document.getElementById('Question_11370').style.display='block';");
        driver.findElement(petAdminFees).sendKeys("20");
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //driver.findElement(calculateButton).click();
        ((JavascriptExecutor) driver).executeScript("arguments[0].click()", driver.findElement(calculateButton));

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }


}
