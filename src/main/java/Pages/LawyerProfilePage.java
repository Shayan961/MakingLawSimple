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

    private By edit_job_title_icon = By.xpath("/html/body/div/div/div[2]/table/tbody/tr[4]/td[1]/button");
    private By job_update = By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div[2]/div/input");
    private By job_save_button = By.cssSelector("#Jobtitle > div > div > div.modal-body > div > button");
    private By Job_save_success = By.xpath("//*[@id=\"swal2-html-container\"]");
    private By ok_button = By.xpath("/html/body/div[2]/div/div[6]/button[1]");
    private By edit_law_firmname_icon = By.xpath("/html/body/div/div/div[2]/table/tbody/tr[5]/td[1]/button");
    private By firmname_field = By.xpath("/html/body/div[1]/div/div[2]/div[3]/div/div/div[2]/div/input");
    private By firm_save_button = By.cssSelector("#FirmName > div > div > div.modal-body > div > button");
    private By edit_link_to_website_icon = By.xpath("/html/body/div/div/div[2]/table/tbody/tr[6]/td[1]/button");
    private By link_to_website_field = By.xpath("/html/body/div[1]/div/div[2]/div[4]/div/div/div[2]/div/input");
    private By link_to_website_save_button = By.xpath("/html/body/div[1]/div/div[2]/div[4]/div/div/div[2]/div/button");
    private By edit_about_me_icon = By.xpath("/html/body/div/div/div[2]/table/tbody/tr[8]/td[1]/button");
    private By about_me_field = By.xpath("/html/body/div[1]/div/div[2]/div[7]/div/div/div[2]/div/input");
    private By about_me_save_button = By.xpath("/html/body/div[1]/div/div[2]/div[7]/div/div/div[2]/div/button");
    private By edit_Consultation_icon = By.xpath("//*[@id=\"app\"]/div/div[2]/table/tbody/tr[9]/td[1]/button/i");
    private By consultation_type_free = By.xpath("//*[@id=\"freeFirstConsultationRadio\"]/div[1]");
    private By edit_Area_of_interest = By.xpath("//*[@id=\"app\"]/div/div[2]/table/tbody/tr[12]/td[1]/button");
    private By minutes_input = By.xpath("//*[@id=\"freeFirstConsultationMinutes\"]");
    private By consultation_details_save = By.xpath("//*[@id=\"ConsultationModal\"]/div/div/div[2]/button");
    private By consultation_save_sucess = By.xpath("//*[@id=\"swal2-html-container\"]");
    private By consultation_ok = By.xpath("/html/body/div[2]/div/div[6]/button[1]");
    private By Discounted_radio_btn = By.xpath("//*[@id=\"freeFirstConsultationRadio\"]/div[2]/label");
    private By consultation_fee_input = By.xpath("//*[@id=\"freeFirstConsultationFee\"]");
    private By area_interest_drpdwn = By.xpath("//*[@id=\"vs1__combobox\"]");
    private By edit_state_icon = By.xpath("/html/body/div/div/div[2]/table/tbody/tr[13]/td[1]/button");
    private By click_state_dropdown_icon = By.xpath("/html/body/div[1]/div/div[2]/div[9]/div/div/div[2]/div/div/div[2]");
    private By select_state = By.xpath("/html/body/div[1]/div/div[2]/div[9]/div/div/div[2]/div/div/div[1]/span/text()");

    public LawyerProfilePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickeditjobtitlebtn() {

        // Wait for the button to be clickable for up to 30 seconds
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(edit_job_title_icon));

        // Click on the button using JavaScript
        WebElement element = driver.findElement(edit_job_title_icon);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);

    }

    public void enterjob(String jobname) {

        WebElement jobupdate1 = new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(job_update));
        if (!jobupdate1.getAttribute("value").isEmpty()) {
//            If it's filled, clear the input field
            jobupdate1.clear();
        }
        // try {
        //WebElement usernameElement = new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(job_update));
        System.out.println("Input field is clickable. Entering text: " + jobname);
        jobupdate1.sendKeys(jobname);

        //}
