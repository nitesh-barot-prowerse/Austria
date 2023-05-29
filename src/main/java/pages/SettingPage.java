package pages;

import org.openqa.selenium.By;
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

    private By lookUpIcon= By.cssSelector("ul[id='side-menu']>li:nth-child(11)");

    public void clickIcon(){
        driver.findElement(lookUpIcon).click();
    }


    public void traversingThroughPages() {
        WebDriverWait cWait = new WebDriverWait(driver, 10);
        List<WebElement> totalColumn = cWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@class='ibox-content']/div/div/a")));
        /*for (WebElement cLE : totalColumn) {
            System.out.println(cLE.getText());
            if (cLE.getText().equals("Debtor Code")) {
                cLE.click();
                System.out.println(driver.getCurrentUrl());
                break;
            }
        }*/
        driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[1]/a")).click();
        System.out.println(driver.getCurrentUrl());
        driver.findElement(lookUpIcon).click();
        driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[2]/a")).click();
        System.out.println(driver.getCurrentUrl());
        driver.findElement(lookUpIcon).click();
        driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[3]/a")).click();
        System.out.println(driver.getCurrentUrl());
        driver.findElement(lookUpIcon).click();
        driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[4]/a")).click();
        System.out.println(driver.getCurrentUrl());
        driver.findElement(lookUpIcon).click();
        driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[5]/a")).click();
        System.out.println(driver.getCurrentUrl());
        driver.findElement(lookUpIcon).click();
        driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[6]/a")).click();
        System.out.println(driver.getCurrentUrl());
        driver.findElement(lookUpIcon).click();
        driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[7]/a")).click();
        System.out.println(driver.getCurrentUrl());
        driver.findElement(lookUpIcon).click();
        driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[8]/a")).click();
        System.out.println(driver.getCurrentUrl());
        driver.findElement(lookUpIcon).click();
        driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[9]/a")).click();
        System.out.println(driver.getCurrentUrl());
        driver.findElement(lookUpIcon).click();
        driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[10]/a")).click();
        System.out.println(driver.getCurrentUrl());
        /*driver.findElement(lookUpIcon).click();
        driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[11]/a")).click();
        System.out.println(driver.getCurrentUrl());
        driver.findElement(lookUpIcon).click();
        /*driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[12]/a")).click();
        System.out.println(driver.getCurrentUrl());
        driver.findElement(lookUpIcon).click();
        driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[13]/a")).click();
        System.out.println(driver.getCurrentUrl());
        driver.findElement(lookUpIcon).click();
        driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[14]/a")).click();
        System.out.println(driver.getCurrentUrl());
        driver.findElement(lookUpIcon).click();

        driver.findElement(By.xpath("//div[@class='ibox-content']/div/div[15]/a")).click();
        System.out.println(driver.getCurrentUrl());
        driver.findElement(lookUpIcon).click();
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
}
