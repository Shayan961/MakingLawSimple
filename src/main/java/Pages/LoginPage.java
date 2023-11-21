package Pages;

import DriverFactory.DriverFact;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class LoginPage {
    private WebDriver driver;

    // By locators ids
    private By username = By.name("email");
    private By password = By.name("password");
    private By loginbtn = By.className("btn btn-outline-light btn-lg px-5");

    private By hoverclick = By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div[2]");
    private By forgotPwdLink = By.linkText("Forgot Your Password");
    WebElement ele = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div[2]"));

    // Constructor of the page class
    public LoginPage (WebDriver driver){
        this.driver= driver;
    }
    // Page actions: features(behavior) of the page the form of methods:

    public String getLoginPageTitle(){
        return driver.getTitle();
    }

    public void enterUserName(String name)

    {
        driver.findElement(username).sendKeys(name);
    }

    public void enterPassword(String pass){
        driver.findElement(password).sendKeys(pass);
    }

    public void movetohover()
    {
        Actions action = new Actions(DriverFact.getDriver());
        action.moveToElement(ele).perform();
    }

    public void clickLoginbtn(){
        driver.findElement(loginbtn).click();
    }

    public boolean isForgotPwd(){
        return driver.findElement(forgotPwdLink).isDisplayed();
    }

}
