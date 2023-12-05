package Pages;

import DriverFactory.DriverFact;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LawyerProfilePage {
    private WebDriver driver;

    private By edit_job_title_btn = By.xpath("/html/body/div/div/div[2]/table/tbody/tr[4]/td[1]/button");
    public LawyerProfilePage(WebDriver driver) {
        this.driver= driver;
    }
    public void clickeditjobtitlebtn(){

        driver.findElement(edit_job_title_btn).click();
    }

}
