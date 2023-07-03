package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class SettingPage {
    private WebDriver driver;

    //1.Create a class constructor
    public SettingPage(WebDriver driver) {
        this.driver = driver;
    }

    private By lookUpIcon = By.cssSelector("ul[id='side-menu']>li:nth-child(11)");

    //Manage Policy Type Page

    private By policyTypeIcon = By.xpath("//div[@class='ibox-content']/div/div[1]/a/i");

    private By editIconOnManageTypePage = By.xpath("//div[@id='gridName']/table/tbody/tr[1]/td[6]/div/a[1]");

    private By displayedMessageOnEditPolicyTypePage = By.xpath("//div[@class='row wrapper border-bottom white-bg page-heading']/div/h2");

    private By inputTypePolicyType = By.cssSelector("input[id='PolicyTypeName']");

    private By inputTypePeriod = By.cssSelector("input[id='Period']");

    private By inputTypeDescriptionOfPolicyType = By.cssSelector("textarea[id='Description']");

    private By addPolicyTypeIcon = By.xpath("//div[@class='form-group pull-right']/div/a[2]");

    private By displayedMessageOnAddPolicyTypePage = By.xpath("//div[@class='row wrapper border-bottom white-bg page-heading']/div/h2");

    //Manage client class Page

    private By clientClassIcon = By.xpath("//div[@class='ibox-content']/div/div[2]/a/i");

    private By editIconOnClientClassPage = By.xpath("//div[@id='gridName']/table/tbody/tr[1]/td[6]/div/a[1]");

    private By displayedMessageOnEditClientClassPage = By.xpath("//div[@class='row wrapper border-bottom white-bg page-heading']/div/h2");

    private By inputTypeClientClassName = By.cssSelector("input[id='ClientClassName']");

    private By inputTypeClientCode = By.cssSelector("input[id='Code']");

    private By inputTypeDescriptionOfClientClass = By.cssSelector("textarea[id='Description']");

    private By addClientClassIcon = By.xpath("//div[@class='form-group pull-right']/div/a[2]");

    private By displayedMessageOnAddClientClassPage = By.xpath("//div[@class='row wrapper border-bottom white-bg page-heading']/div/h2");

    //Manage Insurer class Page

    private By insurerClassIcon = By.xpath("//div[@class='ibox-content']/div/div[3]/a/i");

    private By editIconOnManageInsurerClass = By.xpath("//div[@id='gridName']/table/tbody/tr[1]/td[5]/div/a[1]");

    private By displayedMessageOnEditInsurerClassPage = By.xpath("//div[@class='row wrapper border-bottom white-bg page-heading']/div/h2");

    private By inputTypeInsurerCode = By.cssSelector("input[id='Code']");

    private By inputTypeInsurerClassName = By.cssSelector("input[id='InsurerClassName']");

    private By inputTypeDescriptionOfEditInsurerPage = By.cssSelector("textarea[id='Description']");

    private By addInsurerClassIcon = By.xpath("//div[@class='form-group pull-right']/div/a[2]");

    private By displayedMessageOnAddInsurerClassPage = By.xpath("//div[@class='row wrapper border-bottom white-bg page-heading']/div/h2");

    //Division Page

    private By divisionIcon = By.xpath("//div[@class='ibox-content']/div/div[4]/a/i");

    private By editIconOnManageDivisionPage = By.xpath("//div[@id='gridName']/table/tbody/tr[1]/td[5]/div/a[1]");

    private By displayedMessageOnEditDivisionPage = By.xpath("//div[@class='row wrapper border-bottom white-bg page-heading']/div/h2");

    private By inputTypeDivisionName = By.cssSelector("input[id='DivisionName']");

    private By inputTypeDescriptionOfEditDivisionPage = By.cssSelector("textarea[id='Description']");

    private By addDivisionIcon = By.xpath("//div[@class='form-group pull-right']/div/a[2]");

    private By displayedMessageOnAddDivisionPage = By.xpath("//div[@class='row wrapper border-bottom white-bg page-heading']/div/h2");

    //Branch Page

    private By branchIcon = By.xpath("//div[@class='ibox-content']/div/div[5]/a/i");

    private By editIconOnManageBranchPage = By.xpath("//div[@id='gridName']/table/tbody/tr[1]/td[6]/div/a[1]");

    private By displayedMessageOnEditBranchPage = By.xpath("//div[@class='row wrapper border-bottom white-bg page-heading']/div/h2");

    private By inputTypeBranchCode = By.cssSelector("input[id='Code']");

    private By inputTypeBranchName = By.cssSelector("input[id='BranchName']");

    private By inputTypeDescriptionOfEditBranchPage = By.cssSelector("textarea[id='Description']");

    private By addBranchIcon = By.xpath("//div[@class='form-group pull-right']/div/a[2]");

    private By displayedMessageOnAddBranchPage = By.xpath("//div[@class='row wrapper border-bottom white-bg page-heading']/div/h2");

    //Change Area Page

    private By changeAreaIcon = By.xpath("//div[@class='ibox-content']/div/div[6]/a/i");

    private By editIconOnManageChangeAreaPage = By.xpath("//div[@id='gridName']/table/tbody/tr[1]/td[5]/div/a[1]");

    private By displayedMessageOneEditChangeAreaPage = By.xpath("//div[@class='row wrapper border-bottom white-bg page-heading']/div/h2");

    private By inputTypeChangeAreaName = By.cssSelector("input[id='ChangeAreaName']");

    private By inputTypeDescriptionOfEditChangeAreaNamePage = By.cssSelector("textarea[id='Description']");

    private By addChangeAreaIcon = By.xpath("//div[@class='form-group pull-right']/div/a[2]");

    private By displayedMessageOnAddChangeAreaPage = By.xpath("//div[@class='row wrapper border-bottom white-bg page-heading']/div/h2");

    //Pet Sex Page

    private By sexIcon = By.xpath("//div[@class='ibox-content']/div/div[7]/a/i");

    private By editIconOnManageSexPage = By.xpath("//div[@id='gridName']/table/tbody/tr[1]/td[6]/div/a[1]");

    private By displayedMessageOneEditSexPage = By.xpath("//div[@class='row wrapper border-bottom white-bg page-heading']/div/h2");

    private By inputTypeSexName = By.cssSelector("input[id='SexName']");

    private By inputTypeDescriptionOfEditSexPage = By.cssSelector("textarea[id='Description']");

    private By addSexIcon = By.xpath("//div[@class='form-group pull-right']/div/a[2]");

    private By displayedMessageOnAddSexPage = By.xpath("//div[@class='row wrapper border-bottom white-bg page-heading']/div/h2");

    //Debtor code Page

    private By debtorCodeIcon = By.xpath("//div[@class='ibox-content']/div/div[8]/a/i");

    private By editIconOnManageDebtorCodePage = By.xpath("//div[@id='gridName']/table/tbody/tr[1]/td[5]/div/a[1]");

    private By displayedMessageOneEditDebtorCodePage = By.xpath("//div[@class='row wrapper border-bottom white-bg page-heading']/div/h2");

    private By inputTypeDebtorCodeName = By.cssSelector("input[id='DebtorCodeName']");

    private By inputTypeDescriptionOfEditDebtorCodePage = By.cssSelector("textarea[id='Description']");

    private By addDebtorCodeIcon = By.xpath("//div[@class='form-group pull-right']/div/a[2]");

    private By displayedMessageOnAddDebtorCodePage = By.xpath("//div[@class='row wrapper border-bottom white-bg page-heading']/div/h2");

    //Renewal type Page

    private By renewalTypeIcon = By.xpath("//div[@class='ibox-content']/div/div[9]/a/i");

    private By editIconOnManageRenewalTypePage = By.xpath("//div[@id='gridName']/table/tbody/tr[1]/td[5]/div/a[1]");

    private By displayedMessageOneAddRenewalTypePage = By.xpath("//div[@class='row wrapper border-bottom white-bg page-heading']/div/h2");

    private By inputTypeRenewTypeName = By.cssSelector("input[id='RenewalTypeName']");

    private By inputTypeDescriptionOfEditRenewTypePage = By.cssSelector("textarea[id='Description']");

    private By addRenewalTypeIcon = By.xpath("//div[@class='form-group pull-right']/div/a[2]");

    private By displayedMessageOnEditRenewalTypePage = By.xpath("//div[@class='row wrapper border-bottom white-bg page-heading']/div/h2");

    public void clickIcon() {
        driver.findElement(lookUpIcon).click();
    }


    public void traversingThroughPages() {
        if (driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[1]/a")).isEnabled()) {
            driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[1]/a")).click();
        } else {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[1]/a")).click();
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(driver.getCurrentUrl());
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(lookUpIcon).click();


        if (driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[2]/a")).isEnabled()) {
            driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[2]/a")).click();
        } else {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[2]/a")).click();
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(driver.getCurrentUrl());
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(lookUpIcon).click();


        if (driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[3]/a")).isEnabled()) {
            driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[3]/a")).click();
        } else {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[3]/a")).click();
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(driver.getCurrentUrl());
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(lookUpIcon).click();


        if (driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[4]/a")).isEnabled()) {
            driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[4]/a")).click();
        } else {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[4]/a")).click();
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(driver.getCurrentUrl());
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(lookUpIcon).click();


        if (driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[5]/a")).isEnabled()) {
            driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[5]/a")).click();
        } else {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[5]/a")).click();
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(driver.getCurrentUrl());
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(lookUpIcon).click();


        if (driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[6]/a")).isEnabled()) {
            driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[6]/a")).click();
        } else {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[6]/a")).click();
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(driver.getCurrentUrl());
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(lookUpIcon).click();


        if (driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[7]/a")).isEnabled()) {
            driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[7]/a")).click();
        } else {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[7]/a")).click();
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(driver.getCurrentUrl());
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(lookUpIcon).click();


        if (driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[8]/a")).isEnabled()) {
            driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[8]/a")).click();
        } else {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[8]/a")).click();
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(driver.getCurrentUrl());
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(lookUpIcon).click();


        if (driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[9]/a")).isEnabled()) {
            driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[9]/a")).click();
        } else {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[9]/a")).click();
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(driver.getCurrentUrl());
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(lookUpIcon).click();


        if (driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[10]/a")).isEnabled()) {
            driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[10]/a")).click();
        } else {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[10]/a")).click();
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(driver.getCurrentUrl());
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(lookUpIcon).click();


        if (driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[11]/a")).isEnabled()) {
            driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[11]/a")).click();
        } else {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[11]/a")).click();
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(driver.getCurrentUrl());
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(lookUpIcon).click();


        if (driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[12]/a")).isEnabled()) {
            driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[12]/a")).click();
        } else {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[12]/a")).click();
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(driver.getCurrentUrl());
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(lookUpIcon).click();


        if (driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[13]/a")).isEnabled()) {
            driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[13]/a")).click();
        } else {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[13]/a")).click();
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(driver.getCurrentUrl());
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(lookUpIcon).click();


        if (driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[14]/a")).isEnabled()) {
            driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[14]/a")).click();
        } else {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[14]/a")).click();
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(driver.getCurrentUrl());
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(lookUpIcon).click();


        if (driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[15]/a")).isEnabled()) {
            driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[15]/a")).click();
        } else {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[15]/a")).click();
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(driver.getCurrentUrl());
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

           /* driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[16]/a")).click();
            System.out.println(driver.getCurrentUrl());
            driver.findElement(lookUpIcon).click();
            driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[17]/a")).click();
            System.out.println(driver.getCurrentUrl());
            driver.findElement(lookUpIcon).click();
            driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[18]/a")).click();
            System.out.println(driver.getCurrentUrl());
            driver.findElement(lookUpIcon).click();
            driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[19]/a")).click();
            System.out.println(driver.getCurrentUrl());
            driver.findElement(lookUpIcon).click();
            driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[20]/a")).click();
            System.out.println(driver.getCurrentUrl());
            driver.findElement(lookUpIcon).click();
            driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[21]/a")).click();
            System.out.println(driver.getCurrentUrl());
            driver.findElement(lookUpIcon).click();
            driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[22]/a")).click();
            System.out.println(driver.getCurrentUrl());
            driver.findElement(lookUpIcon).click();*/
    }
    //To verify whether Manage Policy Type page displays with policy type details by clicking on policy type icon on setting page

    public void clickOnPolicyTypeIcon() {
        driver.findElement(policyTypeIcon).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public String verifyManagePolicyTypeIcon() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        List<WebElement> policyTypeList = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@id='gridName']/table/tbody/tr")));
        String details = " ";
        for (WebElement data : policyTypeList) {
            details = details + data.getText();
        }
        return details;

    }

    //Add policy type page  displays will all details when user clicks on add policy type icon on manage policy type page

    public void clickOnAddPolicyTypeIcon() {
        driver.findElement(addPolicyTypeIcon).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public String verifyAddPolicyTypeIconPage() {
        return driver.findElement(displayedMessageOnAddPolicyTypePage).getText();

    }

    // Edit policy type page displays upon clicking on edit icon against policy type on manage policy type page

    public void clickOnEditIconOnManagePolicyPage() {
        driver.findElement(editIconOnManageTypePage).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public String verifyEditPolicyTypePage() {
        driver.findElement(inputTypePolicyType).clear();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(inputTypePolicyType).sendKeys("Test");
        //Use of JavaScript
        ((JavascriptExecutor) driver).executeScript("document.getElementById('Period').style.display='block';");
        WebElement inputTypePeriod1 = driver.findElement(By.id("Period"));
        WebDriverWait wait1 = new WebDriverWait(driver, 10);
        String order = "23";
        wait1.until(ExpectedConditions.visibilityOf(inputTypePeriod1)).sendKeys(order);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.findElement(inputTypeDescriptionOfPolicyType).clear();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(inputTypeDescriptionOfPolicyType).sendKeys("Test");

        return driver.findElement(displayedMessageOnEditPolicyTypePage).getText();

    }

    // To verify whether Manage client class page displays with client class details by clicking on client lass icon on setting page

    public void clickOnClientClassIcon() {
        driver.findElement(clientClassIcon).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public String verifyManageClientClassPage() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        List<WebElement> ClientClass = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@id='gridName']/table/tbody/tr")));
        String details = " ";
        for (WebElement data : ClientClass) {
            details = details + data.getText();
        }
        return details;

    }

    //Add client class page  displays will all details when user clicks on add client class icon on manage class client page

    public void clickOnAddClientClassIcon() {
        driver.findElement(addClientClassIcon).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public String verifyAddClientClassIPage() {
        return driver.findElement(displayedMessageOnAddClientClassPage).getText();

    }

    //Edit client class page displays upon clicking on edit icon against client class icon on manage client class page
    public void clickOnEditIconOnManageClientClassPage() {
        driver.findElement(editIconOnManageTypePage).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public String verifyEditClientClassPage() {
        driver.findElement(inputTypeClientClassName).clear();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(inputTypeClientClassName).sendKeys("Test");
        //Use of JavaScript
        driver.findElement(inputTypeClientCode).clear();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(inputTypeClientCode).sendKeys("Test");

        driver.findElement(inputTypeDescriptionOfClientClass).clear();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(inputTypeDescriptionOfClientClass).sendKeys("Test");

        return driver.findElement(displayedMessageOnEditClientClassPage).getText();

    }

    //To verify whether Manage insurer class page displays with insurer class details by clicking on insurer lass icon on setting page

    public void clickOnInsurerClassIcon() {
        driver.findElement(insurerClassIcon).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public String verifyManageInsurerClassPage() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        List<WebElement> InsurerClass = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@id='gridName']/table/tbody/tr")));
        String details = " ";
        for (WebElement data : InsurerClass) {
            details = details + data.getText();
        }
        return details;

    }

    //Add Insurer class page displays will all details when user clicks on add insurer class icon on manage insurer class page

    public void clickOnAddInsurerClassIcon() {
        driver.findElement(addInsurerClassIcon).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public String verifyAddInsurerClassPage() {
        return driver.findElement(displayedMessageOnAddInsurerClassPage).getText();

    }

    //Edit Insurer class page displays upon clicking on edit icon against insurer icon on manage insurer class page

    public void clickOnEditIconOnManageInsurerClassPage() {
        driver.findElement(editIconOnManageInsurerClass).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public String verifyEditInsurerClassPage() {
        driver.findElement(inputTypeInsurerCode).clear();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(inputTypeInsurerCode).sendKeys("Test");
        //Use of JavaScript
        driver.findElement(inputTypeInsurerClassName).clear();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(inputTypeInsurerClassName).sendKeys("Test");

        driver.findElement(inputTypeDescriptionOfEditInsurerPage).clear();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(inputTypeDescriptionOfEditInsurerPage).sendKeys("Test");

        return driver.findElement(displayedMessageOnEditInsurerClassPage).getText();

    }
    //To verify whether Manage division page displays with division details by clicking on division icon on setting page

    public void clickOnDivisionIcon() {
        driver.findElement(divisionIcon).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public String verifyManageDivisionPage() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        List<WebElement> InsurerClass = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@id='gridName']/table/tbody/tr")));
        String details = " ";
        for (WebElement data : InsurerClass) {
            details = details + data.getText();
        }
        return details;

    }

    //Add division page displays will all details when user clicks on add division icon on manage division page

    public void clickOnAddDivisionIcon() {
        driver.findElement(addDivisionIcon).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public String verifyAddDivisionPage() {
        return driver.findElement(displayedMessageOnAddDivisionPage).getText();

    }

    //Edit division page displays upon clicking on edit icon against division name on manage division page

    public void clickOnEditIconOnManageDivisionPage() {
        driver.findElement(editIconOnManageDivisionPage).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public String verifyEditDivisionPage() {
        driver.findElement(inputTypeDivisionName).clear();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(inputTypeDivisionName).sendKeys("Test");
        //Use of JavaScript
        driver.findElement(inputTypeDescriptionOfEditDivisionPage).clear();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(inputTypeDescriptionOfEditDivisionPage).sendKeys("Test");


        return driver.findElement(displayedMessageOnEditDivisionPage).getText();

    }

    //To verify whether Manage branch page displays with branch details by clicking on branch icon on setting page

    public void clickOnBranchIcon() {
        driver.findElement(branchIcon).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public String verifyManageBranchPage() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        List<WebElement> InsurerClass = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@id='gridName']/table/tbody/tr")));
        String details = " ";
        for (WebElement data : InsurerClass) {
            details = details + data.getText();
        }
        return details;

    }

    //Add branch page displays will all details when user clicks on add branch icon on manage branch page

    public void clickOnAddBranchIcon() {
        driver.findElement(addBranchIcon).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public String verifyAddBranchPage() {
        return driver.findElement(displayedMessageOnAddBranchPage).getText();

    }

    //Edit branch page displays upon clicking on edit icon against branch code on manage branch page

    public void clickOnEditIconOnManageBranchPage() {
        driver.findElement(editIconOnManageBranchPage).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public String verifyEditBranchPage() {
        driver.findElement(inputTypeBranchCode).clear();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(inputTypeBranchCode).sendKeys("Test");

        driver.findElement(inputTypeBranchName).clear();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(inputTypeBranchName).sendKeys("Test");

        driver.findElement(inputTypeDescriptionOfEditBranchPage).clear();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(inputTypeDescriptionOfEditBranchPage).sendKeys("Test");


        return driver.findElement(displayedMessageOnEditBranchPage).getText();

    }

    //To verify whether Manage change area page displays with area details by clicking on change area icon on setting page

    public void clickOnChangeAreaIcon() {
        driver.findElement(changeAreaIcon).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public String verifyManageChangeAreaPage() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        List<WebElement> InsurerClass = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@id='gridName']/table/tbody/tr")));
        String details = " ";
        for (WebElement data : InsurerClass) {
            details = details + data.getText();
        }
        return details;

    }

    //Add change area page displays will all details when user clicks on add change area icon on manage change area  page

    public void clickOnAddChangeAreaIcon() {
        driver.findElement(addChangeAreaIcon).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public String verifyAddChangeAreaPage() {
        return driver.findElement(displayedMessageOnAddChangeAreaPage).getText();

    }

    //Edit change area page displays upon clicking on edit icon against change area name on manage change area page

    public void clickOnEditIconOnManageChangeAreaPage() {
        driver.findElement(editIconOnManageChangeAreaPage).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public String verifyEditChangeAreaPage() {
        driver.findElement(inputTypeChangeAreaName).clear();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(inputTypeChangeAreaName).sendKeys("Test");



        driver.findElement(inputTypeDescriptionOfEditChangeAreaNamePage).clear();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(inputTypeDescriptionOfEditChangeAreaNamePage).sendKeys("Test");


        return driver.findElement(displayedMessageOneEditChangeAreaPage).getText();

    }

    //To verify whether Manage sex page of pet displays with pet sex details by clicking on change sex icon on setting page

    public void clickOnSexIcon() {
        driver.findElement(sexIcon).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public String verifyManageSexPage() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        List<WebElement> sexClass = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@id='gridName']/table/tbody/tr")));
        String details = " ";
        for (WebElement data : sexClass) {
            details = details + data.getText();
        }
        return details;

    }

    //Add sex page of pet displays will all details when user clicks on add sex icon on manage sex page

    public void clickOnAddSexIcon() {
        driver.findElement(addSexIcon).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public String verifyAddSexPage() {
        return driver.findElement(displayedMessageOnAddSexPage).getText();

    }

    //Edit sex page of pet displays upon clicking on edit icon against sex class on manage sex page of pet

    public void clickOnEditIconOnManageSexPage() {
        driver.findElement(editIconOnManageSexPage).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public String verifyEditSexPage() {
        driver.findElement(inputTypeSexName).clear();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(inputTypeSexName).sendKeys("Test");



        driver.findElement(inputTypeDescriptionOfEditSexPage).clear();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(inputTypeDescriptionOfEditSexPage).sendKeys("Test");


        return driver.findElement(displayedMessageOneEditSexPage).getText();

    }

    //To verify whether Manage sex page of pet displays with pet sex details by clicking on change sex icon on setting page

    public void clickOnDebtorCodeIcon() {
        driver.findElement(debtorCodeIcon).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public String verifyManageebtorCodePage() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        List<WebElement> debtorCodeClass = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@id='gridName']/table/tbody/tr")));
        String details = " ";
        for (WebElement data : debtorCodeClass) {
            details = details + data.getText();
        }
        return details;

    }

    //Add sex page of pet displays will all details when user clicks on add sex icon on manage sex page

    public void clickOnAddDebtorCodeIcon() {
        driver.findElement(addDebtorCodeIcon).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public String verifyAddDebtorCodePage() {
        return driver.findElement(displayedMessageOnAddDebtorCodePage).getText();

    }

    //Edit sex page of pet displays upon clicking on edit icon against sex class on manage sex page of pet

    public void clickOnEditIconOnManageDebtorCodePage() {
        driver.findElement(editIconOnManageDebtorCodePage).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public String verifyEditDebtorCodePage() {
        driver.findElement(inputTypeDebtorCodeName).clear();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(inputTypeDebtorCodeName).sendKeys("Test");



        driver.findElement(inputTypeDescriptionOfEditDebtorCodePage).clear();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(inputTypeDescriptionOfEditDebtorCodePage).sendKeys("Test");


        return driver.findElement(displayedMessageOneEditDebtorCodePage).getText();

    }

    //To verify whether Manage renewal type page displays with renewal type details by clicking on renewal type icon on setting page

    public void clickOnRenewalTypeIcon() {
        driver.findElement(renewalTypeIcon).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public String verifyManageRenewalTypePage() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        List<WebElement> renewalTypeClass = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@id='gridName']/table/tbody/tr")));
        String details = " ";
        for (WebElement data : renewalTypeClass) {
            details = details + data.getText();
        }
        return details;

    }

    //Add renewal type page displays will all details when user clicks on add renewal type icon on manage renewal type  page

    public void clickOnAddRenewalTypeIcon() {
        driver.findElement(addRenewalTypeIcon).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public String verifyAddRenewalTypePage() {
        return driver.findElement(displayedMessageOneAddRenewalTypePage).getText();

    }

    //Edit renewal type  page displays upon clicking on edit icon against renewal type  name on manage renewal type  page

    public void clickOnEditIconOnManageRenewalTypePage() {
        driver.findElement(editIconOnManageRenewalTypePage).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public String verifyEditRenewalTypePage() {
        driver.findElement(inputTypeRenewTypeName).clear();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(inputTypeRenewTypeName).sendKeys("Test");



        driver.findElement(inputTypeDescriptionOfEditRenewTypePage).clear();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(inputTypeDescriptionOfEditRenewTypePage).sendKeys("Test");


        return driver.findElement(displayedMessageOnEditRenewalTypePage).getText();

    }


}
