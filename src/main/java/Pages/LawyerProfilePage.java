package Pages;

import DriverFactory.DriverFact;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


public class LawyerProfilePage {
    private WebDriver driver;

    private By edit_job_title_btn = By.xpath("/html/body/div/div/div[2]/table/tbody/tr[4]/td[1]/button");
    private By job_update= By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div[2]/div/input");
    private By job_save_button = By.cssSelector("#Jobtitle > div > div > div.modal-body > div > button");
    private By Job_save_success = By.xpath("//*[@id=\"swal2-html-container\"]");
    public LawyerProfilePage(WebDriver driver)
    {
        this.driver= driver;
    }
    public void clickeditjobtitlebtn() {

        // Wait for the button to be clickable for up to 30 seconds
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(edit_job_title_btn));

        // Click on the button using JavaScript
        WebElement element = driver.findElement(edit_job_title_btn);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);

    }
    public void enterjob(String jobname)
    {

        WebElement jobupdate1 = new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(job_update));
      if (!jobupdate1.getAttribute("value").isEmpty()) {
//            If it's filled, clear the input field
          jobupdate1.clear();
        }
       // try {
            WebElement usernameElement = new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(job_update));
            System.out.println("Input field is clickable. Entering text: " + jobname);
            usernameElement.sendKeys(jobname);

        //}
//        catch (Exception e) {
//            System.err.println("Exception while entering job name: " + e.getMessage());
//            // Add additional logging or take screenshots here if needed
//            throw e; // Re-throw the exception to mark the test as failed
//        }
    }

    public void save_job()
    {

        driver.findElement(job_save_button).click();
        WebElement usernameElement1= new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(Job_save_success));

        String actualMessage = usernameElement1.getText();
        System.out.println(actualMessage);
        String expectedMessage = "Profile updated successfully";
        Assert.assertEquals(expectedMessage, actualMessage, "Verification failed: The values are not equal");
        driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();



    }


}
