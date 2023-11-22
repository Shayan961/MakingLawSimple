package Pages;

import DriverFactory.DriverFact;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class LoginPage {
    private WebDriver driver;

    // By locators ids
    private By hover =By.cssSelector(".homepage-circles.d-flex.flex-column.align-items-center.justify-content-center.bg-black.text-white");

    private By signinbtn = By.linkText("Sign in");
    private By username = By.xpath("/html/body/div/div/div[2]/div/div/div/form/div[1]/div/input");
    private By password = By.name("password");
    private By loginbtn = By.cssSelector(".btn.btn-outline-light.btn-lg.px-5");
    private By forgotPwdLink = By.linkText("Forgot Your Password");


    // Constructor of the page class
    public LoginPage (WebDriver driver)
    {
        this.driver= driver;

    }
    // Page actions: features(behavior) of the page the form of methods:

    public String getLoginPageTitle(){
        return driver.getTitle();
    }

    public void enterUserName(String name)

    {
        WebElement usernameElement = new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(username));
        driver.findElement(username).sendKeys(name);
    }

    public void enterPassword(String pass)
    {
        driver.findElement(password).sendKeys(pass);

    }

    public void movetohover()
    {

        Actions action = new Actions(DriverFact.getDriver());

        // Wait for the element to be visible
        WebElement ele = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(hover));

        action.moveToElement(ele).perform();

        // Wait for the "Sign in" link to be visible
        WebElement subElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(signinbtn));

        subElement.click();

    }

    public void clickLoginbtn(){

        driver.findElement(loginbtn).click();
    }

    public boolean isForgotPwd(){
        return driver.findElement(forgotPwdLink).isDisplayed();
    }

}
