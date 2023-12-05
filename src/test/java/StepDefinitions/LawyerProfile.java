package StepDefinitions;

import DriverFactory.DriverFact;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import Pages.LawyerProfilePage;
public class LawyerProfile {

    private static String Title;
    private LawyerProfilePage lawyer =  new LawyerProfilePage(DriverFact.getDriver());

    @Given("user is on lawyerprofile page")
    public void user_is_on_lawyerprofile_page() {
        DriverFact.getDriver().get("https://makinglawsimple.staginganideos.com/lawyer-profile");
    }
    @When("user enter job title")
    public void user_enter_job_title() {
       lawyer.clickeditjobtitlebtn();
    }


}
