package Pages;

import DriverFactory.DriverFact;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;


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
    private By minutes_input = By.xpath("//*[@id=\"freeFirstConsultationMinutes\"]");
    private By consultation_details_save = By.xpath("//*[@id=\"ConsultationModal\"]/div/div/div[2]/button");
    private By consultation_save_sucess = By.xpath("//*[@id=\"swal2-html-container\"]");
    private By consultation_ok = By.xpath("/html/body/div[2]/div/div[6]/button[1]");
    private By Discounted_radio_btn = By.xpath("//*[@id=\"freeFirstConsultationRadio\"]/div[2]/label");
    private By consultation_fee_input = By.xpath("//*[@id=\"freeFirstConsultationFee\"]");
    private By Offer_Remote_Consultations_checkbox = By.xpath("//*[@id=\"remote_consultation\"]");
    private By Mobile_friendly_checkbox = By.xpath("//*[@id=\"mobile_friendly\"]");
    private By edit_Area_of_interest = By.xpath("//*[@id=\"app\"]/div/div[2]/table/tbody/tr[12]/td[1]/button");
    private By area_interest_drpdwn = By.xpath("//*[@id=\"vs1__combobox\"]/div[1]/input"); //*[@id="vs1__combobox"]/div[1]/input
    private By dropdown_value = By.xpath("  \"//*[@id=\\\"AreaModal\\\"]/div/div/div[2]/button");
    private By profile_picture = By.xpath("//*[@id=\"photo\"]");
    private By upload_btn = By.xpath("/html/body/div/div/div[2]/div[1]/div/form/input[2]");



    public LawyerProfilePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickeditjobtitlebtn() {

        // Wait for the button to be clickable for up to 30 seconds
        WebDriverWait wait = new WebDriverWait(driver, 20);
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

    }

        public void save_consultation()
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

        public void Click_area_of_interest_icon() {
            try {
                WebDriverWait wait = new WebDriverWait(driver, 10);
                wait.until(ExpectedConditions.elementToBeClickable(edit_Area_of_interest));


                // Click on the button using JavaScript
                WebElement element = driver.findElement(edit_Area_of_interest);

                JavascriptExecutor executor = (JavascriptExecutor) driver;
                executor.executeScript("arguments[0].click();", element);
            }
            catch (TimeoutException e) {
                // Handle the timeout exception
                System.out.println("Element is not clickable within the specified time. Skipping the click.");
                // You can choose to log the exception or perform any other necessary actions.
            }
        }
        public void select_dropdown_value() {
        try{
            WebElement dropdown = new WebDriverWait(driver, 5).until(ExpectedConditions.elementToBeClickable(area_interest_drpdwn));
            // Locate the dropdown container
            //WebElement dropdown = driver.findElement(area_interest_drpdwn);
            dropdown.click();
            dropdown.sendKeys("b");
            dropdown.sendKeys(Keys.ENTER);
            driver.findElement(dropdown_value).click();
        }
            catch (TimeoutException e) {
            // Handle the timeout exception
            System.out.println("Element is not clickable within the specified time. Skipping the click.");
            // You can choose to log the exception or perform any other necessary actions.
        }
        }

    public void remote_consultations_CheckboxChecked() {

        WebElement remote_checkbox = new WebDriverWait(driver, 5)
                .until(ExpectedConditions.presenceOfElementLocated(Offer_Remote_Consultations_checkbox));

        if (remote_checkbox.isSelected())
        {
            System.out.println("Checkbox is checked!");
        }
        else
        {
            // Intentionally fail the code
            throw new RuntimeException("Checkbox is not checked, and the code is intentionally failing.");

        }
    }

    public void Mobile_friendly_Checkbox_not_Checked() {

        WebElement checkbox = new WebDriverWait(driver, 5)
                .until(ExpectedConditions.presenceOfElementLocated(Mobile_friendly_checkbox));

        if (!checkbox.isSelected())
        {
            System.out.println("Checkbox is not checked. Clicking the checkbox now.");
            checkbox.click();


            WebElement successmessage = new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(ok_button));
            String actualMessage = successmessage.getText();
            System.out.println(actualMessage);
            String expectedMessage = "OK";
            Assert.assertEquals(expectedMessage, actualMessage, "Verification failed: The values are not equal");
            WebElement ok_btn = new WebDriverWait(driver, 5).until(ExpectedConditions.elementToBeClickable(ok_button));
            ok_btn.click();
        }
        else
        {
            System.out.println("Checkbox is already checked.");
        }
    }
    public void whenTheUserSelectsAndUploadsAPicture() {
        // Update the locator based on the actual attribute of the file input element
        By fileInputLocator = By.xpath("//*[@id=\"photo\"]"); // Update with the correct attribute and value

        // Wait for the file input element to be present
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement fileInput = wait.until(ExpectedConditions.presenceOfElementLocated(fileInputLocator));

        // Specify the file path of the picture you want to upload
        String filePath = "C:\\Users\\Lenovo\\Pictures\\Screenshots\\Screenshot 2023-12-02 021254.png"; // Replace with the actual file path

        // Use the sendKeys method to set the file path in the input field
        fileInput.sendKeys(filePath);

        driver.findElement(upload_btn).click();
        WebElement successmessage = new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(ok_button));
        String actualMessage = successmessage.getText();
        System.out.println(actualMessage);
        String expectedMessage = "OK";
        Assert.assertEquals(expectedMessage, actualMessage, "Verification failed: The values are not equal");
        WebElement ok_btn = new WebDriverWait(driver, 5).until(ExpectedConditions.elementToBeClickable(ok_button));
        ok_btn.click();
}
}