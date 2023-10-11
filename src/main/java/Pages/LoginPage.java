package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;

    // By locators
    private By username = By.id("ctl00_cphBody_Login1_UserName");
    private By password = By.id("ctl00_cphBody_Login1_Password");
    private By loginbtn = By.id("ctl00_cphBody_Login1_LoginButton");
    private By forgotPwdLink = By.linkText("Forgot Your Password");

    // Constructor of the page class
    public LoginPage (WebDriver driver){
        this.driver= driver;
    }
    // Page actions: features(behavior) of the page the form of methods:

    public String getLoginPageTitle(){
        return driver.getTitle();
    }

    public void enterUserName(String name){
        driver.findElement(username).sendKeys(name);
    }

    public void enterPassword(String pass){
        driver.findElement(password).sendKeys(pass);
    }

    public void clickLoginbtn(){
        driver.findElement(loginbtn).click();
    }

    public boolean isForgotPwd(){
        return driver.findElement(forgotPwdLink).isDisplayed();
    }

}
