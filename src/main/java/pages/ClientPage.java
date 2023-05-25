package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class ClientPage {
    private WebDriver driver;

    public ClientPage(WebDriver driver) {
        this.driver = driver;
    }

    //Elements
    private By clientIcon = By.cssSelector("ul[id='side-menu']>li:nth-child(3)");
    private By displayedMessage = By.xpath("//div[@id='page-wrapper']/div[3]/div/h2");

    private By searchBox=By.cssSelector("input[id='SearchText']");

    private By searchButton= By.cssSelector("button[id='SearchGrid']");

    private By statusDropDown= By.xpath("//div[@class='ibox-content-search m-b-sm']/div/div[2]/div/span/span");

    private By clientStatus=By.xpath("//ul[@id='IsActive_listbox']/li[2]");

    private By displayedStatus=By.xpath("//div[@class='tooltip-demo pull-right']/div/button");

    private By addQuoteForClient= By.cssSelector("a[id='btnAddClientView']");

    private By existingClientId= By.xpath("//div[@id='loadpartialview']/div/div/div[2]/div/div");

    //Add client scenario
    private By addClientButton=By.xpath("//div[@class=' tooltip-demo pull-right']/a[2]");

    private By clientTypeRadioButton=By.cssSelector("input[id='ClientTypeId_1']");

    private By genderDropDown=By.xpath("//div[@id='dvClientName']/div/div/div/div/span/span");

    private By genderValue=By.xpath("//ul[@id='Title_listbox']/li[2]");

    private By firstName=By.cssSelector("input[id='FirstName']");

    private By lastName= By.cssSelector("input[id='LastName']");

    private By birthDate= By.cssSelector("input[id='BirthDate']");

    private By Address=By.cssSelector("input[id='Address1']");

    private By postCodeOfAddress=By.xpath("//ul[@class='c2a_results']/li[1]");

    private By streetAddress=By.cssSelector("input[id='StreetNo']");

    private By okButtonPopUp=By.cssSelector("button[class='dismissButton']");

    private By emailId=By.cssSelector("input[id='Email']");

    private By primaryContact=By.cssSelector("input[id='PrimaryContactNumber']");

    private By createButton=By.cssSelector("button[value='Create']");

    private By displayMessageOfViewClientPage=By.xpath("//div[@class='row wrapper border-bottom white-bg page-heading']/div/h2");

    //Add contact details of client

    private By settingDropDown = By.cssSelector("a[id='dropdownMenu1']");

    private By addContactOptionOfDD = By.xpath("//ul[@class='dropdown-menu']/li[5]");

    private By userName = By.cssSelector("input[id='Name']");

    private By userEmail = By.cssSelector("input[id='Email']");

    private By userRelation = By.cssSelector("input[id='JobTitle']");

    private By userMobile = By.cssSelector("input[id='Mobile']");

    private By Button = By.xpath("//button[@value='Create']");

    private By contactMenu = By.xpath("//div[@class='project-tabs user-profile dsh-tab']/ul/li[3]");

    private By contactData = By.xpath("//div[@id='gridName']/table/tbody/tr");





    public String verifyClientManage() {
        driver.findElement(clientIcon).click();
        return driver.findElement(displayedMessage).getText();
    }

    public String fetchAndDisplayData() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        List<WebElement> totalRow = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@id='gridName']/table/tbody/tr")));
        String array = " ";
        for (WebElement rEle : totalRow) {
            array = array +" " +rEle.getText();
        }
        return array;

    }

    public void enterCodeDetails(){
        driver.findElement(searchBox).sendKeys("RAOA-0001");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void clickOnButton(){
        driver.findElement(searchButton).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public String verifyClient(){
        WebDriverWait wait=new WebDriverWait(driver,10);
        List<WebElement> clientInfo=wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@id='gridName']/table/tbody/tr/td[2]")));
        String clientCode=" ";
        for(WebElement client:clientInfo){
            clientCode=client.getText();
            break;
        }
        return clientCode;
    }

    public void selectClientStatus(){
        driver.findElement(statusDropDown).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(clientStatus).click();
    }

    public void clickClientCode(){
        WebDriverWait wait=new WebDriverWait(driver,10);
        List<WebElement> clientInfo=wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@id='gridName']/table/tbody/tr/td[2]")));
        for(WebElement client:clientInfo){
            client.click();
            break;
        }
    }

    public String verifyClientStatus(){
        String Status=driver.findElement(displayedStatus).getText();
        return Status;
    }

    public void clickOnAddQuoteButton(){
        driver.findElement(addQuoteForClient).click();
    }

    public String verifyExistingClientOnAddQuote(){
        return driver.findElement(existingClientId).getText();
    }

    //Add client scenario

    public void clickOnAddClientButton(){
        driver.findElement(addClientButton).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void enterUserDetails() {
        String clientType = driver.findElement(By.xpath("//div[@class='ibox-content']/div[2]/div/div/div")).getText();
        String clientRadio[]=clientType.split(" ");
        if(clientRadio[0].equals("Individual"))
        {
            driver.findElement(genderDropDown).click();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            driver.findElement(genderValue).click();
            driver.findElement(firstName).sendKeys("Deep");
            driver.findElement(lastName).sendKeys("Rao");
            driver.findElement(birthDate).sendKeys("19.06.1987");
            driver.findElement(Address).sendKeys("2126");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            driver.findElement(postCodeOfAddress).click();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            //driver.findElement(streetAddress).sendKeys(Constant.getSaltString());
            //Alert simpleAlert = driver.switchTo().alert();
            //simpleAlert.accept();
            driver.findElement(emailId).sendKeys(Constant.getSaltString() +"@gmail.com");
            driver.findElement(primaryContact).sendKeys(Constant.getAlphaNumericString());

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void clickOnCreateClientButton(){
        driver.findElement(createButton).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public String verifyCreatedClient(){
        return driver.findElement(displayMessageOfViewClientPage).getText();
    }

    //Add contact details of client

    public void selectAddContactOfClient() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(settingDropDown)).perform();
        driver.findElement(addContactOptionOfDD).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public void enterContactDetails() {

        driver.findElement(userName).sendKeys("Maitry");
        driver.findElement(userEmail).sendKeys("maitry@gmail.com");
        driver.findElement(userRelation).sendKeys("Wife");
        driver.findElement(userMobile).sendKeys("9898989898");
        driver.findElement(Button).click();

    }


    public void clickOnCreateButton() {

    }

    public String verifyGeneratedContactDetails() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(contactMenu).click();
        return driver.findElement(contactData).getText();
    }


}
