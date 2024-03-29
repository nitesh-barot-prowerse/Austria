package pages;

import actions.LoginActions;
import dataModels.LogIn;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class LogInPage extends LoginActions {
    private WebDriver driver;

    //1.Create a class constructor
    public LogInPage(WebDriver driver) {
        this.driver = driver;
    }

    LogIn login;

    //Login Form Elements
    private By emailField = By.xpath("//input[@id='UserName']");
    private By passwordField = By.xpath("//input[@id='Password']");
    private By accountLoginButton = By.xpath("//button[@id='login']");
    private By dashBoardTitle = By.cssSelector("h2[class='main-title']");
    private By roleText = By.xpath("//span[@class='welcome-message']/label/small");




    //Action Methods

    public String verifyUrl() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        return driver.getCurrentUrl();

    }

    public void enterUserName(String userN) {
        driver.findElement(emailField).sendKeys(userN);

    }

    public void enterPassword(String Password) {
        driver.findElement(passwordField).sendKeys(Password);

    }

    public void clickSubmit() {
        driver.findElement(accountLoginButton).click();
    }

    public String verifyDashBoardTitle() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return driver.findElement(dashBoardTitle).getText();
    }

    public String verifyRoleText() {
        return driver.findElement(roleText).getText();
    }

    public void selectLanguage(){
        driver.findElement(By.xpath("//ul[@class='nav navbar-top-links l-btn navbar-right']/form/select")).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(By.xpath("//ul[@class='nav navbar-top-links l-btn navbar-right']/form/select/option[1]")).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }


}