//        catch (Exception e) {
//            System.err.println("Exception while entering job name: " + e.getMessage());
//            // Add additional logging or take screenshots here if needed
//            throw e; // Re-throw the exception to mark the test as failed
//        }
    }

    public void save_job() {

        driver.findElement(job_save_button).click();
        WebElement usernameElement1 = new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(Job_save_success));

        String actualMessage = usernameElement1.getText();
        System.out.println(actualMessage);
        String expectedMessage = "Profile updated successfully";
        Assert.assertEquals(expectedMessage, actualMessage, "Verification failed: The values are not equal");
        WebElement usernameElement3 = new WebDriverWait(driver, 5).until(ExpectedConditions.elementToBeClickable(ok_button));
        usernameElement3.click();
    }

    public void click_law_firmname_icon() {
        // Wait for the button to be clickable for up to 30 seconds
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(edit_law_firmname_icon));

        // Click on the button using JavaScript
        WebElement element = driver.findElement(edit_law_firmname_icon);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);
    }
    public void enter_law_firmname(String firmnamee) {

        WebElement firmname = new WebDriverWait(driver, 15).until(ExpectedConditions.elementToBeClickable(firmname_field));
        if (!firmname.getAttribute("value").isEmpty()) {
//            If it's filled, clear the input field
            firmname.clear();
        }
        // try {
        WebElement usernameElement = new WebDriverWait(driver, 15).until(ExpectedConditions.elementToBeClickable(firmname_field));
        System.out.println("Input field is clickable. Entering text: " + firmnamee);
        usernameElement.sendKeys(firmnamee);

    }

    public void save_firm() {

        driver.findElement(firm_save_button).click();
        WebElement usernameElement1 = new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(Job_save_success));

        String actualMessage = usernameElement1.getText();
        System.out.println(actualMessage);
        String expectedMessage = "Profile updated successfully";
        Assert.assertEquals(expectedMessage, actualMessage, "Verification failed: The values are not equal");
        WebElement usernameElement3 = new WebDriverWait(driver, 5).until(ExpectedConditions.elementToBeClickable(ok_button));
        usernameElement3.click();
    }
    public void click_link_to_website_icon() {
        // Wait for the button to be clickable for up to 30 seconds
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(edit_link_to_website_icon));

        // Click on the button using JavaScript
        WebElement element = driver.findElement(edit_link_to_website_icon);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);
    }
    public void enter_website_link(String websitelink) {

        WebElement weblink = new WebDriverWait(driver, 15).until(ExpectedConditions.elementToBeClickable(link_to_website_field));
        if (!weblink.getAttribute("value").isEmpty()) {
//            If it's filled, clear the input field
            weblink.clear();
        }
        // try {
        WebElement usernameElement = new WebDriverWait(driver, 15).until(ExpectedConditions.elementToBeClickable(link_to_website_field));
        System.out.println("Input field is clickable. Entering text: " + websitelink);
        usernameElement.sendKeys(websitelink);

    }
    public void save_websitelink() {

        driver.findElement(link_to_website_save_button).click();
        WebElement usernameElement1 = new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(Job_save_success));

        String actualMessage = usernameElement1.getText();
        System.out.println(actualMessage);
        String expectedMessage = "Profile updated successfully";
        Assert.assertEquals(expectedMessage, actualMessage, "Verification failed: The values are not equal");
        WebElement usernameElement3 = new WebDriverWait(driver, 5).until(ExpectedConditions.elementToBeClickable(ok_button));
        usernameElement3.click();
    }
    public void click_about_me_icon() {
        // Wait for the button to be clickable for up to 30 seconds
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(edit_about_me_icon));

        // Click on the button using JavaScript
        WebElement element = driver.findElement(edit_about_me_icon);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);
    }
    public void enter_about_me(String about_me) {

        WebElement aboutme = new WebDriverWait(driver, 15).until(ExpectedConditions.elementToBeClickable(about_me_field));
        if (!aboutme.getAttribute("value").isEmpty()) {
//            If it's filled, clear the input field
            aboutme.clear();
        }
        // try {
        WebElement usernameElement = new WebDriverWait(driver, 15).until(ExpectedConditions.elementToBeClickable(about_me_field));
        System.out.println("Input field is clickable. Entering text: " + about_me);
        usernameElement.sendKeys(about_me);

    }
    public void save_about_me() {

        driver.findElement(about_me_save_button).click();
        WebElement usernameElement1 = new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(Job_save_success));

        String actualMessage = usernameElement1.getText();
        System.out.println(actualMessage);
        String expectedMessage = "Profile updated successfully";
        Assert.assertEquals(expectedMessage, actualMessage, "Verification failed: The values are not equal");
        WebElement usernameElement3 = new WebDriverWait(driver, 5).until(ExpectedConditions.elementToBeClickable(ok_button));
        usernameElement3.click();
    }

    public void click_consultation_icon() {// Wait for the button to be clickable for up to 30 seconds
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(edit_Consultation_icon));

        // Click on the button using JavaScript
        WebElement element = driver.findElement(edit_Consultation_icon);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);

    }

    public void enter_consultation_minutes(String minutes) {
        WebElement consu_minutes = new WebDriverWait(driver, 15).until(ExpectedConditions.elementToBeClickable(minutes_input));
        if (!consu_minutes.getAttribute("value").isEmpty()) {
//            If it's filled, clear the input field
            consu_minutes.clear();
        }
        // try {
        // WebElement usernameElement = new WebDriverWait(driver, 15).until(ExpectedConditions.elementToBeClickable(firmname_field));
        System.out.println("Input field is clickable. Entering text: " + minutes);
        consu_minutes.sendKeys(minutes);

        WebElement discounted_radio_butn = new WebDriverWait(driver, 5).until(ExpectedConditions.elementToBeClickable(Discounted_radio_btn));
        discounted_radio_butn.click();


        WebElement consu_fee = new WebDriverWait(driver, 5).until(ExpectedConditions.elementToBeClickable(consultation_fee_input));
        consu_fee.sendKeys("9");
////        if (!consu_fee.getAttribute("value").isEmpty()) {
//////            If it's filled, clear the input field
////            consu_fee.clear();
////            System.out.println("Input fee is clickable. Entering text: " +15);
////            consu_fee.sendKeys("15");
//
//
//        }
    }

        public void save()
        {
            driver.findElement(consultation_details_save).click();
            WebElement successmessage = new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(consultation_save_sucess));

            String actualMessage = successmessage.getText();
            System.out.println(actualMessage);
            String expectedMessage = "Profile updated successfully";
            Assert.assertEquals(expectedMessage, actualMessage, "Verification failed: The values are not equal");
            WebElement ok_btn = new WebDriverWait(driver, 5).until(ExpectedConditions.elementToBeClickable(consultation_ok));
            ok_btn.click();
        }

        public void Click_area_of_interest_icon()
        {
            WebDriverWait wait = new WebDriverWait(driver, 10);
            wait.until(ExpectedConditions.elementToBeClickable(edit_Area_of_interest));


            // Click on the button using JavaScript
             WebElement element = driver.findElement(edit_Area_of_interest);

            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", element);
        }
    public void Click_edit_state_icon()
    {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(edit_state_icon));


        // Click on the button using JavaScript
        WebElement element = driver.findElement(edit_state_icon);

        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);
    }
    public void click_state_dropdown_icon()
    {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(click_state_dropdown_icon));


        // Click on the button using JavaScript
        WebElement element = driver.findElement(click_state_dropdown_icon);

        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);

    }

    }
